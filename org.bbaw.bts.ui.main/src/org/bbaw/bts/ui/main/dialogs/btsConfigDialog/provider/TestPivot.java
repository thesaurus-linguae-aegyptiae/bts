//package org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider;
//
///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import java.io.IOException;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EAnnotation;
//import org.eclipse.emf.ecore.EAttribute;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EFactory;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EOperation;
//import org.eclipse.emf.ecore.EPackage;
//import org.eclipse.emf.ecore.EReference;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.emf.ecore.EcoreFactory;
//import org.eclipse.emf.ecore.EcorePackage;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
//import org.eclipse.ocl.examples.pivot.delegate.OCLInvocationDelegateFactory;
//import org.eclipse.ocl.examples.pivot.delegate.OCLSettingDelegateFactory;
//import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
//import org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCLStandaloneSetup;
//
///**
// * 
// * @author khurrams
// */
//public class TestPivot {
//	private EPackage modelPackage = null;
//	private EClass eClass = null;
//	private EClass eClass1 = null;
//	private EAttribute eAttribute = null;
//	private EAttribute eAttribute1 = null;
//	private EFactory iModelPackage = null;
//	private EObject eObject = null;
//	private String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
//	private ResourceSet ecoreResourceSet;
//	private ResourceSet xmiResourceSet;
//
//	public TestPivot() {
//		EssentialOCLStandaloneSetup.doSetup();
//		OCLstdlib.install();
//		org.eclipse.ocl.examples.pivot.OCL.initialize(null);
//		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
//				oclDelegateURI, new OCLInvocationDelegateFactory.Global());
//		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
//				.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
//		makeMataModel();
//		createModel();
//	}
//
//	private void makeMataModel() {
//		modelPackage = EcoreFactory.eINSTANCE.createEPackage();
//		modelPackage.setName("temp");
//		modelPackage.setNsPrefix("Test");
//		modelPackage
//				.setNsURI("http://www.eclipse.org/mdt/ocl/oclinecore/tutorial");
//		EAnnotation mainOCLAnnotation = EcoreFactory.eINSTANCE
//				.createEAnnotation();
//		mainOCLAnnotation.setSource("http://www.eclipse.org/emf/2002/Ecore");
//		mainOCLAnnotation.getDetails().put("invocationDelegates",
//				oclDelegateURI);
//		mainOCLAnnotation.getDetails().put("settingDelegates", oclDelegateURI);
//		mainOCLAnnotation.getDetails().put("validationDelegates",
//				oclDelegateURI);
//		modelPackage.getEAnnotations().add(mainOCLAnnotation);
//		eClass = EcoreFactory.eINSTANCE.createEClass();
//		eClass.setName("TestClass");
//		eAttribute = EcoreFactory.eINSTANCE.createEAttribute();
//		eAttribute.setName("test");
//		eAttribute.setUpperBound(1);
//		eAttribute.setLowerBound(1);
//		eAttribute.setEType(EcorePackage.eINSTANCE.getELongObject());
//		eAttribute.setDerived(true);
//		eAttribute.setVolatile(true);
//		EAnnotation driveAnnotation = EcoreFactory.eINSTANCE
//				.createEAnnotation();
//		driveAnnotation.setSource(oclDelegateURI);
//		driveAnnotation.getDetails().put("derivation", "2*2");
//		eAttribute.getEAnnotations().add(driveAnnotation);
//		eClass.getEStructuralFeatures().add(eAttribute);
//
//		eClass1 = EcoreFactory.eINSTANCE.createEClass();
//		eClass1.setName("TestClass1");
//		eAttribute1 = EcoreFactory.eINSTANCE.createEAttribute();
//		eAttribute1.setName("test1");
//		eAttribute1.setUpperBound(1);
//		eAttribute1.setLowerBound(1);
//		eAttribute1.setEType(EcorePackage.eINSTANCE.getELongObject());
//		eAttribute1.setDerived(true);
//		eAttribute1.setVolatile(true);
//		EAnnotation driveAnnotation1 = EcoreFactory.eINSTANCE
//				.createEAnnotation();
//		driveAnnotation1.setSource(oclDelegateURI);
//		driveAnnotation1.getDetails().put("derivation", "");
//		eAttribute1.getEAnnotations().add(driveAnnotation1);
//		eClass1.getEStructuralFeatures().add(eAttribute1);
//
//		EReference ePTCRef = EcoreFactory.eINSTANCE.createEReference();
//		ePTCRef.setName("ptc");
//		ePTCRef.setLowerBound(1);
//		ePTCRef.setUpperBound(1);
//		ePTCRef.setResolveProxies(true);
//		ePTCRef.setEType(eClass);
//
//		EReference eCTPRef = EcoreFactory.eINSTANCE.createEReference();
//		eCTPRef.setName("ctp");
//		eCTPRef.setLowerBound(1);
//		eCTPRef.setUpperBound(1);
//		eCTPRef.setResolveProxies(true);
//		eCTPRef.setEType(eClass1);
//
//		ePTCRef.setResolveProxies(true);
//		eCTPRef.setResolveProxies(true);
//		// /////
//		ePTCRef.setEOpposite(eCTPRef);
//		eCTPRef.setEOpposite(ePTCRef);
//
//		eClass.getEStructuralFeatures().add(eCTPRef);
//		eClass1.getEStructuralFeatures().add(ePTCRef);
//
//		modelPackage.getEClassifiers().add(eClass);
//		modelPackage.getEClassifiers().add(eClass1);
//		URI uri1 = URI.createFileURI("test.ecore");
//		ecoreResourceSet = new ResourceSetImpl();
//		ecoreResourceSet.getResourceFactoryRegistry()
//				.getExtensionToFactoryMap()
//				.put("ecore", new EcoreResourceFactoryImpl());
//		Resource resource = ecoreResourceSet.createResource(uri1);
//		resource.getContents().add(modelPackage);
//		try {
//			resource.save(null);
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//
//	}
//
//	public void useDelegates() {
//
//		Object eGet = eObject.eGet(eAttribute, false);
//		System.out.println("value = " + eGet.toString());
//
//	}
//
//	private void createModel() {
//		iModelPackage = modelPackage.getEFactoryInstance();
//		eObject = iModelPackage.create(eClass);
//		URI uri = URI.createFileURI("test.xmi");
//		xmiResourceSet = new ResourceSetImpl();
//		xmiResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put("xmi", new XMIResourceFactoryImpl());
//		Resource resource = xmiResourceSet.createResource(uri);
//		resource.getContents().add(iModelPackage);
//		resource.getContents().add(eObject);
//
//	}
//
//	public static void main(String args[]) {
//
//		// EssentialOCLStandaloneSetup.doSetup();
//		// OCLstdlib.install();
//
//		TestPivot tp = new TestPivot();
//		// tp.evaluate();
//		tp.useDelegates();
//	}
//
//	public EClass getClassifierForContext() {
//		return eClass1;
//	}
//
//}
