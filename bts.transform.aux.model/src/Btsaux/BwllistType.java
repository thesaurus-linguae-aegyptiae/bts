/**
 */
package Btsaux;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bwllist Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Btsaux.BwllistType#getArbVermerk <em>Arb Vermerk</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getHsort <em>Hsort</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getKommentar <em>Kommentar</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getLabel <em>Label</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getLemma <em>Lemma</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getLock <em>Lock</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getLsort <em>Lsort</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getRedaction <em>Redaction</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getRstatus <em>Rstatus</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc00 <em>Sc00</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc01 <em>Sc01</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc02 <em>Sc02</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc03 <em>Sc03</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc04 <em>Sc04</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc05 <em>Sc05</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc06 <em>Sc06</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc07 <em>Sc07</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc08 <em>Sc08</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc09 <em>Sc09</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSc10 <em>Sc10</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getShortref <em>Shortref</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSimplify <em>Simplify</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getWclass <em>Wclass</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getWclassnum <em>Wclassnum</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getWcn <em>Wcn</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getWoart <em>Woart</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getGlyphs <em>Glyphs</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link Btsaux.BwllistType#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Btsaux.BtsauxPackage#getBwllistType()
 * @model extendedMetaData="name='bwllist_._type' kind='empty'"
 * @generated
 */
public interface BwllistType extends EObject {
	/**
	 * Returns the value of the '<em><b>Arb Vermerk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arb Vermerk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arb Vermerk</em>' attribute.
	 * @see #setArbVermerk(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_ArbVermerk()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arb_vermerk' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getArbVermerk();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getArbVermerk <em>Arb Vermerk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arb Vermerk</em>' attribute.
	 * @see #getArbVermerk()
	 * @generated
	 */
	void setArbVermerk(Object value);

	/**
	 * Returns the value of the '<em><b>Hsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hsort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hsort</em>' attribute.
	 * @see #setHsort(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Hsort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='hsort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHsort();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getHsort <em>Hsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hsort</em>' attribute.
	 * @see #getHsort()
	 * @generated
	 */
	void setHsort(String value);

	/**
	 * Returns the value of the '<em><b>Kommentar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kommentar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kommentar</em>' attribute.
	 * @see #setKommentar(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Kommentar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='kommentar' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getKommentar();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getKommentar <em>Kommentar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kommentar</em>' attribute.
	 * @see #getKommentar()
	 * @generated
	 */
	void setKommentar(Object value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLabel();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Object value);

	/**
	 * Returns the value of the '<em><b>Lemma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lemma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lemma</em>' attribute.
	 * @see #setLemma(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Lemma()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='lemma' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLemma();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getLemma <em>Lemma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lemma</em>' attribute.
	 * @see #getLemma()
	 * @generated
	 */
	void setLemma(Object value);

	/**
	 * Returns the value of the '<em><b>Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock</em>' attribute.
	 * @see #setLock(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Lock()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='lock' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLock();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getLock <em>Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock</em>' attribute.
	 * @see #getLock()
	 * @generated
	 */
	void setLock(Object value);

	/**
	 * Returns the value of the '<em><b>Lsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lsort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lsort</em>' attribute.
	 * @see #setLsort(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Lsort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='lsort' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLsort();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getLsort <em>Lsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lsort</em>' attribute.
	 * @see #getLsort()
	 * @generated
	 */
	void setLsort(Object value);

	/**
	 * Returns the value of the '<em><b>Redaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redaction</em>' attribute.
	 * @see #setRedaction(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Redaction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='redaction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRedaction();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getRedaction <em>Redaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redaction</em>' attribute.
	 * @see #getRedaction()
	 * @generated
	 */
	void setRedaction(String value);

	/**
	 * Returns the value of the '<em><b>Rstatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rstatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rstatus</em>' attribute.
	 * @see #setRstatus(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Rstatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='rstatus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRstatus();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getRstatus <em>Rstatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rstatus</em>' attribute.
	 * @see #getRstatus()
	 * @generated
	 */
	void setRstatus(String value);

	/**
	 * Returns the value of the '<em><b>Sc00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc00</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc00</em>' attribute.
	 * @see #setSc00(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc00()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc00' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc00();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc00 <em>Sc00</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc00</em>' attribute.
	 * @see #getSc00()
	 * @generated
	 */
	void setSc00(Object value);

	/**
	 * Returns the value of the '<em><b>Sc01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc01</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc01</em>' attribute.
	 * @see #setSc01(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc01()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc01' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc01();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc01 <em>Sc01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc01</em>' attribute.
	 * @see #getSc01()
	 * @generated
	 */
	void setSc01(Object value);

	/**
	 * Returns the value of the '<em><b>Sc02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc02</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc02</em>' attribute.
	 * @see #setSc02(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc02()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc02' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc02();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc02 <em>Sc02</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc02</em>' attribute.
	 * @see #getSc02()
	 * @generated
	 */
	void setSc02(Object value);

	/**
	 * Returns the value of the '<em><b>Sc03</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc03</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc03</em>' attribute.
	 * @see #setSc03(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc03()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc03' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc03();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc03 <em>Sc03</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc03</em>' attribute.
	 * @see #getSc03()
	 * @generated
	 */
	void setSc03(Object value);

