package org.bbaw.bts.core.services.corpus.impl.internal;

import javax.inject.Inject;

import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;

public class CorpusSearchServiceFactoryHelper {
	@Inject
	private BTSTextCorpusService textCorpusService;

	@Inject
	private BTSTCObjectService tcObjectService;

	@Inject
	private CorpusObjectService corpusObjectService;

	@Inject
	private BTSTextService textService;

	@Inject
	private BTSAnnotationService annotationService;

	@Inject
	private BTSThsEntryService thsService;

	@Inject
	private BTSLemmaEntryService wlistService;
	
	@Inject
	private BTSImageService imageService;

	public BTSTextCorpusService getTextCorpusService() {
		return textCorpusService;
	}

	public BTSTCObjectService getTcObjectService() {
		return tcObjectService;
	}

	public CorpusObjectService getCorpusObjectService() {
		return corpusObjectService;
	}

	public BTSTextService getTextService() {
		return textService;
	}

	public BTSAnnotationService getAnnotationService() {
		return annotationService;
	}

	public BTSThsEntryService getThsService() {
		return thsService;
	}

	public BTSLemmaEntryService getWlistService() {
		return wlistService;
	}

	public BTSImageService getImageService() {
		return imageService;
	}
}