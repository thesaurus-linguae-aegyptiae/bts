package org.bbaw.bts.core.corpus.controller.partController;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

public interface HieroglyphTypeWriterController {

	String getHieroglypheProposalsAsMdCString(String normalizedMdC,
			Map<URI, Object> counterCacheMap);

	void updateGraphicSelectionCounter(String beforeImageMdC, String newMdC);

}
