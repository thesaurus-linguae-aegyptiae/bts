 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/** Handles command <code>org.bbaw.bts.ui.corpus.command.passportInheritFromParent</code>
 * and copies all passport data from parent object passport into current object passport.
 * if <code>forced = true</code> than values will be overridden.
 * Handler uses editing domain.
 * @author plutte
 *
 */
public class PassportInheritFromParentHandler {
	private boolean forcedBoolean;
	private EditingDomain editingDomain;
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection,
			CorpusNavigatorController corpusNavigatorController, 
			@Optional @Named("org.bbaw.bts.ui.corpus.command.passportInheritFromParent.forced")String forced,
			EditingDomainController editingDomainController) {
		this.editingDomain = editingDomainController.getEditingDomain(selection);
		BTSCorpusObject parent = null;
		if (forced != null && "true".equals(forced))
		{
			forcedBoolean = true;
		}
		else
		{
			forcedBoolean = false;
		}
		for (BTSRelation rel : selection.getRelations())
		{
			if (rel.getObjectId() != null && !"".equals(rel.getObjectId()) && BTSCoreConstants.BASIC_RELATIONS_PARTOF.equals(rel.getType()))
			{
				String id = rel.getObjectId();
				parent = corpusNavigatorController.find(id, null);
				if (parent != null)
				{
					inheritPassportData(selection, parent);
					break;
				}
			}
		}
		System.out.println(selection.getPassport());

	}
	private void inheritPassportData(BTSCorpusObject selection,
			BTSCorpusObject parent) {
		BTSPassport target = selection.getPassport();
		BTSPassport source = parent.getPassport();
		
		CompoundCommand compoundCommand = new CompoundCommand();
		
		for (BTSPassportEntry sourceEntry : source.getChildren())
		{
			BTSPassportEntry targetEntry = getTargetEntryFromPassport(target, sourceEntry, compoundCommand);
			inheritDataRecursivly(targetEntry, sourceEntry, compoundCommand);
		}
		if (!compoundCommand.isEmpty())
		{
//			System.out.println("number of commands " + compoundCommand.getCommandList().size());
			editingDomain.getCommandStack().execute(compoundCommand);
		}
	}
	private void inheritDataRecursivly(BTSPassportEntry targetEntry,
			BTSPassportEntry sourceEntry, CompoundCommand compoundCommand) {
		for (BTSPassportEntry sourceSubEntry : sourceEntry.getChildren())
		{
			BTSPassportEntry targetSubEntry = getTargetEntry(targetEntry, sourceSubEntry, compoundCommand);
			inheritDataRecursivly(targetSubEntry, sourceSubEntry, compoundCommand);
		}
		if (sourceEntry instanceof BTSPassportEntryItem && targetEntry instanceof BTSPassportEntryItem)
		{
			inheritData((BTSPassportEntryItem) targetEntry, (BTSPassportEntryItem)  sourceEntry, compoundCommand);
		}
		
	}
	private void inheritData(BTSPassportEntryItem targetEntry,
			BTSPassportEntryItem sourceEntry, CompoundCommand compoundCommand) {
		for (EAttribute attr : targetEntry.eClass().getEAllAttributes())
		{
			if (filterAttributes(attr.getName()))
			{
				mergeAttributeContent(targetEntry, sourceEntry, attr, compoundCommand);
			}
		}
		
		for (EReference ref : targetEntry.eClass().getEAllReferences())
		{
			mergeReferenceContent(targetEntry, sourceEntry, ref, compoundCommand);
		}
		
	}
	private boolean filterAttributes(String name) {
		if ("_id".equals(name) || "_rev".equals(name))
		{
			return false;
		}
		return true;
	}
	private void mergeReferenceContent(BTSPassportEntryItem targetEntry,
			BTSPassportEntryItem sourceEntry, EReference ref, CompoundCommand compoundCommand) {
		Object value = sourceEntry.eGet(ref);
		if (value != null)
		{
			if (forcedBoolean)
			{
				targetEntry.eSet(ref, value);
			}
			else if (!targetEntry.eIsSet(ref))
			{
				targetEntry.eSet(ref, value);
			}
		}
	}
	private void mergeAttributeContent(BTSPassportEntryItem targetEntry,
			BTSPassportEntryItem sourceEntry, EAttribute attr, CompoundCommand compoundCommand) {
		Object value = sourceEntry.eGet(attr);
//		System.out.println("merge Attr. attr name: " + attr.getName() + ", val:  " + value + ",  attr.getFeatureID() " +  attr.getFeatureID());
		if (value != null)
		{
			if (forcedBoolean)
			{
				Command setCommand = SetCommand.create(editingDomain, targetEntry, getFeature(attr.getFeatureID()), value);
				compoundCommand.append(setCommand);
			}
			else if (!targetEntry.eIsSet(attr))
			{
				Command setCommand = SetCommand.create(editingDomain, targetEntry, getFeature(attr.getFeatureID()), value);
				compoundCommand.append(setCommand);
			}
		}
	}
	private Object getFeature(int featureID) {
		
		switch (featureID)
		{
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__KEY:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Key();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__COMMENT:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Comment();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__LABEL:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Label();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__NAME:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Name();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__PROVIDER:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Provider();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__TYPE:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Type();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY__VALUE:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value();

			
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUBTYPE:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntryItem_Subtype();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntryItem_SubValue();
			
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntryItem_Description();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntryItem_ExternalReferences();
			
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TIMESPAN:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntryItem_Timespan();
		case BtsCorpusModelPackage.BTS_PASSPORT_ENTRY_ITEM__TRANSLATION:
			return BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntryItem_Translation();
		}
		return null;
	}
	private BTSPassportEntry getTargetEntry(BTSPassportEntry targetEntry,
			BTSPassportEntry sourceSubEntry, CompoundCommand compoundCommand) {
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
			targetSubEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
		}
		else
		{
			targetSubEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryItem();
		}
		targetSubEntry.setType(sourceSubEntry.getType());
		Command addCommand = AddCommand.create(editingDomain, targetEntry, BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Children(), targetSubEntry);
		compoundCommand.append(addCommand);
		return targetSubEntry;
	}
	private BTSPassportEntry getTargetEntryFromPassport(BTSPassport target,
			BTSPassportEntry sourceEntry, CompoundCommand compoundCommand) {
		BTSPassportEntry targetEntry = null;
		for (BTSPassportEntry e : target.getChildren())
		{
			
			if (e.getType() != null && e.getType().equals(sourceEntry.getType()))
			{
				return e;
			}
		}
		targetEntry = BtsCorpusModelFactory.eINSTANCE.createBTSPassportEntryGroup();
		targetEntry.setType(sourceEntry.getType());
		Command addCommand = AddCommand.create(editingDomain, target, BtsCorpusModelPackage.eINSTANCE.getBTSPassport_Children(), targetEntry);
		compoundCommand.append(addCommand);
		return targetEntry;
	}
	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection,
			@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) Boolean mayEdit) {
		if (mayEdit != null && mayEdit.booleanValue() && selection != null && selection instanceof BTSCorpusObject && !selection.getRelations().isEmpty()) {
			return true;
		}
		return false;
	}
}