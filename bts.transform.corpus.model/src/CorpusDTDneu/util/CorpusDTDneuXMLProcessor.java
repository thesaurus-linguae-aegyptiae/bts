/**
 */
package CorpusDTDneu.util;

import CorpusDTDneu.CorpusDTDneuPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CorpusDTDneuXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorpusDTDneuXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, CorpusDTDneuPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CorpusDTDneuResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CorpusDTDneuResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CorpusDTDneuResourceFactoryImpl());
		}
		return registrations;
	}

} //CorpusDTDneuXMLProcessor
