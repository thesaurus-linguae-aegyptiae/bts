/**
 */
package org.bbaw.bts.btsmodel.impl;

import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Ths Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BTSThsEntryImpl extends BTSCorpusObjectImpl implements BTSThsEntry
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSThsEntryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BtsmodelPackage.Literals.BTS_THS_ENTRY;
	}
	@Override
	public String getDBCollectionKey() {
		return getProject() + "_ths";
	}
} //BTSThsEntryImpl
