/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.DateType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link CorpusDTDneu.DateType#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.DateType#getDateThs <em>Date Ths</em>}</li>
 *   <li>{@link CorpusDTDneu.DateType#getCode <em>Code</em>}</li>
 *   <li>{@link CorpusDTDneu.DateType#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateType()
 * @model extendedMetaData="name='Date_._type' kind='mixed'"
 * @generated
 */
public interface DateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Date Ths</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.DateThsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Ths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Ths</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateType_DateThs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateThs' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<DateThsType> getDateThs();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateType_Code()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Code' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<String> getCode();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getDateType_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<String> getComment();

} // DateType
