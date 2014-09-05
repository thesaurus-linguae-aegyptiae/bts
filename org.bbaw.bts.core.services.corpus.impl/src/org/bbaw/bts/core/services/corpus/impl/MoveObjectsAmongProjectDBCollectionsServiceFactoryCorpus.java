package org.bbaw.bts.core.services.corpus.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.core.commons.MoveObjectAmongProjectDBCollectionsService;
import org.bbaw.bts.core.commons.MoveObjectsAmongProjectDBCollectionsServiceFactory;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class MoveObjectsAmongProjectDBCollectionsServiceFactoryCorpus implements
		MoveObjectsAmongProjectDBCollectionsServiceFactory {

	public MoveObjectsAmongProjectDBCollectionsServiceFactoryCorpus() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BTSFilter getMoveObjectAmongProjectDBCollectionsFilter(Object object) {
		BTSFilter filter = makeFilter(object);
		return filter;
	}

	private BTSFilter makeFilter(Object object) {
		BTSFilter filter = new InternalMoveObjectDBCollectionCorpusFilter(object);
		return filter;
	}

	@Override
	public MoveObjectAmongProjectDBCollectionsService getMoveObjectAmongProjectDBCollectionsService(
			Object object) {
		IEclipseContext context = StaticAccessController.getContext();
		CorpusObjectService service = context.get(CorpusObjectService.class);
		return (MoveObjectAmongProjectDBCollectionsService) service;
	}

	@Override
	public boolean providesServiceForObject(Object object) {
		return (object instanceof BTSCorpusObject);
	}

	private class InternalMoveObjectDBCollectionCorpusFilter implements BTSFilter
	{
		private Pattern pattern;
		
		private String patternString;
		
		public InternalMoveObjectDBCollectionCorpusFilter(Object object) {
			if (object instanceof BTSTextCorpus)
			{
				patternString = "\\w+_corpus";
			}
			else if (object instanceof BTSThsEntry)
			{
				patternString = "\\w+_ths";
			}
			else if (object instanceof BTSLemmaEntry)
			{
				patternString = "\\w+_lemma";
			}
			else if (object instanceof BTSCorpusObject)
			{
				patternString = "\\w+_corpus_\\w+";
			}
			if (patternString != null)
			{
				pattern = Pattern.compile(patternString);
			}
		}

		@Override
		public boolean select(Object object) {
			if (object instanceof BTSProjectDBCollection)
			{
				Matcher m = pattern.matcher(((BTSProjectDBCollection) object).getCollectionName());
				return m.matches();
			}
			return false;
		}
		
	}
}
