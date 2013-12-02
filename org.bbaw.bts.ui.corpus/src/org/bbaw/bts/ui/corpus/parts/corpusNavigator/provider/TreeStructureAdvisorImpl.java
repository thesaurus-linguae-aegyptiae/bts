// package org.bbaw.bts.ui.corpus.parts.corpusNavigator.provider;
//
// import org.bbaw.bts.btsmodel.BTSCorpusObject;
// import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;
//
// public class TreeStructureAdvisorImpl extends TreeStructureAdvisor
// {
// @Override
// public Object getParent(Object element)
// {
// if (element instanceof BTSCorpusObject)
// {
// return ((BTSCorpusObject) element).getParent();
// }
//
// return null;
// }
//
// @Override
// public Boolean hasChildren(Object element)
// {
// if (element instanceof BTSCorpusObject)
// {
// if (((BTSCorpusObject) element).getRelations().size() > 0
// || ((BTSCorpusObject) element).getChildren().size() > 0)
// {
// return Boolean.TRUE;
// }
//
// }
// return Boolean.FALSE;
// }
//}