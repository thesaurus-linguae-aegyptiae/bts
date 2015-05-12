package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.eclipse.core.runtime.IProgressMonitor;

public interface BTSAbstractTextService extends
GenericCorpusObjectService<BTSAbstractText, String> {

	BTSAnnotation createNewAnnotationRelationPartOf(
			BTSAbstractText annotatedObject);

	List<BTSAbstractText> listRootEntries(IProgressMonitor monitor);

}
