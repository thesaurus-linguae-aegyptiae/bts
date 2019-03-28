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

	/**
	 * Build an elasticsearch query searching for lemma entries that
	 * match these criteria:
	 *
	 * - name matches (as a prefix, unless search term length is < 2)
	 * - passport values match (on a certain nesting level)
	 * - type is not root
	 * - revisionState is either published or published-awaiting-review
	 * - are or are not of subtype person_name, depending on parameter
	 * 
	 * @param term search term
	 * @return elasticsearch query in a container
	 */
	BTSQueryRequest createLemmaSearchQuery(String term, boolean includePersonNames);
}
