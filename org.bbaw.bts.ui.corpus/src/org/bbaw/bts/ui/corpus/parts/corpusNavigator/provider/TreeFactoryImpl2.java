// package org.bbaw.bts.ui.corpus.parts.corpusNavigator.provider;
//
// import org.bbaw.bts.btsmodel.BTSCorpusObject;
// import org.bbaw.bts.btsmodel.BtsmodelPackage;
// import org.eclipse.core.databinding.observable.IObservable;
// import org.eclipse.core.databinding.observable.list.IObservableList;
// import
// org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
// import org.eclipse.emf.databinding.EMFProperties;
// import org.eclipse.emf.databinding.IEMFListProperty;
//
// public class TreeFactoryImpl2 implements IObservableFactory
// {
// private IEMFListProperty multi =
// EMFProperties.multiList(BtsmodelPackage.Literals.BTS_CORPUS_OBJECT__CHILDREN);
//
// public IObservable createObservable(final Object target)
// {
// if (target instanceof IObservableList)
// {
// return (IObservable) target;
// } else if (target instanceof BTSCorpusObject)
// {
// return multi.observe(target);
// }
//
// return null;
// }
//}