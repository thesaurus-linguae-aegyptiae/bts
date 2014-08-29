package org.bbaw.bts.core.services.impl.internal;

import javax.inject.Inject;

import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;

public class SearchServiceFactoryHelper {
		
		@Inject
		public SearchServiceFactoryHelper(){}
		@Inject
		private BTSUserService userService;
		
		@Inject
		private BTSUserGroupService userGroupService;
		
		@Inject
		private BTSCommentService commentService;

		public BTSUserService getUserService() {
			return userService;
		}

		public BTSUserGroupService getUserGroupService() {
			return userGroupService;
		}

		public BTSCommentService getCommentService() {
			return commentService;
		}
	}