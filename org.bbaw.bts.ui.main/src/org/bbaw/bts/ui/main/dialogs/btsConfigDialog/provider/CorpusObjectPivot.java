package org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCLStandaloneSetup;

/**
 * 
 * @author khurrams
 */
public class CorpusObjectPivot {
	private EAttribute eAttribute = null;
	private EObject eObject = null;
	private String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
	private BTSCorpusObject corpusObject;

	public CorpusObjectPivot(BTSCorpusObject corpusObject) {
		this.corpusObject = corpusObject;
		EssentialOCLStandaloneSetup.doSetup();
		OCLstdlib.install();
		org.eclipse.ocl.examples.pivot.OCL.initialize(null);
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				oclDelegateURI, new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
		makeMataModel();
		// createModel();
	}

	private void makeMataModel() {

	}

	public void useDelegates() {

		Object eGet = eObject.eGet(eAttribute, false);
		System.out.println("value = " + eGet.toString());

	}

	// private void createModel() {
	// iModelPackage = modelPackage.getEFactoryInstance();
	// eObject = iModelPackage.create(eClass);
	// URI uri = URI.createFileURI("test.xmi");
	// xmiResourceSet = new ResourceSetImpl();
	// xmiResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
	// .put("xmi", new XMIResourceFactoryImpl());
	// Resource resource = xmiResourceSet.createResource(uri);
	// resource.getContents().add(iModelPackage);
	// resource.getContents().add(eObject);
	//
	// }

	public static void main(String args[]) {

		// EssentialOCLStandaloneSetup.doSetup();
		// OCLstdlib.install();

		CorpusObjectPivot tp = new CorpusObjectPivot(null);
		// tp.evaluate();
		tp.useDelegates();
	}

	public EClass getClassifierForContext() {
		return corpusObject.eClass();
	}

}
