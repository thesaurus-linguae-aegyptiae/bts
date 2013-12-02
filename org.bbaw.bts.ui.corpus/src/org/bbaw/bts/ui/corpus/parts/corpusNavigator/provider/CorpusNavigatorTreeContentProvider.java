// package org.bbaw.bts.ui.corpus.parts.corpusNavigator.provider;
//
// import org.bbaw.bts.btsmodel.BTSCorpusObject;
// import
// org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
// import
// org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
// import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;
// import org.eclipse.jface.viewers.IContentProvider;
// import org.eclipse.jface.viewers.ITreeContentProvider;
// import org.eclipse.jface.viewers.Viewer;
// public class CorpusNavigatorTreeContentProvider extends
// ObservableListTreeContentProvider implements IContentProvider,
// ITreeContentProvider
// {
//
// public CorpusNavigatorTreeContentProvider(IObservableFactory listFactory,
// TreeStructureAdvisor structureAdvisor)
// {
// super(listFactory, structureAdvisor);
// // TODO Auto-generated constructor stub
// }
//
// public CorpusNavigatorTreeContentProvider()
// {
// super(null, null);
// }
//
// @Override
// public void dispose()
// {
// // TODO Auto-generated method stub
//
// }
//
// @Override
// public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
// {
// // TODO Auto-generated method stub
//
// }
//
// @Override
// public Object[] getElements(Object inputElement)
// {
// return getChildren(inputElement);
// }
//
// @Override
// public Object[] getChildren(Object parentElement)
// {
// if (parentElement instanceof BTSCorpusObject)
// {
// return (BTSCorpusObject[]) ((BTSCorpusObject)
// parentElement).getChildren().toArray(
// new BTSCorpusObject[((BTSCorpusObject) parentElement).getChildren().size()]);
// }
// return null;
// }
//
// @Override
// public Object getParent(Object element)
// {
// return super.getParent(element);
// }
//
// @Override
// public boolean hasChildren(Object element)
// {
// return super.hasChildren(element);
// }
//
//}
