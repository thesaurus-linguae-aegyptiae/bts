package org.bbaw.bts.core.services.impl;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.BTSObjectSearchServiceFactory;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.impl.internal.SearchServiceFactoryHelper;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;

public class BTSObjectSearchServiceFactoryCore implements
		BTSObjectSearchServiceFactory {

	public BTSObjectSearchServiceFactoryCore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BTSObjectSearchService> getSearchServices() {
		SearchServiceFactoryHelper helper = ContextInjectionFactory.make(SearchServiceFactoryHelper.class, StaticAccessController.getContext());
		List<BTSObjectSearchService> services = new Vector<>(7);
		
		GenericObjectService<?, ?> service = helper.getCommentService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
		
		service = helper.getUserGroupService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
		
		service = helper.getUserService();
		if (service instanceof BTSObjectSearchService)
		{
			services.add((BTSObjectSearchService) service);
		}
		return services;
	}
	
}
