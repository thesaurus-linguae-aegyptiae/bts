 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSPassportEntryGroup;
import org.bbaw.bts.btsmodel.BTSPassportEntryItem;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.swt.widgets.Shell;

public class PassportInheritFromParentHandler {
	private boolean forced;
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection,
			CorpusNavigatorController corpusNavigatorController) {
		BTSCorpusObject parent = null;
		
		for (BTSRelation rel : selection.getRelations())
		{
			if (rel.getObjectId() != null && !"".equals(rel.getObjectId()) && BTSCoreConstants.BASIC_RELATIONS_PARTOF.equals(rel.getType()))
			{
				String id = rel.getObjectId();
				parent = corpusNavigatorController.findObject(id);
				if (parent != null)
				{
					inheritPassportData(selection, parent);
				}
			}
		}
		System.out.println(selection.getPassport());

	}
	private void inheritPassportData(BTSCorpusObject selection,
			BTSCorpusObject parent) {
		BTSPassport target = selection.getPassport();
		BTSPassport source = parent.getPassport();
		
		for (BTSPassportEntry sourceEntry : source.getChildren())
		{
			BTSPassportEntry targetEntry = getTargetEntryFromPassport(target, sourceEntry);
			inheritDataRecursivly(targetEntry, sourceEntry);
		}
		
	}
	private void inheritDataRecursivly(BTSPassportEntry targetEntry,
			BTSPassportEntry sourceEntry) {
		for (BTSPassportEntry sourceSubEntry : sourceEntry.getChildren())
		{
			BTSPassportEntry targetSubEntry = getTargetEntry(targetEntry, sourceSubEntry);
			inheritDataRecursivly(targetEntry, sourceSubEntry);
		}
		if (sourceEntry instanceof BTSPassportEntryItem && targetEntry instanceof BTSPassportEntryItem)
		{
			inheritData((BTSPassportEntryItem) targetEntry, (BTSPassportEntryItem)  sourceEntry);
		}
		
	}
	private void inheritData(BTSPassportEntryItem targetEntry,
			BTSPassportEntryItem sourceEntry) {
		for (EAttribute attr : targetEntry.eClass().getEAllAttributes())
		{
			mergeAttributeContent(targetEntry, sourceEntry, attr);
		}
		
		for (EReference ref : targetEntry.eClass().getEAllReferences())
		{
			mergeReferenceContent(targetEntry, sourceEntry, ref);
		}
		
	}
	private void mergeReferenceContent(BTSPassportEntryItem targetEntry,
			BTSPassportEntryItem sourceEntry, EReference ref) {
		Object value = sourceEntry.eGet(ref);
		if (forced)
		{
			targetEntry.eSet(ref, value);
		}
		else if (!targetEntry.eIsSet(ref))
		{
			targetEntry.eSet(ref, value);
		}
		
	}
	private void mergeAttributeContent(BTSPassportEntryItem targetEntry,
			BTSPassportEntryItem sourceEntry, EAttribute attr) {
		Object value = sourceEntry.eGet(attr);
		if (forced)
		{
			targetEntry.eSet(attr, value);
		}
		else if (!targetEntry.eIsSet(attr))
		{
			targetEntry.eSet(attr, value);
		}
		
	}
	private BTSPassportEntry getTargetEntry(BTSPassportEntry targetEntry,
			BTSPassportEntry sourceSubEntry) {
		BTSPassportEntry targetSubEntry = null;
		for (BTSPassportEntry e : targetEntry.getChildren())
		{
			if (e.getType() != null && e.getType().equals(sourceSubEntry.getType()))
			{
				return e;
			}
		}
		if (sourceSubEntry instanceof BTSPassportEntryGroup)
		{
			targetSubEntry = BtsmodelFactory.eINSTANCE.createBTSPassportEntryGroup();
		}
		else
		{
			targetSubEntry = BtsmodelFactory.eINSTANCE.createBTSPassportEntryItem();
		}
		targetSubEntry.setType(sourceSubEntry.getType());
		targetEntry.getChildren().add(targetSubEntry);
		return targetSubEntry;
	}
	private BTSPassportEntry getTargetEntryFromPassport(BTSPassport target,
			BTSPassportEntry sourceEntry) {
		BTSPassportEntry targetEntry = null;
		for (BTSPassportEntry e : target.getChildren())
		{
			
			if (e.getType() != null && e.getType().equals(sourceEntry.getType()))
			{
				return e;
			}
		}
		targetEntry = BtsmodelFactory.eINSTANCE.createBTSPassportEntryGroup();
		targetEntry.setType(sourceEntry.getType());
		target.getChildren().add(targetEntry);
		return targetEntry;
	}
	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection) {
		if (selection != null && selection instanceof BTSCorpusObject && !selection.getRelations().isEmpty()) {
			return true;
		}
		return false;
	}
	
	
}