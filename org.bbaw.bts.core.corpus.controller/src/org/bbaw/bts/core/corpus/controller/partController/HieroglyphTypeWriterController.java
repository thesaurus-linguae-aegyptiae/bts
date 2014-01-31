package org.bbaw.bts.core.corpus.controller.partController;

import java.util.Map;

public interface HieroglyphTypeWriterController {

	String getHieroglypheProposalsAsMdCString(String normalizedMdC,
			Map counterCacheMap);

	void updateGraphicSelectionCounter(String beforeImageMdC, String newMdC);

}
