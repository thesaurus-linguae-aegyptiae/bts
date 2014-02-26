package org.bbaw.bts.core.controller.impl.generalController;

import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class EditingDomainControllerImpl implements EditingDomainController {
	private static final String FALSE = "false";

	private static final String TRUE = "true";

	@Optional
	@Named(IServiceConstants.ACTIVE_SELECTION)
	private Object selection;
	@Inject
	private IEclipseContext context;
	private IEclipseContext workbenchContext;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private CommandStackListener commandStackListener;

	@Inject
	public EditingDomainControllerImpl(IEclipseContext ctx) {
		declareModifiableVariables(ctx);
	}

	private void declareModifiableVariables(IEclipseContext ctx) {
		MApplication application = ctx.get(MApplication.class);
		workbenchContext = application.getContext();
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_CAN_UNDO);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_CAN_REDO);

	}

	@Override
	public EditingDomain getEditingDomain(Object object) {
		if (!(object instanceof EObject)) {
			return null;
		}
		BTSDBBaseObject parentDBBaseObject = null;
		if (object instanceof BTSDBBaseObject) {
			parentDBBaseObject = (BTSDBBaseObject) object;
		} else {
			parentDBBaseObject = findRecursivelyParent((EObject) object);
		}
		Map<Object, EditingDomain> map = getObjectsEditingDomainMap();
		EditingDomain domain = null;
		if (!map.containsKey(parentDBBaseObject)) {
			domain = new AdapterFactoryEditingDomain(adapterFactory,
					new BasicCommandStack());
			map.put(parentDBBaseObject, domain);
		} else {
			domain = map.get(parentDBBaseObject);
		}
		processLastSelectedObjects(map, parentDBBaseObject);

		return domain;
	}

	private BTSDBBaseObject findRecursivelyParent(EObject object) {
		if (object.eContainer() == null) {
			return null;
		} else {
			if (object.eContainer() instanceof BTSDBBaseObject) {
				return (BTSDBBaseObject) object.eContainer();
			} else {
				return findRecursivelyParent(object.eContainer());
			}
		}
	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (selection != null && !selection.equals(this.selection)
				&& selection instanceof EObject) {
			EditingDomain ed = null;
			if (this.selection != null && this.selection instanceof EObject) {
				ed = getEditingDomain((EObject) this.selection);
				if (ed != null) {
					ed.getCommandStack().removeCommandStackListener(
							getCommandStackListener());
				}
			}
			this.selection = selection;
			evaluateUndoRedo();
			ed = getEditingDomain((EObject) selection);
			if (ed != null) {
				ed.getCommandStack().addCommandStackListener(
						getCommandStackListener());
			}
		}
	}

	private CommandStackListener getCommandStackListener() {
		if (commandStackListener == null) {
			commandStackListener = new CommandStackListener() {

				@Override
				public void commandStackChanged(EventObject event) {
					evaluateUndoRedo();

				}

			};
		}
		return commandStackListener;
	}

	private void evaluateUndoRedo() {
		EditingDomain ed = getEditingDomain((EObject) selection);
		if (ed != null) {
			String canUndo = (String) context
					.get(BTSCoreConstants.CORE_EXPRESSION_CAN_UNDO);
			if (canUndo == null) {
				canUndo = FALSE;
			}
			boolean can = canUndo.equals(TRUE);
			if (ed.getCommandStack().canUndo() != can) {
				if (ed.getCommandStack().canUndo()) {

					workbenchContext.modify(
							BTSCoreConstants.CORE_EXPRESSION_CAN_UNDO, TRUE);
				} else {
					workbenchContext.modify(
							BTSCoreConstants.CORE_EXPRESSION_CAN_UNDO, FALSE);
				}
			}
			String canRedo = (String) context
					.get(BTSCoreConstants.CORE_EXPRESSION_CAN_REDO);
			if (canRedo == null) {
				canRedo = FALSE;
			}
			can = canRedo.equals(TRUE);
			if (ed.getCommandStack().canRedo() != can) {
				if (ed.getCommandStack().canRedo()) {
					workbenchContext.modify(
							BTSCoreConstants.CORE_EXPRESSION_CAN_REDO,
							TRUE);
				} else {
					workbenchContext.modify(
							BTSCoreConstants.CORE_EXPRESSION_CAN_REDO,
							FALSE);
				}
			}
		}

	}

	private void processLastSelectedObjects(Map<Object, EditingDomain> map,
			Object object) {
		List<Object> lastSelectedObjects = getLastSelectedObjects();
		int index = lastSelectedObjects.indexOf(object);
		if (index == BTSCoreConstants.LAST_SELECTED_LIST_SIZE - 1) {
			// selected object is last selected one
			return;
		} else if (index == -1) // list does not contain object
		{
			lastSelectedObjects.add(object);
			if (lastSelectedObjects.size() > BTSCoreConstants.LAST_SELECTED_LIST_SIZE) {
				Object old = lastSelectedObjects.remove(0);
				map.remove(old);
			}
		} else {
			lastSelectedObjects.remove(index);
			lastSelectedObjects.add(object);
		}

	}

	@Override
	public List<Object> getLastSelectedObjects() {
		List<Object> l = (List<Object>) context
				.get(BTSCoreConstants.LAST_SELECTED_OBJECTS_LIST);
		if (l == null) {
			l = new Vector<Object>(BTSCoreConstants.LAST_SELECTED_LIST_SIZE);
			context.set(BTSCoreConstants.LAST_SELECTED_OBJECTS_LIST, l);
		}
		return l;
	}

	private Map<Object, EditingDomain> getObjectsEditingDomainMap() {
		Map m = (Map) context.get(BTSCoreConstants.OBJECTS_EDITING_DOMAIN_MAP);
		if (m == null) {
			m = new HashMap<Object, EditingDomain>(
					BTSCoreConstants.LAST_SELECTED_LIST_SIZE);
			context.set(BTSCoreConstants.OBJECTS_EDITING_DOMAIN_MAP, m);
		}
		return m;
	}

}
