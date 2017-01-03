/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Arrangement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getTCPassport <em>TC Passport</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getTCPicture <em>TC Picture</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getTCNotebook <em>TC Notebook</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getGroup <em>Group</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getTCArrangement <em>TC Arrangement</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getTCObject <em>TC Object</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link CorpusDTDneu.TCArrangementType#getTCName <em>TC Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType()
 * @model extendedMetaData="name='TCArrangement_._type' kind='elementOnly'"
 * @generated
 */
public interface TCArrangementType extends EObject {
	/**
	 * Returns the value of the '<em><b>TC Passport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Passport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Passport</em>' containment reference.
	 * @see #setTCPassport(TCPassportType)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_TCPassport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TCPassport' namespace='##targetNamespace'"
	 * @generated
	 */
	TCPassportType getTCPassport();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCArrangementType#getTCPassport <em>TC Passport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TC Passport</em>' containment reference.
	 * @see #getTCPassport()
	 * @generated
	 */
	void setTCPassport(TCPassportType value);

	/**
	 * Returns the value of the '<em><b>TC Picture</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCPictureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Picture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Picture</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_TCPicture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TCPicture' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCPictureType> getTCPicture();

	/**
	 * Returns the value of the '<em><b>TC Notebook</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Notebook</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Notebook</em>' attribute list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_TCNotebook()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TCNotebook' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTCNotebook();

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>TC Arrangement</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCArrangementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Arrangement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Arrangement</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_TCArrangement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCArrangement' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<TCArrangementType> getTCArrangement();

	/**
	 * Returns the value of the '<em><b>TC Object</b></em>' containment reference list.
	 * The list contents are of type {@link CorpusDTDneu.TCObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Object</em>' containment reference list.
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_TCObject()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TCObject' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<TCObjectType> getTCObject();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Author' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAuthor();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCArrangementType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Object value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #isSetSortKey()
	 * @see #unsetSortKey()
	 * @see #setSortKey(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_SortKey()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='SortKey' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSortKey();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCArrangementType#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #isSetSortKey()
	 * @see #unsetSortKey()
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(Object value);

	/**
	 * Unsets the value of the '{@link CorpusDTDneu.TCArrangementType#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortKey()
	 * @see #getSortKey()
	 * @see #setSortKey(Object)
	 * @generated
	 */
	void unsetSortKey();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.TCArrangementType#getSortKey <em>Sort Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Key</em>' attribute is set.
	 * @see #unsetSortKey()
	 * @see #getSortKey()
	 * @see #setSortKey(Object)
	 * @generated
	 */
	boolean isSetSortKey();

	/**
	 * Returns the value of the '<em><b>TC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TC Name</em>' attribute.
	 * @see #setTCName(Object)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCArrangementType_TCName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='TCName' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTCName();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCArrangementType#getTCName <em>TC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TC Name</em>' attribute.
	 * @see #getTCName()
	 * @generated
	 */
	void setTCName(Object value);

} // TCArrangementType
