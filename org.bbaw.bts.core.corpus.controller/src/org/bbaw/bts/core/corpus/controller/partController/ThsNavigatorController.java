package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.w3c.dom.views.AbstractView;

public interface ThsNavigatorController extends GenericCorpusObjectNavigatorController<BTSThsEntry, String>{

	BTSAnnotation createNewAnnotation(BTSThsEntry selection);

	
}
