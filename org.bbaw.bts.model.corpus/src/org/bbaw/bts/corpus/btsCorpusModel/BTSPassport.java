/**
 */
package org.bbaw.bts.corpus.btsCorpusModel;

import org.bbaw.bts.btsmodel.BTSTimespan;
import org.bbaw.bts.btsmodel.BTSTranslations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Passport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDate <em>Date</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getChildren <em>Children</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport()
 * @model
 * @generated
 */
public interface BTSPassport extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(BTSTimespan)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Date()
	 * @model containment="true"
	 * @generated
	 */
	BTSTimespan getDate();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(BTSTimespan value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSPassportEntry> getChildren();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.corpus.btsCorpusModel.BTSPassport#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.bbaw.bts.btsmodel.BTSTranslations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSPassport_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BTSTranslations> getDescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * path as passport path, beginning with category, group... item. separated by >>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BTSPassportEntry getPassportEntryByPath(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getPassportEntryStringValueByPath(String path);

} // BTSPassport
