/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.btsviewmodel.impl;

import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Collection Status Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getDbCollectionName <em>Db Collection Name</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getDbDocCount <em>Db Doc Count</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getSyncStatusToRemote <em>Sync Status To Remote</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getSyncStatusFromRemote <em>Sync Status From Remote</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getIndexDocCount <em>Index Doc Count</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getIndexStatus <em>Index Status</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getDbDiskSize <em>Db Disk Size</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getDbDocDelCount <em>Db Doc Del Count</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getDbPurgeSeq <em>Db Purge Seq</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getDbUpdateSeq <em>Db Update Seq</em>}</li>
 *   <li>{@link org.bbaw.bts.btsviewmodel.impl.DBCollectionStatusInformationImpl#getIndexUpdateSeq <em>Index Update Seq</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBCollectionStatusInformationImpl extends MinimalEObjectImpl.Container implements DBCollectionStatusInformation {
	/**
	 * The default value of the '{@link #getDbCollectionName() <em>Db Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbCollectionName()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_COLLECTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbCollectionName() <em>Db Collection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbCollectionName()
	 * @generated
	 * @ordered
	 */
	protected String dbCollectionName = DB_COLLECTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbDocCount() <em>Db Doc Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbDocCount()
	 * @generated
	 * @ordered
	 */
	protected static final long DB_DOC_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDbDocCount() <em>Db Doc Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbDocCount()
	 * @generated
	 * @ordered
	 */
	protected long dbDocCount = DB_DOC_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncStatusToRemote() <em>Sync Status To Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStatusToRemote()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNC_STATUS_TO_REMOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncStatusToRemote() <em>Sync Status To Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStatusToRemote()
	 * @generated
	 * @ordered
	 */
	protected String syncStatusToRemote = SYNC_STATUS_TO_REMOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncStatusFromRemote() <em>Sync Status From Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStatusFromRemote()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNC_STATUS_FROM_REMOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncStatusFromRemote() <em>Sync Status From Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStatusFromRemote()
	 * @generated
	 * @ordered
	 */
	protected String syncStatusFromRemote = SYNC_STATUS_FROM_REMOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexDocCount() <em>Index Doc Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexDocCount()
	 * @generated
	 * @ordered
	 */
	protected static final long INDEX_DOC_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIndexDocCount() <em>Index Doc Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexDocCount()
	 * @generated
	 * @ordered
	 */
	protected long indexDocCount = INDEX_DOC_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexStatus() <em>Index Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexStatus() <em>Index Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexStatus()
	 * @generated
	 * @ordered
	 */
	protected String indexStatus = INDEX_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbDiskSize() <em>Db Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbDiskSize()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_DISK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbDiskSize() <em>Db Disk Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbDiskSize()
	 * @generated
	 * @ordered
	 */
	protected String dbDiskSize = DB_DISK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbDocDelCount() <em>Db Doc Del Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbDocDelCount()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_DOC_DEL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbDocDelCount() <em>Db Doc Del Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbDocDelCount()
	 * @generated
	 * @ordered
	 */
	protected String dbDocDelCount = DB_DOC_DEL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPurgeSeq() <em>Db Purge Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPurgeSeq()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PURGE_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPurgeSeq() <em>Db Purge Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPurgeSeq()
	 * @generated
	 * @ordered
	 */
	protected String dbPurgeSeq = DB_PURGE_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUpdateSeq() <em>Db Update Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUpdateSeq()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_UPDATE_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUpdateSeq() <em>Db Update Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUpdateSeq()
	 * @generated
	 * @ordered
	 */
	protected String dbUpdateSeq = DB_UPDATE_SEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexUpdateSeq() <em>Index Update Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexUpdateSeq()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_UPDATE_SEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexUpdateSeq() <em>Index Update Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexUpdateSeq()
	 * @generated
	 * @ordered
	 */
	protected String indexUpdateSeq = INDEX_UPDATE_SEQ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBCollectionStatusInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsviewmodelPackage.Literals.DB_COLLECTION_STATUS_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbCollectionName() {
		return dbCollectionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbCollectionName(String newDbCollectionName) {
		String oldDbCollectionName = dbCollectionName;
		dbCollectionName = newDbCollectionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME, oldDbCollectionName, dbCollectionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDbDocCount() {
		return dbDocCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbDocCount(long newDbDocCount) {
		long oldDbDocCount = dbDocCount;
		dbDocCount = newDbDocCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT, oldDbDocCount, dbDocCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyncStatusToRemote() {
		return syncStatusToRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncStatusToRemote(String newSyncStatusToRemote) {
		String oldSyncStatusToRemote = syncStatusToRemote;
		syncStatusToRemote = newSyncStatusToRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE, oldSyncStatusToRemote, syncStatusToRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyncStatusFromRemote() {
		return syncStatusFromRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncStatusFromRemote(String newSyncStatusFromRemote) {
		String oldSyncStatusFromRemote = syncStatusFromRemote;
		syncStatusFromRemote = newSyncStatusFromRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE, oldSyncStatusFromRemote, syncStatusFromRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIndexDocCount() {
		return indexDocCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexDocCount(long newIndexDocCount) {
		long oldIndexDocCount = indexDocCount;
		indexDocCount = newIndexDocCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT, oldIndexDocCount, indexDocCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexStatus() {
		return indexStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexStatus(String newIndexStatus) {
		String oldIndexStatus = indexStatus;
		indexStatus = newIndexStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS, oldIndexStatus, indexStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbDiskSize() {
		return dbDiskSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbDiskSize(String newDbDiskSize) {
		String oldDbDiskSize = dbDiskSize;
		dbDiskSize = newDbDiskSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE, oldDbDiskSize, dbDiskSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbDocDelCount() {
		return dbDocDelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbDocDelCount(String newDbDocDelCount) {
		String oldDbDocDelCount = dbDocDelCount;
		dbDocDelCount = newDbDocDelCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT, oldDbDocDelCount, dbDocDelCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbPurgeSeq() {
		return dbPurgeSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbPurgeSeq(String newDbPurgeSeq) {
		String oldDbPurgeSeq = dbPurgeSeq;
		dbPurgeSeq = newDbPurgeSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ, oldDbPurgeSeq, dbPurgeSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbUpdateSeq() {
		return dbUpdateSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbUpdateSeq(String newDbUpdateSeq) {
		String oldDbUpdateSeq = dbUpdateSeq;
		dbUpdateSeq = newDbUpdateSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ, oldDbUpdateSeq, dbUpdateSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexUpdateSeq() {
		return indexUpdateSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexUpdateSeq(String newIndexUpdateSeq) {
		String oldIndexUpdateSeq = indexUpdateSeq;
		indexUpdateSeq = newIndexUpdateSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ, oldIndexUpdateSeq, indexUpdateSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME:
				return getDbCollectionName();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT:
				return getDbDocCount();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE:
				return getSyncStatusToRemote();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE:
				return getSyncStatusFromRemote();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT:
				return getIndexDocCount();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS:
				return getIndexStatus();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE:
				return getDbDiskSize();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT:
				return getDbDocDelCount();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ:
				return getDbPurgeSeq();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ:
				return getDbUpdateSeq();
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ:
				return getIndexUpdateSeq();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME:
				setDbCollectionName((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT:
				setDbDocCount((Long)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE:
				setSyncStatusToRemote((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE:
				setSyncStatusFromRemote((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT:
				setIndexDocCount((Long)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS:
				setIndexStatus((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE:
				setDbDiskSize((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT:
				setDbDocDelCount((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ:
				setDbPurgeSeq((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ:
				setDbUpdateSeq((String)newValue);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ:
				setIndexUpdateSeq((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME:
				setDbCollectionName(DB_COLLECTION_NAME_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT:
				setDbDocCount(DB_DOC_COUNT_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE:
				setSyncStatusToRemote(SYNC_STATUS_TO_REMOTE_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE:
				setSyncStatusFromRemote(SYNC_STATUS_FROM_REMOTE_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT:
				setIndexDocCount(INDEX_DOC_COUNT_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS:
				setIndexStatus(INDEX_STATUS_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE:
				setDbDiskSize(DB_DISK_SIZE_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT:
				setDbDocDelCount(DB_DOC_DEL_COUNT_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ:
				setDbPurgeSeq(DB_PURGE_SEQ_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ:
				setDbUpdateSeq(DB_UPDATE_SEQ_EDEFAULT);
				return;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ:
				setIndexUpdateSeq(INDEX_UPDATE_SEQ_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_COLLECTION_NAME:
				return DB_COLLECTION_NAME_EDEFAULT == null ? dbCollectionName != null : !DB_COLLECTION_NAME_EDEFAULT.equals(dbCollectionName);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_COUNT:
				return dbDocCount != DB_DOC_COUNT_EDEFAULT;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_TO_REMOTE:
				return SYNC_STATUS_TO_REMOTE_EDEFAULT == null ? syncStatusToRemote != null : !SYNC_STATUS_TO_REMOTE_EDEFAULT.equals(syncStatusToRemote);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__SYNC_STATUS_FROM_REMOTE:
				return SYNC_STATUS_FROM_REMOTE_EDEFAULT == null ? syncStatusFromRemote != null : !SYNC_STATUS_FROM_REMOTE_EDEFAULT.equals(syncStatusFromRemote);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_DOC_COUNT:
				return indexDocCount != INDEX_DOC_COUNT_EDEFAULT;
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_STATUS:
				return INDEX_STATUS_EDEFAULT == null ? indexStatus != null : !INDEX_STATUS_EDEFAULT.equals(indexStatus);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DISK_SIZE:
				return DB_DISK_SIZE_EDEFAULT == null ? dbDiskSize != null : !DB_DISK_SIZE_EDEFAULT.equals(dbDiskSize);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_DOC_DEL_COUNT:
				return DB_DOC_DEL_COUNT_EDEFAULT == null ? dbDocDelCount != null : !DB_DOC_DEL_COUNT_EDEFAULT.equals(dbDocDelCount);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_PURGE_SEQ:
				return DB_PURGE_SEQ_EDEFAULT == null ? dbPurgeSeq != null : !DB_PURGE_SEQ_EDEFAULT.equals(dbPurgeSeq);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__DB_UPDATE_SEQ:
				return DB_UPDATE_SEQ_EDEFAULT == null ? dbUpdateSeq != null : !DB_UPDATE_SEQ_EDEFAULT.equals(dbUpdateSeq);
			case BtsviewmodelPackage.DB_COLLECTION_STATUS_INFORMATION__INDEX_UPDATE_SEQ:
				return INDEX_UPDATE_SEQ_EDEFAULT == null ? indexUpdateSeq != null : !INDEX_UPDATE_SEQ_EDEFAULT.equals(indexUpdateSeq);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dbCollectionName: ");
		result.append(dbCollectionName);
		result.append(", dbDocCount: ");
		result.append(dbDocCount);
		result.append(", syncStatusToRemote: ");
		result.append(syncStatusToRemote);
		result.append(", syncStatusFromRemote: ");
		result.append(syncStatusFromRemote);
		result.append(", indexDocCount: ");
		result.append(indexDocCount);
		result.append(", indexStatus: ");
		result.append(indexStatus);
		result.append(", dbDiskSize: ");
		result.append(dbDiskSize);
		result.append(", dbDocDelCount: ");
		result.append(dbDocDelCount);
		result.append(", dbPurgeSeq: ");
		result.append(dbPurgeSeq);
		result.append(", dbUpdateSeq: ");
		result.append(dbUpdateSeq);
		result.append(", indexUpdateSeq: ");
		result.append(indexUpdateSeq);
		result.append(')');
		return result.toString();
	}

} //DBCollectionStatusInformationImpl
