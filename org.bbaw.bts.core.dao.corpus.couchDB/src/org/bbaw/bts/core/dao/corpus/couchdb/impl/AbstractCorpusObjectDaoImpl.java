package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHitField;

public abstract class AbstractCorpusObjectDaoImpl<E extends BTSCorpusObject, K extends Serializable>
		extends CouchDBDao<E, K> implements GenericDao<E, K> {

	@Inject
	protected Logger logger;
	public static final String CORPUSPREFIX_PATTERN = "(\"corpusPrefix\":\\s*\")([^\"]*)\"";
	public static final Pattern corpusPrefixPattern = Pattern
			.compile(CORPUSPREFIX_PATTERN);

	public static final String RELATION_PATTERN = "(\"relations\"\\s*:\\s*\\[\\s*)([^\\]]*)";
	private static final Pattern relationsPattern = Pattern
			.compile(RELATION_PATTERN);

	public static final String RELATION_ID_PATTERN = "(\"_id\":\\s*\")([^\"]*)\"";
	public static final Pattern relationIdPattern = Pattern
			.compile(RELATION_ID_PATTERN);

	public static final String RELATIONTYPE_PATTERN = "(\"type\":\\s*\")([^\"]*)\"";
	public static final Pattern relationTypePattern = Pattern
			.compile(RELATIONTYPE_PATTERN);

	public static final String RELATIONOBJECTID_PATTERN = "(\"objectId\":\\s*\")([^\"]*)\"";
	public static final Pattern relationObjectIdPattern = Pattern
			.compile(RELATIONOBJECTID_PATTERN);

	public static final String WORD_PATTERN = "(\"words\"\\s*:\\s*\\[\\s*)([^\\]]*)";
	private static final Pattern wordsPattern = Pattern.compile(WORD_PATTERN);

	public static final String WORD_WCHAR_PATTERN = "(\"wChar\":\\s*\")([^\"]*)\"";
	public static final Pattern wordsWCharPattern = Pattern
			.compile(WORD_WCHAR_PATTERN);

	public static final String LEMMA_TRANSLATIONS_PATTERN = "(\"translations\"\\s*:\\s*\\[\\s*)([^\\]]*)";
	public static final Pattern lemmaTranslationsPattern = Pattern
			.compile(LEMMA_TRANSLATIONS_PATTERN);

	public static final String VALUE_TRANSLATION_PATTERN = "(\"value\":\\s*\")([^\"]*)\"";
	public static final Pattern valuePattern = Pattern
			.compile(VALUE_TRANSLATION_PATTERN);

	public static final String LANG_TRANSLATION_PATTERN = "(\"lang\":\\s*\")([^\"]*)\"";
	public static final Pattern langPattern = Pattern
			.compile(LANG_TRANSLATION_PATTERN);

	protected List<E> loadPartialObjectsFromStrings(List<String> allDocs,
			String dbPath) {
		List<E> results = new Vector<E>(allDocs.size());
		Map<URI, Resource> cache = getObjectCache();

		for (String jo : allDocs) {
			E entity = loadPartialObjectFromString(jo, dbPath, cache); 
			results.add(entity);
		}
		return results;
	}

	protected Map<URI, Resource> getObjectCache() {
		return ((ResourceSetImpl) connectionProvider
				.getEmfResourceSet()).getURIResourceMap();
	}

	protected E loadPartialObjectFromString(String jo, String dbPath, Map<URI, Resource> cache) {
		String id = extractIdFromObjectString(jo);
		// logger.info(id);
		URI uri = URI.createURI(getLocalDBURL() + "/" + dbPath + "/" + id);
		E entity = retrieveFromCache(uri, cache);
		if (entity == null) {
			entity = loadObjectFromString(id, dbPath, uri,
					extractEClassFromObjectString(jo), jo);
			addEntityToCache(uri, cache, entity);
		}
		return entity;
	}


	@Override
	public E loadObjectFromString(String id, String indexName, URI uri,
			String eclassString, String sourceAsString) {
		// if doc is included in hit and provided as sourceString
		if (sourceAsString != null && sourceAsString.contains("_rev"))
			return super.loadObjectFromString(id, indexName, uri, eclassString,
					sourceAsString);

		// else load partiallly from provided fields.
		if (eclassString == null) {
			eclassString = extractEClassFromObjectString(sourceAsString);
		}
		E entity = createObject(eclassString);
		if (entity == null) {
			System.out.println(id + " " + sourceAsString);
			throw new BTSDBException(
					"Unable to identify EClass from source string: "
							+ sourceAsString);
		}
		Resource resource = connectionProvider.getEmfResourceSet()
				.createResource(uri);
		resource.getContents().add(entity);
		entity.set_id(extractIdFromObjectString(sourceAsString));

		entity.setName(extractNameFromObjectString(sourceAsString));

		entity.setType(extractTypeFromObjectString(sourceAsString));

		entity.setSubtype(extractSubTypeFromObjectString(sourceAsString));

		// visiblity
		entity.setVisibility(extractVisibilityFromObjectString(sourceAsString));

		// CorpusPrefix
		entity.setCorpusPrefix(extractCorpusPrefixFromObjectString(sourceAsString));

		// sortKey
		String sk = extractSortKeyFromObjectString(sourceAsString);
		if (sk != null) {
			try {
				entity.setSortKey(new Integer(sk));
			} catch (NumberFormatException e) {
			}
		}

		// readers
		List<String> readers = extractReadersFromObjectString(sourceAsString);
		if (readers != null) {
			for (String s : readers) {
				entity.getReaders().add(s);
			}
		}

		List<String> updaters = extractUpdatersFromObjectString(sourceAsString);
		if (updaters != null) {
			for (String s : updaters) {
				entity.getUpdaters().add(s);
			}
		}
		// relations
		List<BTSRelation> relations = extractRelationsFromObjectString(sourceAsString);
		if (relations != null) {
			for (BTSRelation r : relations) {
				entity.getRelations().add(r);
			}
		}

		if (entity instanceof BTSLemmaEntry) {
			List<BTSWord> words = null;
			try {
				words = extractWordsFromObjectString(sourceAsString);
				if (words != null) {
					BTSLemmaEntry lemma = (BTSLemmaEntry) entity;
					for (BTSWord w : words) {
						lemma.getWords().add(w);
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

			}
			
			List<BTSTranslation> translations = null;
			try {
				translations = extractLemmaTranslationsFromObjectString(sourceAsString);
				if (translations != null) {
					BTSLemmaEntry lemma = (BTSLemmaEntry) entity;
					if (lemma.getTranslations() == null)
					{
						lemma.setTranslations(BtsmodelFactory.eINSTANCE.createBTSTranslations());
					}
					for (BTSTranslation t : translations) {
						lemma.getTranslations().getTranslations().add(t);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			
		}

		entity.setDBCollectionKey(indexName);
		entity.setRevisionState(extractRevisionSateFromObjectString(sourceAsString));
		return entity;
	}

	private List<BTSTranslation> extractLemmaTranslationsFromObjectString(
			String sourceAsString) {
		Matcher m = lemmaTranslationsPattern.matcher(sourceAsString);
		if (m.find()) {
			List<BTSTranslation> translations = new Vector<BTSTranslation>();
			String allTranslations = m.group(2);
			if (allTranslations == null || allTranslations.trim().length() == 0)
				return null;
			String transStrings[] = allTranslations.split("\\}\\s*,\\s*\\{");
			for (String transString : transStrings) {
				String eclass = extractEClassFromObjectString(transString);
				if (eclass.endsWith("BTSTranslation")) {
					BTSTranslation translation = BtsmodelFactory.eINSTANCE
							.createBTSTranslation();
					String relID = extractRelationIDFromObjectString(transString);
					translation.set_id(relID);
					String value = extractValueFromTranslationString(transString);
					translation.setValue(value);

					String wChar = extractLangFromTranslationString(transString);
					translation.setLang(wChar);
					translations.add(translation);
				}
			}
			return translations;
		}
		return null;
	}

	private String extractLangFromTranslationString(String transString) {
		Matcher m = langPattern.matcher(transString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	private String extractValueFromTranslationString(String transString) {
		Matcher m = valuePattern.matcher(transString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	private List<BTSWord> extractWordsFromObjectString(String sourceAsString) {
		Matcher m = wordsPattern.matcher(sourceAsString);
		if (m.find()) {
			List<BTSWord> words = new Vector<BTSWord>();
			String allWords = m.group(2);
			if (allWords == null || allWords.trim().length() == 0)
				return null;
			String relStrings[] = allWords.split("\\}\\s*,\\s*\\{");
			for (String wordString : relStrings) {
				String eclass = extractEClassFromObjectString(wordString);
				if (eclass.endsWith("BTSWord")) {
					BTSWord word = BtsCorpusModelFactory.eINSTANCE
							.createBTSWord();
					String relID = extractRelationIDFromObjectString(wordString);
					word.set_id(relID);

					String wChar = extractWordwCharFromObjectString(wordString);
					word.setWChar(wChar);
					words.add(word);
				}
			}
			return words;
		}
		return null;
	}

	private String extractWordwCharFromObjectString(String wordString) {
		Matcher m = wordsWCharPattern.matcher(wordString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	private List<BTSRelation> extractRelationsFromObjectString(
			String sourceAsString) {
		Matcher m = relationsPattern.matcher(sourceAsString);
		if (m.find()) {
			List<BTSRelation> relations = new Vector<BTSRelation>();
			String allRelations = m.group(2);
			if (allRelations == null || allRelations.trim().length() == 0)
				return null;
			String relStrings[] = allRelations.split("\\}\\s*,\\s*\\{");
			for (String relString : relStrings) {
				String eclass = extractEClassFromObjectString(relString);
				if (eclass.endsWith("BTSRelation")) {
					BTSRelation rel = BtsmodelFactory.eINSTANCE
							.createBTSRelation();
					String object = extractRelationObjectFromObjectString(relString);
					rel.setObjectId(object);

					String relID = extractRelationIDFromObjectString(relString);
					rel.set_id(relID);

					String relType = extractRelationTypeFromObjectString(relString);
					rel.setType(relType);
					relations.add(rel);
				}
			}
			return relations;
		}
		return null;
	}

	private String extractRelationTypeFromObjectString(String relString) {
		Matcher m = relationTypePattern.matcher(relString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	private String extractRelationIDFromObjectString(String relString) {
		Matcher m = relationIdPattern.matcher(relString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	private String extractRelationObjectFromObjectString(String relString) {
		Matcher m = relationObjectIdPattern.matcher(relString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	private String extractCorpusPrefixFromObjectString(String sourceAsString) {
		Matcher m = corpusPrefixPattern.matcher(sourceAsString);
		if (m.find()) {
			return m.group(2);
		}
		return null;
	}

	@Override
	protected E loadObjectFromHit(SearchHit hit, URI uri, String indexName) {
		if (hit.getSource() != null) {
			String eclass = null;
			if (hit.getFields().containsKey("eClass")) {
				eclass = hit.getFields().get("eClass").getValue();
			}
			return loadObjectFromString(hit.getId(), indexName, uri, eclass,
					hit.getSourceAsString());// loadResourceFromString(hit.getId(),
												// hit.getSourceAsString(),
												// indexName);
		} else if (!hit.getFields().isEmpty()) {
			return loadEntityFromSearchHit(hit, uri, hit.getId(), indexName);
		}
		return null;
	}

	private E loadEntityFromSearchHit(SearchHit hit, URI uri, String id,
			String indexName) {
		E entity = null;

		if (hit.getFields().containsKey("eClass")) {
			entity = createObject(hit.getFields().get("eClass").getValue()
					.toString());
		}
		if (entity == null)
			return null;
		Resource resource = connectionProvider.getEmfResourceSet()
				.createResource(uri);
		resource.getContents().add(entity);
		entity.set_id(id);

		if (hit.getFields().containsKey("name")) {
			entity.setName(hit.getFields().get("name").getValue().toString());
		}

		// type and subtype
		if (hit.getFields().containsKey("type")) {
			entity.setType(hit.getFields().get("type").getValue().toString());
		}
		if (hit.getFields().containsKey("subtype")) {
			entity.setSubtype(hit.getFields().get("subtype").getValue()
					.toString());
		}

		// visiblity
		if (hit.getFields().containsKey("visibility")) {
			entity.setVisibility(hit.getFields().get("visibility").getValue()
					.toString());
		}

		// readers
		if (hit.getFields().containsKey("readers")) {
			for (Object s : hit.getFields().get("readers").getValues()) {
				entity.getReaders().add((String) s);
			}
		}

		if (hit.getFields().containsKey("updaters")) {
			for (Object s : hit.getFields().get("updaters").getValues()) {
				entity.getUpdaters().add((String) s);
			}
		}

		// relations
		if (hit.getFields().containsKey("relations")) {
			List<BTSRelation> relations = extractRelationsFromObjectString((String) hit
					.getFields().get("relations").getValue());
			if (relations != null) {
				for (BTSRelation r : relations) {
					entity.getRelations().add(r);
				}
			}
		}

		if (hit.getFields().containsKey("words")) {

			List<BTSWord> words = extractWordsFromObjectString((String) hit
					.getFields().get("words").getValue());
			if (words != null) {
				BTSLemmaEntry lemma = (BTSLemmaEntry) entity;
				for (BTSWord w : words) {
					lemma.getWords().add(w);
				}

			}
		}
		if (hit.getFields().containsKey("translations")) {
			List<BTSTranslation> translations = extractLemmaTranslationsFromObjectString((String) hit
					.getFields().get("translations").getValue());
			if (translations != null) {
				BTSLemmaEntry lemma = (BTSLemmaEntry) entity;
				for (BTSTranslation t : translations) {
					lemma.getTranslations().getTranslations().add(t);
				}
			}
		}
		// System.out.println(jo);
		entity.setDBCollectionKey(indexName);
		if (hit.getFields().containsKey("revisionState")) {

			entity.setRevisionState(hit.getFields().get("revisionState")
					.getValue().toString());
		}

		return entity;
	}

	protected E createObject(String eClass) {
		// String eClass = null;
		// Gson gson = new Gson();
		// // Phone fooFromJson = gson.fromJson(jsonString, Phone.class);
		// JsonObject json = gson.fromJson(jo, JsonObject.class);
		// if (json != null)
		// {
		// JsonElement mem = json.get("eClass");
		// if (mem != null)
		// {
		// eClass = mem.getAsString();
		// }
		// }
		if (eClass != null) {
			if (eClass.endsWith("BTSAnnotation")) {
				return (E) BtsCorpusModelFactory.eINSTANCE
						.createBTSAnnotation();
			} else if (eClass.endsWith("BTSImage")) {
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSImage();
			} else if (eClass.endsWith("BTSLemmaEntry")) {
				return (E) BtsCorpusModelFactory.eINSTANCE
						.createBTSLemmaEntry();
			} else if (eClass.endsWith("BTSTCObject")) {
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSTCObject();
			} else if (eClass.endsWith("BTSTextCorpus")) {
				return (E) BtsCorpusModelFactory.eINSTANCE
						.createBTSTextCorpus();
			} else if (eClass.endsWith("BTSText")) {
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSText();
			} else if (eClass.endsWith("BTSThsEntry")) {
				return (E) BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
			}
		}
		return null;

	}

	protected abstract E createObject();
}
