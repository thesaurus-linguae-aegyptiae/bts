package org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;

public class TreeFactoryImpl2 implements IObservableFactory
{
	private IEMFListProperty multi = EMFProperties.multiList(BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN);

	public IObservable createObservable(final Object target)
	{
		if (target instanceof IObservableList)
		{
			return (IObservable) target;
		} else if (target instanceof BTSConfig)
		{
			return multi.observe(target);
		}

		return null;
	}
}