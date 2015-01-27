package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.dao.BTSCommentDao;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

public class BTSCommentServiceImpl extends GenericObjectServiceImpl<BTSComment, String> implements BTSCommentService, BTSObjectSearchService{

	@Inject
	private BTSCommentDao commentDao;


	@Override
	public List<BTSComment> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor) {
		List<BTSComment> objects = new Vector<BTSComment>();
		for (String p : getActiveProjects())
		{
			try {
				objects.addAll(commentDao.query(query, p + BTSCoreConstants.ADMIN_SUFFIX, p
						+ BTSCoreConstants.ADMIN_SUFFIX, objectState,
						registerQuery));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (monitor != null)
			{
				if (monitor.isCanceled()) return filter(objects);
				monitor.worked(20);
			}
		}
		return filter(objects);
	}

	@Override
	public BTSComment createNew() {
		BTSComment comment = BtsmodelFactory.eINSTANCE.createBTSComment();
		super.setId(comment);
		super.setRevision(comment);
		comment.setDBCollectionKey(main_project + BTSCoreConstants.ADMIN_SUFFIX);
		return comment;
	}

	@Override
	public boolean save(BTSComment entity) {
		super.addRevisionStatement(entity);
		commentDao.add(entity, entity.getDBCollectionKey());
		return true;
	}

	@Override
	public void update(BTSComment entity) {
		commentDao.update(entity, entity.getDBCollectionKey());
		
	}

	@Override
	public void remove(BTSComment entity) {
		commentDao.remove(entity, entity.getDBCollectionKey());
		
	}

	@Override
	public BTSComment find(String key, IProgressMonitor monitor) {
		BTSComment comment = null;
		comment = commentDao.find(key, main_project + BTSCoreConstants.ADMIN_SUFFIX);
		if (comment != null)
		{
			return comment;
		}
		for (String p : getActiveProjects())
		{
			comment = commentDao.find(key, p + BTSCoreConstants.ADMIN_SUFFIX);
			if (comment != null)
			{
				return comment;
			}
		}
		return comment;
	}

	

	@Override
	public List<BTSComment> list(String objectState, IProgressMonitor monitor) {
		List<BTSComment> comments = new Vector<BTSComment>();
		for (String p : getActiveProjects())
		{
				comments.addAll(commentDao.list(p
						+ BTSCoreConstants.ADMIN_SUFFIX, objectState));
		}
		return filter(comments);
	}
	@Override
	public List<BTSComment> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);

	}
	@Override
	public List<BTSComment> list(String dbPath, String queryId,
			String objectState, IProgressMonitor monitor)
	{
		return filter(commentDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public String getNameOfServedClass() {
		return "BTSComment";
	}

	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSComment.class;
	}

	
}
