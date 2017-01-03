package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.eclipse.core.runtime.IProgressMonitor;

public interface BTSLemmaEntryService extends
GenericCorpusObjectService<BTSLemmaEntry, String> {

	List<BTSLemmaEntry> findLemmaProposals(String prefix, IProgressMonitor monitor);

	BTSAnnotation createNewAnnotationRelationPartOf(
			BTSCorpusObject annotatedObject);

	String processWordCharForLemmatizing(String wordChars);

	List<BTSLemmaEntry> filterLemmaProposals(List<BTSLemmaEntry> obs);

	BTSQueryRequest createLemmaSearchQuery(String chars);
}