	/**
	 * Returns the value of the '<em><b>Sc04</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc04</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc04</em>' attribute.
	 * @see #setSc04(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc04()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc04' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc04();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc04 <em>Sc04</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc04</em>' attribute.
	 * @see #getSc04()
	 * @generated
	 */
	void setSc04(Object value);

	/**
	 * Returns the value of the '<em><b>Sc05</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc05</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc05</em>' attribute.
	 * @see #setSc05(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc05()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc05' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc05();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc05 <em>Sc05</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc05</em>' attribute.
	 * @see #getSc05()
	 * @generated
	 */
	void setSc05(Object value);

	/**
	 * Returns the value of the '<em><b>Sc06</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc06</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc06</em>' attribute.
	 * @see #setSc06(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc06()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc06' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc06();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc06 <em>Sc06</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc06</em>' attribute.
	 * @see #getSc06()
	 * @generated
	 */
	void setSc06(Object value);

	/**
	 * Returns the value of the '<em><b>Sc07</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc07</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc07</em>' attribute.
	 * @see #setSc07(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc07()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc07' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc07();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc07 <em>Sc07</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc07</em>' attribute.
	 * @see #getSc07()
	 * @generated
	 */
	void setSc07(Object value);

	/**
	 * Returns the value of the '<em><b>Sc08</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc08</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc08</em>' attribute.
	 * @see #setSc08(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc08()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc08' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc08();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc08 <em>Sc08</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc08</em>' attribute.
	 * @see #getSc08()
	 * @generated
	 */
	void setSc08(Object value);

	/**
	 * Returns the value of the '<em><b>Sc09</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc09</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc09</em>' attribute.
	 * @see #setSc09(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc09()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc09' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc09();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc09 <em>Sc09</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc09</em>' attribute.
	 * @see #getSc09()
	 * @generated
	 */
	void setSc09(Object value);

	/**
	 * Returns the value of the '<em><b>Sc10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc10</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc10</em>' attribute.
	 * @see #setSc10(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Sc10()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='sc10' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSc10();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSc10 <em>Sc10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc10</em>' attribute.
	 * @see #getSc10()
	 * @generated
	 */
	void setSc10(Object value);

	/**
	 * Returns the value of the '<em><b>Shortref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortref</em>' attribute.
	 * @see #setShortref(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Shortref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='shortref' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getShortref();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getShortref <em>Shortref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortref</em>' attribute.
	 * @see #getShortref()
	 * @generated
	 */
	void setShortref(Object value);

	/**
	 * Returns the value of the '<em><b>Simplify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplify</em>' attribute.
	 * @see #setSimplify(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Simplify()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='simplify' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getSimplify();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSimplify <em>Simplify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplify</em>' attribute.
	 * @see #getSimplify()
	 * @generated
	 */
	void setSimplify(Object value);

	/**
	 * Returns the value of the '<em><b>Wclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wclass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wclass</em>' attribute.
	 * @see #setWclass(Object)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Wclass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='wclass' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getWclass();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getWclass <em>Wclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wclass</em>' attribute.
	 * @see #getWclass()
	 * @generated
	 */
	void setWclass(Object value);

	/**
	 * Returns the value of the '<em><b>Wclassnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wclassnum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wclassnum</em>' attribute.
	 * @see #setWclassnum(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Wclassnum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='wclassnum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWclassnum();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getWclassnum <em>Wclassnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wclassnum</em>' attribute.
	 * @see #getWclassnum()
	 * @generated
	 */
	void setWclassnum(String value);

	/**
	 * Returns the value of the '<em><b>Wcn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wcn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcn</em>' attribute.
	 * @see #setWcn(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Wcn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='wcn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWcn();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getWcn <em>Wcn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcn</em>' attribute.
	 * @see #getWcn()
	 * @generated
	 */
	void setWcn(String value);

	/**
	 * Returns the value of the '<em><b>Woart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Woart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Woart</em>' attribute.
	 * @see #setWoart(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Woart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='woart' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWoart();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getWoart <em>Woart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Woart</em>' attribute.
	 * @see #getWoart()
	 * @generated
	 */
	void setWoart(String value);

	/**
	 * Returns the value of the '<em><b>Glyphs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glyphs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glyphs</em>' attribute.
	 * @see #setGlyphs(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Glyphs()
	 * @model
	 * @generated
	 */
	String getGlyphs();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getGlyphs <em>Glyphs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glyphs</em>' attribute.
	 * @see #getGlyphs()
	 * @generated
	 */
	void setGlyphs(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' attribute.
	 * @see #setPredecessor(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Predecessor()
	 * @model
	 * @generated
	 */
	String getPredecessor();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getPredecessor <em>Predecessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' attribute.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(String value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' attribute.
	 * @see #setSuccessor(String)
	 * @see Btsaux.BtsauxPackage#getBwllistType_Successor()
	 * @model
	 * @generated
	 */
	String getSuccessor();

	/**
	 * Sets the value of the '{@link Btsaux.BwllistType#getSuccessor <em>Successor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' attribute.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(String value);

} // BwllistType
