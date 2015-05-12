/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.core.dao.util;

/**
 * The Class DaoConstants provides constants for dao layer.
 *
 * @author Christoph Plutte
 */
public class DaoConstants
{
	/** The Constant VIEW_ALL_BTSANNOTATIONS. */
	public static final String VIEW_ALL_BTSANNOTATIONS = "project_corpus/all_btsannotations";


	/** The Constant VIEW_ALL_BTSIMAGESS. */
	public static final String VIEW_ALL_BTSIMAGESS = "project_corpus/all_btsimages";

	/** The Constant VIEW_ALL_BTSLISTENTRIES. */
	public static final String VIEW_ALL_BTSLISTENTRIES = "lemma/all_lemmaentry_objects";;

	/** The Constant VIEW_ALL_BTSTCOBJECTS. */
	public static final String VIEW_ALL_BTSTCOBJECTS = "project_corpus/all_btstcobjects";

	/** The Constant VIEW_ALL_BTSTEXTCORPUS. */
	public static final String VIEW_ALL_BTSTEXTCORPUS = "corpus/all_btstextcorpus";

	/** The Constant VIEW_ALL_BTSTEXTS. */
	public static final String VIEW_ALL_BTSTEXTS = "project_corpus/all_btstexts";


	/** The Constant VIEW_CORPUS_ROOT_OBJECTS. */
	public static final String VIEW_CORPUS_ROOT_OBJECTS = "objects/all_corpus_root_objects";

	/** The Constant VIEW_ALL_CORPUS_OBJECTS. */
	public static final String VIEW_ALL_CORPUS_OBJECTS = "project_corpus/all_corpus_objects";

	/** The Constant VIEW_ALL_BTSTHSENTRIES. */
	public static final String VIEW_ALL_BTSTHSENTRIES = "ths/all_thsentry_objects";

	/** The Constant VIEW_THS_ROOT_ENTRIES. */
	public static final String VIEW_THS_ROOT_ENTRIES = "ths/root_entries";


	/** The Constant VIEW_ALL_ACTIVE_BTSANNOTATIONS. */
	public static final String VIEW_ALL_ACTIVE_BTSANNOTATIONS = "project_corpus/all_active_btsannotations";


	/** The Constant VIEW_ALL_ACTIVE_BTSIMAGESS. */
	public static final String VIEW_ALL_ACTIVE_BTSIMAGESS = "project_corpus/all_active_btsimages";

	/** The Constant VIEW_ALL_ACTIVE_BTSLISTENTRIES. */
	public static final String VIEW_ALL_ACTIVE_BTSLISTENTRIES =  "lemma/all_active_lemmaentry_objects";

	/** The Constant VIEW_ALL_ACTIVE_BTSTCOBJECTS. */
	public static final String VIEW_ALL_ACTIVE_BTSTCOBJECTS = "project_corpus/all_active_btstcobjects";

	/** The Constant VIEW_ALL_ACTIVE_BTSTEXTCORPUS. */
	public static final String VIEW_ALL_ACTIVE_BTSTEXTCORPUS = "corpus/all_active_btstextcorpus";

	/** The Constant VIEW_ALL_ACTIVE_BTSTEXTS. */
	public static final String VIEW_ALL_ACTIVE_BTSTEXTS = "project_corpus/all_active_btstexts";


	/** The Constant VIEW_ALL_ACTIVE_CORPUS_OBJECTS. */
	public static final String VIEW_ALL_ACTIVE_CORPUS_OBJECTS = "project_corpus/all_active_corpus_objects";

	/** The Constant VIEW_ALL_ACTIVE_BTSTHSENTRIES. */
	public static final String VIEW_ALL_ACTIVE_BTSTHSENTRIES = "ths/all_active_thsentry_objects";


	/** The Constant VIEW_ALL_TERMINATED_BTSANNOTATIONS. */
	public static final String VIEW_ALL_TERMINATED_BTSANNOTATIONS = "project_corpus/all_terminated_btsannotations";

	/** The Constant VIEW_ALL_TERMINATED_BTSIMAGESS. */
	public static final String VIEW_ALL_TERMINATED_BTSIMAGESS = "project_corpus/all_terminated_btsimages";

	/** The Constant VIEW_ALL_TERMINATED_BTSLISTENTRIES. */
	public static final String VIEW_ALL_TERMINATED_BTSLISTENTRIES = "lemma/all_terminated_lemmaentry_objects";

	/** The Constant VIEW_ALL_TERMINATED_BTSTCOBJECTS. */
	public static final String VIEW_ALL_TERMINATED_BTSTCOBJECTS = "project_corpus/all_terminated_btstcobjects";

	/** The Constant VIEW_ALL_TERMINATED_BTSTEXTCORPUS. */
	public static final String VIEW_ALL_TERMINATED_BTSTEXTCORPUS = "corpus/all_terminated_btstextcorpus";

