/**
 */
package org.bbaw.bts.btsmodel;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTSDB Base Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the superclass of all database object. Each object that can be stored in the database 
 * on its own and is not contained by any other object has to extend this abstract class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev <em>rev</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getProject <em>Project</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getReaders <em>Readers</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#is_deleted <em>deleted</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getConflictingRevs <em>Conflicting Revs</em>}</li>
 *   <li>{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getDBCollectionKey <em>DB Collection Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject()
 * @model abstract="true"
 * @generated
 */
public interface BTSDBBaseObject extends BTSIdentifiableItem {
	/**
	 * Returns the value of the '<em><b>rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * holds the id of the revision of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>rev</em>' attribute.
	 * @see #set_rev(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject__rev()
	 * @model
	 * @generated
	 */
	String get_rev();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#get_rev <em>rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>rev</em>' attribute.
	 * @see #get_rev()
	 * @generated
	 */
	void set_rev(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefix of the project to which this object belongs. That means also the root path
	 * where the object is stored in the database if the database supports collections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_Project()
	 * @model transient="true"
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transient! Allows to cache locking status information and propagate locking status information to 
	 * UI and other top layers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_Locked()
	 * @model transient="true"
	 * @generated
	 */
	boolean isLocked();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#isLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #isLocked()
	 * @generated
	 */
	void setLocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updaters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by rights management.
	 * Holds ids of user objects and usergroups that are allowed to modify the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updaters</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_Updaters()
	 * @model
	 * @generated
	 */
	EList<String> getUpdaters();

	/**
	 * Returns the value of the '<em><b>Readers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by rights management.
	 * Holds ids of user objects and usergroups that are allowed to read the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Readers</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_Readers()
	 * @model
	 * @generated
	 */
	EList<String> getReaders();

	/**
	 * Returns the value of the '<em><b>deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>deleted</em>' attribute.
	 * @see #set_deleted(boolean)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject__deleted()
	 * @model
	 * @generated
	 */
	boolean is_deleted();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#is_deleted <em>deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>deleted</em>' attribute.
	 * @see #is_deleted()
	 * @generated
	 */
	void set_deleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Conflicting Revs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicting Revs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * holds revision ids of revisions which cause conflicts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conflicting Revs</em>' attribute list.
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_ConflictingRevs()
	 * @model default="" transient="true"
	 * @generated
	 */
	EList<String> getConflictingRevs();

	/**
	 * Returns the value of the '<em><b>DB Collection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB Collection Key</em>' attribute.
	 * @see #setDBCollectionKey(String)
	 * @see org.bbaw.bts.btsmodel.BtsmodelPackage#getBTSDBBaseObject_DBCollectionKey()
	 * @model transient="true"
	 * @generated
	 */
	String getDBCollectionKey();

	/**
	 * Sets the value of the '{@link org.bbaw.bts.btsmodel.BTSDBBaseObject#getDBCollectionKey <em>DB Collection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB Collection Key</em>' attribute.
	 * @see #getDBCollectionKey()
	 * @generated
	 */
	void setDBCollectionKey(String value);

} // BTSDBBaseObject
