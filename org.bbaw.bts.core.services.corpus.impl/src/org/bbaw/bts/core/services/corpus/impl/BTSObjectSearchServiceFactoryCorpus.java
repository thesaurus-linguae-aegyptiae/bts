package org.bbaw.bts.core.services.corpus.impl;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.BTSObjectSearchServiceFactory;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSImageService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.core.services.corpus.impl.internal.CorpusSearchServiceFactoryHelper;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;

public class BTSObjectSearchServiceFactoryCorpus implements
		BTSObjectSearchServiceFactory {

	public BTSObjectSearchServiceFactoryCorpus() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BTSObjectSearchService> getSearchServices() {
		CorpusSearchServiceFactoryHelper helper = ContextInjectionFactory.make(CorpusSearchServiceFactoryHelper.class, StaticAccessController.getContext());
		List<BTSObjectSearchService> services = new Vector<>(7);
		
		GenericObjectService<?, ?> service = null;
//		service = helper.getAnnotationService();
//		if (service instanceof BTSObjectSearchService)
//		{
//			services.add((BTSObjectSearchService) service);
//		}
//		
//		service = helper.getImageService();
//		if (service instanceof BTSObjectSearchService)
//		{
//			services.add((BTSObjectSearchService) service);
//		}
//		
		service = helper.getWlistService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
//		
//		service = helper.getTcObjectService();
//		if (service instanceof BTSObjectSearchService)
//		{
//			services.add((BTSObjectSearchService) service);
//		}
//		
		service = helper.getTextCorpusService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
//		
//		service = helper.getTextService();
//		if (service instanceof BTSObjectSearchService)
//		{
//			services.add((BTSObjectSearchService) service);
//		}
		
		service = helper.getThsService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
		
		service = helper.getCorpusObjectService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
		return services;
	}

}