	/** The Constant VIEW_ALL_TERMINATED_BTSTEXTS. */
	public static final String VIEW_ALL_TERMINATED_BTSTEXTS = "project_corpus/all_terminated_btstexts";

	/** The Constant VIEW_ALL_TERMINATED_CORPUS_OBJECTS. */
	public static final String VIEW_ALL_TERMINATED_CORPUS_OBJECTS = "project_corpus/all_terminated_corpus_objects";

	/** The Constant VIEW_ALL_TERMINATED_BTSTHSENTRIES. */
	public static final String VIEW_ALL_TERMINATED_BTSTHSENTRIES = "ths/terminated_entries";

	/** The Constant CHANGES_HEARTBEAT. */
	public static final long CHANGES_HEARTBEAT = 1000;

	/** The Constant ID_STRING. */
	public static final String ID_STRING = "_id";


	/** The Constant ADMIN. */
	public static final String ADMIN = "/admin/";

	/** The Constant DESIGN_DOC_PATH. */
	public static final String DESIGN_DOC_PATH = "designdocs";

	/** The Constant ID_PATTERN. */
	public static final String ID_PATTERN = "(\\{\"_?id\":\\s*\")([A-Za-z0-9\\-\\.]*)(.*)";
	
	/** The Constant NAME_PATTERN. */
	public static final String NAME_PATTERN = "(\"name\":\\s*\")([^\"]+)\"";

	public static final String VISIBILITY_PATTERN = "(\"visibility\":\\s*\")([^\"]+)\"";

	public static final String READERS_PATTERN = "(\"readers\":\\s*)(\\[)([^\\]]*)(\\])";
	
	public static final String UPDATERS_PATTERN = "(\"updaters\":\\s*)(\\[)([^\\]]*)(\\])";

	public static final String MEMBER_PATTERN = "(\\s*\")([^\"]*)(\"\\s*,?)";

	public static final String REVISIONSTATE_PATTERN = "(\"revisionState\":\\s*\")([^\"]+)\"";

	public static final String ECLASS_PATTERN = "(\"eClass\":\\s*\")([^\"]*)\"";

	public static final String TYPE_PATTERN = "(\"type\":\\s*\")([^\"]+)\"";


	public static final String SUBTYPE_PATTERN = "(\"subtype\":\\s*\")([^\"]*)\"";
	
	/** The Constant CORPUS. */
	public static final String CORPUS = "/corpus/";

	/** The Constant PROJECT_ADMIN. */
	public static final String PROJECT_ADMIN = "project_admin";

	/** The Constant PROJECT_CORPUS. */
	public static final String PROJECT_CORPUS = "/project_corpus/";

	/** The Constant REPLICATOR_SUFFIX_FROM_REMOTE. */
	public static final String REPLICATOR_SUFFIX_FROM_REMOTE = "_from_remote";

	/** The Constant REPLICATOR_SUFFIX_TO_REMOTE. */
	public static final String REPLICATOR_SUFFIX_TO_REMOTE = "_to_remote";

	/** The Constant REPLICATOR. */
	public static final String REPLICATOR = "_replicator";

	/** The Constant PERCOLATOR. */
	public static final String PERCOLATOR = ".percolator";

	/** The Constant RESOURCE_SET. */
	public static final String RESOURCE_SET = "resource_set";

	/** The Constant DB_CLIENT_POOL_MAP. */
	public static final String DB_CLIENT_POOL_MAP = "db_client_pool_map";

	/** The Constant DAO_FACTORY_EXTENSION_POINT_ID. */
	public static final String DAO_FACTORY_EXTENSION_POINT_ID = "org.bbaw.bts.core.dao.daoFactory";

	/** The Constant QUERY_ID_REGISTRY. */
	public static final String QUERY_ID_REGISTRY = "query_id_registry";

	/** The Constant VIEW_ALL_DBLEASES. */
	public static final String VIEW_ALL_DBLEASES = "notification/all_dbleases";

	/** The Constant NOTIFICATION. */
	public static final String NOTIFICATION = "notification";

	public static final String VIEW_LEMMA_ROOT_ENTRIES = "lemma/root_entries";

	public static final String VIEW_IMAGE_ROOT_ENTRIES = "image/root_entries";


	public static final String VIEW_ALL_BTSABSTRACTTEXTS = "atext/all_btsabstracttexts";


	public static final String VIEW_ALL_ACTIVE_BTSABSTRACTTEXTS = "atext/all_active_btsabstracttexts";


	public static final String VIEW_ALL_TERMINATED_BTSABSTRACTTEXTS = "atext/all_terminated_btsabstracttexts";


	public static final String VIEW_ATEXT_ROOT_ENTRIES = "atext/all_root_entries";















}
