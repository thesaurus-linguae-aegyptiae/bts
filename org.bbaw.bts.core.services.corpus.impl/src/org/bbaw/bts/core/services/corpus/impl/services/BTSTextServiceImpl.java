package org.bbaw.bts.core.services.corpus.impl.services;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.dao.corpus.BTSTextDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.searchModel.WordFormOccurrence;
import org.bbaw.bts.corpus.searchModel.WordFormOccurrenceGroup;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BTSTextServiceImpl extends AbstractCorpusObjectServiceImpl<BTSText, String> implements BTSTextService, BTSObjectSearchService
{
	@Inject
	private BTSTextDao textDao;

	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_DEFAULT_REVIEWSTATE, nodePath = "org.bbaw.bts.ui.corpus")
	protected String corpusReviewState;
	
	@Inject
	@Optional
	@Preference(value = BTSCorpusConstants.PREF_CORPUS_DEFAULT_VISIBILITY, nodePath = "org.bbaw.bts.ui.corpus")
	protected String corpusVisibility;
	
	@Override
	public BTSText createNew()
	{
		BTSText entity = BtsCorpusModelFactory.eINSTANCE.createBTSText();
		entity.setDBCollectionKey(main_corpus_key);
		entity.setCorpusPrefix(main_corpus_key);
		entity.setVisibility(corpusVisibility);
		entity.setRevisionState(corpusReviewState);
		super.setId(entity, entity.getDBCollectionKey());
		super.setRevision(entity);

		return entity;
	}

	@Override
	public boolean save(BTSText entity)
	{
		super.addRevisionStatement(entity);
		textDao.add(entity, entity.getDBCollectionKey());
		return true;
	}

	@Override
	public void update(BTSText entity)
	{
		textDao.update(entity, entity.getDBCollectionKey());

	}

	@Override
	public void remove(BTSText entity)
	{
		textDao.remove(entity, entity.getDBCollectionKey());

	}

	@Override
	public BTSText find(String key, IProgressMonitor monitor)
	{
		BTSText text = null;
		text = textDao.find(key, main_corpus_key);
		if (text != null)
		{
			return text;
		}
		for (String c : getActive_corpora(main_project))
		{
			text = textDao.find(key, c);
			if (text != null)
			{
				return text;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				text = textDao.find(key, c);
				if (text != null)
				{
					return text;
				}
			}
		}
		return null;
	}
	
	@Override
	public BTSText findReturnOnlyMetadata(String key) {
		BTSText text = null;
		text = textDao.findReturnOnlyMetadata(key, main_corpus_key);
		if (text != null)
		{
			return text;
		}
		for (String c : getActive_corpora(main_project))
		{
			text = textDao.findReturnOnlyMetadata(key, c);
			if (text != null)
			{
				return text;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				text = textDao.findReturnOnlyMetadata(key, c);
				if (text != null)
				{
					return text;
				}
			}
		}
		return null;
	}

	@Override
	public List<BTSText> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSText> texts = new Vector<BTSText>();
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				texts.addAll(textDao.list(c, objectState));
			}
		}
		return filter(texts);
	}

	
	@Override
	public List<BTSText> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSText> objects = new Vector<BTSText>();
		String[] indexArray = buildIndexArray();

		objects.addAll(textDao.query(query, indexArray, indexArray, objectState,
				registerQuery));
		return filter(objects);
	}

	@Override
	public List<BTSText> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return filter(query(query, objectState, true, monitor));
	}

	@Override
	public List<BTSText> list(String dbPath, String queryId, String objectState, IProgressMonitor monitor)
	{
		return filter(textDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public BTSSenctence createNewSentence()
	{
		return BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
	}

	@Override
	public BTSWord createNewWord()
	{
		return BtsCorpusModelFactory.eINSTANCE.createBTSWord();
	}

	@Override
	public BTSGraphic createNewGraphic()
	{
		return BtsCorpusModelFactory.eINSTANCE.createBTSGraphic();
	}

	
	@Override
	public String getNameOfServedClass() {
		return "BTSText";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSText.class;
	}

	@Override
	public List<BTSText> listRootEntries(IProgressMonitor monitor) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<BTSText> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSText> objects = new Vector<BTSText>();
		objects.addAll(textDao.listChunks(chunkSize, chunkIds, dbCollectionName, objectState));
		return filter(objects);
	}

	@Override
	public BTSSentenceItem copySentenceItem(BTSSentenceItem copyItem) {
		BTSSentenceItem newItem = null;
		if (copyItem instanceof BTSWord)
		{
			newItem = EcoreUtil.copy(copyItem);
			newItem.set_id(idService.createId(null));
//			((BTSWord)newItem).getGraphics().addAll(EcoreUtil.copyAll(((BTSWord) copyItem).getGraphics()));
//			((BTSWord)newItem).setTranslation(EcoreUtil.copy(((BTSWord) copyItem).getTranslation()));

		}
		else if (copyItem instanceof BTSMarker)
		{
			newItem = EcoreUtil.copy(copyItem);
			newItem.set_id(idService.createId(null));
		}
		return newItem;
	}

	@Override
	public BTSSenctence copySentence(BTSSenctence copyItem) {
		BTSSenctence newItem = null;
		newItem = EcoreUtil.copy(copyItem);
		newItem.set_id(idService.createId(null));
		for (BTSSentenceItem item : newItem.getSentenceItems())
		{
			item.set_id(idService.createId(null));
			if (item instanceof BTSAmbivalence)
			{
				 for (BTSLemmaCase lcase : ((BTSAmbivalence)item).getCases())
				 {
					 lcase.set_id(idService.createId(null));
					 for (BTSAmbivalenceItem amItem : lcase.getScenario())
					 {
						 amItem.set_id(idService.createId(null));
					 }
				 }
			}
		}
		return newItem;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.corpus.BTSTextService#queryForWordFormOccurrences(org.bbaw.bts.core.dao.util.BTSQueryRequest, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<WordFormOccurrenceGroup> queryForWordFormOccurrenceGroups(BTSQueryRequest query,
			IProgressMonitor monitor) {		List<BTSText> texts = query(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		Map<String, WordFormOccurrenceGroup> occurrenceGroupsMap = new HashMap<String, WordFormOccurrenceGroup>(3);

		// find every occurrence in each text
		for (BTSText text : texts)
		{
			findOccurrencesWithinText(text, query, occurrenceGroupsMap);
		}
		
		List<WordFormOccurrenceGroup> groups = new Vector<WordFormOccurrenceGroup>(3);

		for (String type : occurrenceGroupsMap.keySet())
		{
			groups.add(occurrenceGroupsMap.get(type));
		}
		return groups;
	}

	/**
	 * @param text
	 * @param query 
	 * @param occurrenceGroupsMap 
	 * @return
	 */
	private void findOccurrencesWithinText(BTSText text, BTSQueryRequest query, Map<String, WordFormOccurrenceGroup> occurrenceGroupsMap) {
		if (text.getTextContent() == null || text.getTextContent().getTextItems().isEmpty())
		{
			return;
		}
		List<WordFormOccurrence> currentTextOccurrences = new Vector<WordFormOccurrence>(3);
		WordFormOccurrence occurrence;
		for (int i = 0; i< text.getTextContent().getTextItems().size(); i++)
		{
			BTSTextItems item = text.getTextContent().getTextItems().get(i);
			if (item instanceof BTSSenctence)
			{
				for (BTSSentenceItem si : ((BTSSenctence) item).getSentenceItems())
				{
					if (si instanceof BTSWord)
					{
						occurrence = processToken(si, (BTSSenctence) item, i, text, query, occurrenceGroupsMap);
						if (occurrence != null)
						{
							currentTextOccurrences.add(occurrence);
						}
					}
					else if (si instanceof BTSAmbivalence)
					{
						BTSAmbivalence ambi = (BTSAmbivalence) si;
						{
							for (BTSLemmaCase amcase : ambi.getCases())
							{
								for (BTSAmbivalenceItem amitem : amcase.getScenario())
								{
									if (amitem instanceof BTSWord)
									{
										occurrence = processToken(si, (BTSSenctence) item, i, text, query, occurrenceGroupsMap);
										if (occurrence != null)
										{
											currentTextOccurrences.add(occurrence);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!currentTextOccurrences.isEmpty())
		{
			processTextPath(text, currentTextOccurrences);
		}
		return;
	}

	/**
	 * @param sentenceIndex 
	 * @param item 
	 * @param si
	 * @param text
	 * @param query
	 * @param occurrenceGroupsMap
	 * @return
	 */
	private WordFormOccurrence processToken(BTSSentenceItem sentenceItem, BTSSenctence sentence, int sentenceIndex, BTSText text, BTSQueryRequest query,
			Map<String, WordFormOccurrenceGroup> occurrenceGroupsMap) {
		if (sentenceItem == null || !(sentenceItem instanceof BTSWord)) return null;
		BTSWord word = (BTSWord) sentenceItem;
		WordFormOccurrence occurrence = null;
		// determine grouping criteria
		if (WordFormOccurrenceGroup.GROUP_LEMMA.equals(query.getGroupBy()))
		{
			// lemma
			if (word.getLKey() != null && word.getLKey().equals(query.getSearchString()))
			{
				occurrence = addToGroupMap(word.getLKey(), word, sentence, sentenceIndex, text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
			}
		}
		else if (WordFormOccurrenceGroup.GROUP_FLEXION.equals(query.getGroupBy()))
		{
			// flexion
			if (word.getFlexCode() != null && word.getFlexCode().equals(query.getSearchString()))
			{
				occurrence = addToGroupMap(word.getFlexCode(), word, sentence, sentenceIndex,  text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
			}
		}
		else if (WordFormOccurrenceGroup.GROUP_SPELLING.equals(query.getGroupBy()))
		{
			// spelling
			String mdc = word.getGraficsAsMdC();
			if (mdc != null)
			{
				if (query.isFuzzy() && mdc.contains(query.getSearchString()))
				{
					occurrence = addToGroupMap(word.getGraficsAsMdC(), word, sentence, sentenceIndex,  text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
				}
				else if (mdc.equals(query.getSearchString()))
				{
					occurrence = addToGroupMap(word.getGraficsAsMdC(), word, sentence, sentenceIndex,  text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
				}
			}
		}
		else if (WordFormOccurrenceGroup.GROUP_TRANSLATION.equals(query.getGroupBy()))
		{
			// translation
			if (word.getTranslation() != null)
			{
				if(query.isFuzzy() && word.getTranslation().getTranslation(query.getLang()).contains(query.getSearchString()))
				{
					
				}
				else if (word.getTranslation().getTranslation(query.getLang()).equals(query.getSearchString()))
				{
					occurrence = addToGroupMap(word.getTranslation().getTranslation(query.getLang()), word, sentence,  sentenceIndex, text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
				}
			}
		}
		else if (WordFormOccurrenceGroup.GROUP_TRANSLITERATION.equals(query.getGroupBy()))
		{
			// transliteration
			if (word.getWChar() != null)
			{
				if (query.isFuzzy() && word.getWChar().contains(query.getSearchString()))
				{
					occurrence = addToGroupMap(word.getWChar(), word, sentence,  sentenceIndex, text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
				}
				else if (word.getWChar().equals(query.getSearchString()))
				{
					occurrence = addToGroupMap(word.getWChar(), word, sentence,  sentenceIndex, text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
				}
			}
		}
		else
		{
			// no grouping
			if (word.getWChar() != null && word.getWChar().equals(query.getSearchString()))
			{
				occurrence = addToGroupMap(null, word, sentence,  sentenceIndex, text, occurrenceGroupsMap, WordFormOccurrenceGroup.GROUP_TRANSLITERATION);
			}
		}
		return occurrence;
	}


	/**
	 * @param wChar
	 * @param word
	 * @param sentence
	 * @param text
	 * @param occurrenceGroupsMap
	 * @param gROUP_TRANSLITERATION
	 * @return 
	 */
	private WordFormOccurrence addToGroupMap(String machtingValue, BTSWord word, BTSSenctence sentence, int sentenceIndex, BTSText text,
			Map<String, WordFormOccurrenceGroup> occurrenceGroupsMap, String groupBy) {
		WordFormOccurrenceGroup group;
		if (machtingValue == null)
		{
			// no grouping
			if(occurrenceGroupsMap.isEmpty())
			{
				group = makeGroup(machtingValue, groupBy, occurrenceGroupsMap);
			}
			else
			{
				group = occurrenceGroupsMap.values().iterator().next();
			}
		}
		else
		{
			if(occurrenceGroupsMap.containsKey(machtingValue))
			{
				group = occurrenceGroupsMap.get(machtingValue);
			}
			else
			{
				group = makeGroup(machtingValue, groupBy, occurrenceGroupsMap);
			}
		}
		WordFormOccurrence occurrence = makeWordFormOccurrence(word, sentenceIndex, text);
		group.addOccurrence(occurrence);
		return occurrence;
	}

	/**
	 * @param machtingValue
	 * @param groupBy
	 * @param occurrenceGroupsMap 
	 * @param sentence
	 * @param text
	 * @return
	 */
	private WordFormOccurrenceGroup makeGroup(String machtingValue, String groupBy, Map<String, WordFormOccurrenceGroup> occurrenceGroupsMap) {
		WordFormOccurrenceGroup group = new WordFormOccurrenceGroup();
		group.setGroupType(groupBy);
		group.setValue(machtingValue);
		occurrenceGroupsMap.put(machtingValue, group);
		return group;
	}

	/**
	 * @param text
	 * @param occurrences
	 */
	private void processTextPath(BTSText text, List<WordFormOccurrence> occurrences) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param si
	 * @param i
	 * @param text
	 * @return
	 */
	private WordFormOccurrence makeWordFormOccurrence(BTSWord matchingWord, int sentenceIndex, BTSText text) {
		WordFormOccurrence occurrence = new WordFormOccurrence(matchingWord, text);
		occurrence.setMatchingSentence((BTSSenctence) text.getTextContent().getTextItems().get(sentenceIndex));
		// cotext before
		processCoText(text, sentenceIndex, -1, true, occurrence);
		// cotext after
		processCoText(text, sentenceIndex, 1, false, occurrence);
		return occurrence;
	}

	/**
	 * @param text
	 * @param sentenceIndex
	 * @param occurrence 
	 * @param before 
	 * @param i
	 * @return
	 */
	private void processCoText(BTSText text, int sentenceIndex, int cotextindex, boolean before, WordFormOccurrence occurrence) {
		List<BTSSenctence> sentences = new Vector<BTSSenctence>(Math.abs(cotextindex));
		
		int i = sentenceIndex;
		while(sentences.size() < Math.abs(cotextindex)) 
		{
			if (before)
			{
				i--;
			}
			else
			{
				i++;
			}
			if (i < 0 || i >= text.getTextContent().getTextItems().size()) break;
			if (text.getTextContent().getTextItems().get(i) instanceof BTSSenctence)
			{
				sentences.add((BTSSenctence) text.getTextContent().getTextItems().get(i));
			}
		}
		if (before)
		{
			occurrence.setCoTextBefore(sentences);
		}
		else
		{
			occurrence.setCoTextAfter(sentences);
		}
		return;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#findAsJsonString(java.io.Serializable, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public String findAsJsonString(String key, IProgressMonitor monitor) {
		String text = null;
		text = textDao.findAsJsonString(key, main_corpus_key);
		if (text != null)
		{
			return text;
		}
		for (String c : getActive_corpora(main_project))
		{
			text = textDao.findAsJsonString(key, c);
			if (text != null)
			{
				return text;
			}
		}
		for (String p : getActiveProjects())
		{
			for (String c : getActive_corpora(p))
			{
				text = textDao.findAsJsonString(key, c);
				if (text != null)
				{
					return text;
				}
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl#queryAsJsonString(org.bbaw.bts.core.dao.util.BTSQueryRequest, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		List<String> objects = new Vector<String>();
		String[] indexArray = buildIndexArray();

		objects.addAll(textDao.queryAsJsonString(query, indexArray, indexArray, objectState,
				false));
		return objects;
	}

}
