/**
 */
package CorpusDTDneu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TC Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CorpusDTDneu.TCTextType#getTCPassport <em>TC Passport</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getTCPicture <em>TC Picture</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getTCNotebook <em>TC Notebook</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getEgyTxt <em>Egy Txt</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getAuthor <em>Author</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getBearbeitungsstand <em>Bearbeitungsstand</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getTCName <em>TC Name</em>}</li>
 *   <li>{@link CorpusDTDneu.TCTextType#getTextID <em>Text ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType()
 * @model extendedMetaData="name='TCText_._type' kind='elementOnly'"
 * @generated
 */
public interface TCTextType extends EObject {
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCPassport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TCPassport' namespace='##targetNamespace'"
	 * @generated
	 */
	TCPassportType getTCPassport();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getTCPassport <em>TC Passport</em>}' containment reference.
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCPicture()
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCNotebook()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TCNotebook' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTCNotebook();

	/**
	 * Returns the value of the '<em><b>Egy Txt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egy Txt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egy Txt</em>' containment reference.
	 * @see #setEgyTxt(EgyTxtType)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_EgyTxt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EgyTxt' namespace='##targetNamespace'"
	 * @generated
	 */
	EgyTxtType getEgyTxt();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getEgyTxt <em>Egy Txt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Egy Txt</em>' containment reference.
	 * @see #getEgyTxt()
	 * @generated
	 */
	void setEgyTxt(EgyTxtType value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Author' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getAuthor();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Object value);

	/**
	 * Returns the value of the '<em><b>Bearbeitungsstand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bearbeitungsstand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearbeitungsstand</em>' attribute.
	 * @see #setBearbeitungsstand(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_Bearbeitungsstand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='Bearbeitungsstand' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBearbeitungsstand();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getBearbeitungsstand <em>Bearbeitungsstand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitungsstand</em>' attribute.
	 * @see #getBearbeitungsstand()
	 * @generated
	 */
	void setBearbeitungsstand(String value);

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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_SortKey()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='SortKey' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSortKey();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}' attribute.
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
	 * Unsets the value of the '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortKey()
	 * @see #getSortKey()
	 * @see #setSortKey(Object)
	 * @generated
	 */
	void unsetSortKey();

	/**
	 * Returns whether the value of the '{@link CorpusDTDneu.TCTextType#getSortKey <em>Sort Key</em>}' attribute is set.
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
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TCName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='TCName' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTCName();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getTCName <em>TC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TC Name</em>' attribute.
	 * @see #getTCName()
	 * @generated
	 */
	void setTCName(Object value);

	/**
	 * Returns the value of the '<em><b>Text ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text ID</em>' attribute.
	 * @see #setTextID(String)
	 * @see CorpusDTDneu.CorpusDTDneuPackage#getTCTextType_TextID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='TextID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextID();

	/**
	 * Sets the value of the '{@link CorpusDTDneu.TCTextType#getTextID <em>Text ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text ID</em>' attribute.
	 * @see #getTextID()
	 * @generated
	 */
	void setTextID(String value);

} // TCTextType
