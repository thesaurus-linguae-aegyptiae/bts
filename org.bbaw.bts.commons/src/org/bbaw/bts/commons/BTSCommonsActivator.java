package org.bbaw.bts.commons;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class BTSCommonsActivator extends AbstractUIPlugin
{

	// The plug-in ID
	/** id of plaugin. */
	public static final String PLUGIN_ID = "org.bbaw.pdr.ae.common"; //$NON-NLS-1$

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static BTSCommonsActivator getDefault()
	{
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 * 
	 * @param path
	 *            the path.
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(final String path)
	{
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/** private image registry initialiazation. */
	private boolean _imageRegistryInitialised = false;

	private static String _aeHome = null;

	/** shared instance. */
	private static BTSCommonsActivator plugin;

	private static int _projectID = -1;

	/**
	 * The constructor.
	 */
	public BTSCommonsActivator()
	{
	}

	//	/**
	//	 * init image registry.
	//	 * 
	//	 * @param reg
	//	 *            registry
	//	 */
	//	@Override
	//	protected final void initializeImageRegistry(final ImageRegistry reg)
	//	{
	//
	//		reg.put(IconsInternal.ADD, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ADD));
	//		reg.put(IconsInternal.ASPECT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT));
	//		reg.put(IconsInternal.ASPECT_ADD, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_ADD));
	//
	//		reg.put(IconsInternal.ASPECT_DELETE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_DELETE));
	//		reg.put(IconsInternal.ASPECT_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_EDIT));
	//		reg.put(IconsInternal.ASPECT_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_ERROR));
	//		reg.put(IconsInternal.ASPECT_NEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_NEW));
	//		reg.put(IconsInternal.ASPECT_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_REMOVE));
	//		reg.put(IconsInternal.ASPECT_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_WARNING));
	//		reg.put(IconsInternal.ASPECT_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_UPDATED));
	//		reg.put(IconsInternal.ASPECT_ADD_SAME_PERSON,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_ADD_SAME_PERSON));
	//		reg.put(IconsInternal.ASPECT_ADD_SAME_SOURCE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_ADD_SAME_SOURCE));
	//
	//		reg.put(IconsInternal.ASPECTS, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECTS));
	//		reg.put(IconsInternal.ASPECTS_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECTS_NEW));
	//		reg.put(IconsInternal.ASPECTS_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECTS_UPDATED));
	//		reg.put(IconsInternal.ASPECT_COPY,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ASPECT_COPY));
	//
	//		reg.put(IconsInternal.BACKUP, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BACKUP));
	//		reg.put(IconsInternal.BACKUP_LOAD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BACKUP_LOAD));
	//		reg.put(IconsInternal.BACKUP_SAVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BACKUP_SAVE));
	//		reg.put(IconsInternal.BASEX, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BASEX));
	//		reg.put(IconsInternal.BELONGING, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BELONGING));
	//		reg.put(IconsInternal.BELONGING_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BELONGING_ADD));
	//		reg.put(IconsInternal.BELONGING_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BELONGING_REMOVE));
	//		reg.put(IconsInternal.BROWSER, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.BROWSER));
	//		reg.put(IconsInternal.CANCEL, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CANCEL));
	//
	//		reg.put(IconsInternal.CLASSIFICATION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION));
	//		reg.put(IconsInternal.CLASSIFICATION_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_ADD));
	//		reg.put(IconsInternal.CLASSIFICATION_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_EDIT));
	//		reg.put(IconsInternal.CLASSIFICATION_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_ERROR));
	//		reg.put(IconsInternal.CLASSIFICATION_NAME,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_NAME));
	//		reg.put(IconsInternal.CLASSIFICATION_NAME_NORM,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_NAME_NORM));
	//		reg.put(IconsInternal.CLASSIFICATION_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_NEW));
	//		reg.put(IconsInternal.CLASSIFICATION_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_QUESTION));
	//		reg.put(IconsInternal.CLASSIFICATION_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_REMOVE));
	//		reg.put(IconsInternal.CLASSIFICATION_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATION_WARNING));
	//		reg.put(IconsInternal.CLASSIFICATIONS,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CLASSIFICATIONS));
	//		reg.put(IconsInternal.COMMENT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.COMMENT));
	//		reg.put(IconsInternal.CONCURRENCE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONCURRENCE));
	//		reg.put(IconsInternal.CONCURRENCE_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONCURRENCE_ADD));
	//		reg.put(IconsInternal.CONCURRENCE_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONCURRENCE_EDIT));
	//		reg.put(IconsInternal.CONCURRENCE_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONCURRENCE_ERROR));
	//		reg.put(IconsInternal.CONCURRENCE_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONCURRENCE_REMOVE));
	//		reg.put(IconsInternal.CONFIGURATION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONFIGURATION));
	//		reg.put(IconsInternal.CONFIGURATION_LOAD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONFIGURATION_LOAD));
	//		reg.put(IconsInternal.CONFIGURATION_SAVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.CONFIGURATION_SAVE));
	//
	//		reg.put(IconsInternal.DATETIME, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DATETIME));
	//		reg.put(IconsInternal.DECORATION_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_ADD));
	//		reg.put(IconsInternal.DECORATION_ASPECT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_ASPECT));
	//		reg.put(IconsInternal.DECORATION_CANCEL,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_CANCEL));
	//		reg.put(IconsInternal.DECORATION_CONCURRENCE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_CONCURRENCE));
	//		reg.put(IconsInternal.DECORATION_DELETE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_DELETE));
	//		reg.put(IconsInternal.DECORATION_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_EDIT));
	//		reg.put(IconsInternal.DECORATION_EDITOR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_EDITOR));
	//		reg.put(IconsInternal.DECORATION_IDENTIFIER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_IDENTIFIER));
	//		reg.put(IconsInternal.DECORATION_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_ERROR));
	//		reg.put(IconsInternal.DECORATION_LOCK,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_LOCK));
	//
	//		reg.put(IconsInternal.DECORATION_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_NEW));
	//		reg.put(IconsInternal.DECORATION_OK,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_OK));
	//		reg.put(IconsInternal.DECORATION_PENDING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_PENDING));
	//		reg.put(IconsInternal.DECORATION_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_QUESTION));
	//		reg.put(IconsInternal.DECORATION_QUICK,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_QUICK));
	//		reg.put(IconsInternal.DECORATION_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_REMOVE));
	//		reg.put(IconsInternal.DECORATION_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_WARNING));
	//		reg.put(IconsInternal.DECORATION_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DECORATION_UPDATED));
	//
	//		reg.put(IconsInternal.DELETE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DELETE));
	//		reg.put(IconsInternal.DOCUMENT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENT));
	//		reg.put(IconsInternal.DOCUMENTS, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENTS));
	//		reg.put(IconsInternal.DOCUMENT_EXPORT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENT_EXPORT));
	//		reg.put(IconsInternal.DOCUMENT_HTML,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENT_HTML));
	//		reg.put(IconsInternal.DOCUMENT_PDF,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENT_PDF));
	//		reg.put(IconsInternal.DOCUMENT_TEXT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENT_TEXT));
	//		reg.put(IconsInternal.DOCUMENT_XML,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.DOCUMENT_XML));
	//
	//		reg.put(IconsInternal.EDIT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.EDIT));
	//		reg.put(IconsInternal.EDIT_SYMBOL,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.EDIT_SYMBOL));
	//
	//		reg.put(IconsInternal.ERROR, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.ERROR));
	//		reg.put(IconsInternal.EXIT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.EXIT));
	//		reg.put(IconsInternal.FILTER, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.FILTER));
	//		reg.put(IconsInternal.HELP, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.HELP));
	//		reg.put(IconsInternal.GROUP, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.GROUP));
	//
	//		reg.put(IconsInternal.IDENTIFIER, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIER));
	//		reg.put(IconsInternal.IDENTIFIER_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIER_ADD));
	//		reg.put(IconsInternal.IDENTIFIERS,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIERS));
	//
	//		reg.put(IconsInternal.IDENTIFIER_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIER_EDIT));
	//		reg.put(IconsInternal.IDENTIFIER_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIER_ERROR));
	//		reg.put(IconsInternal.IDENTIFIER_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIER_REMOVE));
	//		reg.put(IconsInternal.IDENTIFIER_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.IDENTIFIER_WARNING));
	//		reg.put(IconsInternal.INFORMATION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.INFORMATION));
	//
	//		reg.put(IconsInternal.KEY, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.KEY));
	//
	//		reg.put(IconsInternal.LANGUAGE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.LANGUAGE));
	//		reg.put(IconsInternal.MANUAL, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MANUAL));
	//		reg.put(IconsInternal.MARKUP, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP));
	//		reg.put(IconsInternal.MARKUP_ADD, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_ADD));
	//		reg.put(IconsInternal.MARKUP_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_EDIT));
	//		reg.put(IconsInternal.MARKUP_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_ERROR));
	//		reg.put(IconsInternal.MARKUP_NEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_NEW));
	//		reg.put(IconsInternal.MARKUP_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_QUESTION));
	//		reg.put(IconsInternal.MARKUP_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_REMOVE));
	//		reg.put(IconsInternal.MARKUP_LIGHTNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.MARKUP_LIGHTNING));
	//
	//		reg.put(IconsInternal.NEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.NEW));
	//		reg.put(IconsInternal.NEXT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.NEXT));
	//		reg.put(IconsInternal.NO, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.NO));
	//		reg.put(IconsInternal.NORMNAME, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.NORMNAME));
	//		reg.put(IconsInternal.OK, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.OK));
	//		reg.put(IconsInternal.PERSON, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON));
	//		reg.put(IconsInternal.PERSON_ADD, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_ADD));
	//		reg.put(IconsInternal.PERSON_DELETE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_DELETE));
	//		reg.put(IconsInternal.PERSON_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_EDIT));
	//		reg.put(IconsInternal.PERSON_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_ERROR));
	//		reg.put(IconsInternal.PERSON_NEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_NEW));
	//		reg.put(IconsInternal.PERSON_QUICK,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_QUICK));
	//		reg.put(IconsInternal.PERSON_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_REMOVE));
	//		reg.put(IconsInternal.PERSON_UNDEFINED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_UNDEFINED));
	//		reg.put(IconsInternal.PERSON_UNDEFINED_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_UNDEFINED_NEW));
	//		reg.put(IconsInternal.PERSON_UNDEFINED_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_UNDEFINED_UPDATED));
	//
	//		reg.put(IconsInternal.PERSON_ASPECT_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_ASPECT_EDIT));
	//
	//		reg.put(IconsInternal.PERSON_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_UPDATED));
	//
	//		reg.put(IconsInternal.PERSON_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSON_WARNING));
	//		reg.put(IconsInternal.PERSONS, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSONS));
	//		reg.put(IconsInternal.PERSONS_UNDEFINED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSONS_UNDEFINED));
	//		reg.put(IconsInternal.PERSONS_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSONS_NEW));
	//		reg.put(IconsInternal.PERSONS_UNDEFINED_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSONS_UNDEFINED_NEW));
	//		reg.put(IconsInternal.PERSONS_UNDEFINED_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSONS_UNDEFINED_UPDATED));
	//
	//		reg.put(IconsInternal.PERSONS_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSONS_UPDATED));
	//
	//		reg.put(IconsInternal.PERSPECTIVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSPECTIVE));
	//		reg.put(IconsInternal.PERSPECTIVE_ADD_VIEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PERSPECTIVE_ADD_VIEW));
	//		reg.put(IconsInternal.PLACE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE));
	//		reg.put(IconsInternal.PLACE_ADD, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_ADD));
	//		reg.put(IconsInternal.PLACE_DEFINED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_DEFINED));
	//		reg.put(IconsInternal.PLACE_EDIT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_EDIT));
	//		reg.put(IconsInternal.PLACE_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_ERROR));
	//		reg.put(IconsInternal.PLACE_NEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_NEW));
	//		reg.put(IconsInternal.PLACE_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_REMOVE));
	//		reg.put(IconsInternal.PLACE_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PLACE_WARNING));
	//		reg.put(IconsInternal.PREFERENCES,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PREFERENCES));
	//
	//		reg.put(IconsInternal.PREVIOUS, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.PREVIOUS));
	//		reg.put(IconsInternal.QUICK, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.QUICK));
	//		reg.put(IconsInternal.REFERENCE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE));
	//		reg.put(IconsInternal.REFERENCE_ASPECTS,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_ASPECTS));
	//
	//		reg.put(IconsInternal.REFERENCE_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_ADD));
	//		reg.put(IconsInternal.REFERENCE_DELETE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_DELETE));
	//		reg.put(IconsInternal.REFERENCE_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_ERROR));
	//		reg.put(IconsInternal.REFERENCE_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_NEW));
	//		reg.put(IconsInternal.REFERENCE_EDIT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_EDIT));
	//		reg.put(IconsInternal.REFERENCE_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_UPDATED));
	//
	//		reg.put(IconsInternal.REFERENCE_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_QUESTION));
	//		reg.put(IconsInternal.REFERENCE_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_REMOVE));
	//		reg.put(IconsInternal.REFERENCE_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_WARNING));
	//		reg.put(IconsInternal.REFERENCES, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCES));
	//		reg.put(IconsInternal.REFERENCES_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCES_NEW));
	//		reg.put(IconsInternal.REFERENCES_UPDATED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCES_UPDATED));
	//
	//		reg.put(IconsInternal.REFERENCE_ARTICLE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_ARTICLE));
	//		reg.put(IconsInternal.REFERENCE_AUTOGRAPH,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_AUTOGRAPH));
	//		reg.put(IconsInternal.REFERENCE_BOOK,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BOOK));
	//		reg.put(IconsInternal.REFERENCE_CASSETTE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_CASSETTE));
	//		reg.put(IconsInternal.REFERENCE_CD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_CD));
	//		reg.put(IconsInternal.REFERENCE_COLLECTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_COLLECTION));
	//		reg.put(IconsInternal.REFERENCE_COMPOSITION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_COMPOSITION));
	//		reg.put(IconsInternal.REFERENCE_DATABASE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_DATABASE));
	//		reg.put(IconsInternal.REFERENCE_ENCYCLOPEDIA,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_ENCYCLOPEDIA));
	//		reg.put(IconsInternal.REFERENCE_IMAGE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_IMAGE));
	//		reg.put(IconsInternal.REFERENCE_JOKE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_JOKE));
	//		reg.put(IconsInternal.REFERENCE_LETTER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_LETTER));
	//		reg.put(IconsInternal.REFERENCE_MAP,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_MAP));
	//		reg.put(IconsInternal.REFERENCE_MICROFILM,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_MICROFILM));
	//		reg.put(IconsInternal.REFERENCE_MOVIE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_MOVIE));
	//		reg.put(IconsInternal.REFERENCE_PERFORMANCE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_PERFORMANCE));
	//		reg.put(IconsInternal.REFERENCE_PERIODICAL,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_PERIODICAL));
	//		reg.put(IconsInternal.REFERENCE_THEATRE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_THEATRE));
	//		reg.put(IconsInternal.REFERENCE_BLUEFOLDER_MUCIC,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BLUEFOLDER_MUCIC));
	//		reg.put(IconsInternal.REFERENCE_BLUEFOLDERS,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BLUEFOLDERS));
	//		reg.put(IconsInternal.REFERENCE_BLUEFOLDER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BLUEFOLDER));
	//		reg.put(IconsInternal.REFERENCE_BLUEDOCUMENT_MUSIC,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BLUEDOCUMENT_MUSIC));
	//		reg.put(IconsInternal.REFERENCE_BLUEFOLDER_FILM,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BLUEFOLDER_FILM));
	//		reg.put(IconsInternal.REFERENCE_CLIPBOARD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_CLIPBOARD));
	//		reg.put(IconsInternal.REFERENCE_DRAWER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_DRAWER));
	//		reg.put(IconsInternal.REFERENCE_FOLDER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_FOLDER));
	//		reg.put(IconsInternal.REFERENCE_FOLDERS,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_FOLDERS));
	//		reg.put(IconsInternal.REFERENCE_FOLDER_MUSIC,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_FOLDER_MUSIC));
	//		reg.put(IconsInternal.REFERENCE_MUSIC_NOTE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_MUSIC_NOTE));
	//		reg.put(IconsInternal.REFERENCE_PAPER_BAG,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_PAPER_BAG));
	//		reg.put(IconsInternal.REFERENCE_PIANO,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_PIANO));
	//		reg.put(IconsInternal.REFERENCE_BUILDING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_BUILDING));
	//
	//		reg.put(IconsInternal.REFERENCE_CHAPTER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_CHAPTER));
	//		reg.put(IconsInternal.REFERENCE_GAME,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_GAME));
	//		reg.put(IconsInternal.REFERENCE_GROUP,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_GROUP));
	//		reg.put(IconsInternal.REFERENCE_NEWSPAPER,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_NEWSPAPER));
	//		reg.put(IconsInternal.REFERENCE_PERSON_FEMALE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_PERSON_FEMALE));
	//		reg.put(IconsInternal.REFERENCE_PERSON_MALE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_PERSON_MALE));
	//
	//		reg.put(IconsInternal.REFERENCE_COPY,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REFERENCE_COPY));
	//
	//		reg.put(IconsInternal.REDO, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REDO));
	//		reg.put(IconsInternal.UNDO, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.UNDO));
	//
	//		reg.put(IconsInternal.RELATION, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION));
	//		reg.put(IconsInternal.RELATION_ADD,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION_ADD));
	//		reg.put(IconsInternal.RELATION_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION_ERROR));
	//		reg.put(IconsInternal.RELATION_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION_NEW));
	//		reg.put(IconsInternal.RELATION_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION_QUESTION));
	//		reg.put(IconsInternal.RELATION_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION_REMOVE));
	//		reg.put(IconsInternal.RELATIONSTATEMENTS,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATIONSTATEMENTS));
	//		reg.put(IconsInternal.RELATIONSTATEMENTS_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATIONSTATEMENTS_ERROR));
	//		reg.put(IconsInternal.RELATIONSTATEMENTS_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATIONSTATEMENTS_QUESTION));
	//		reg.put(IconsInternal.RELATION_TABLE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.RELATION_TABLE));
	//
	//		reg.put(IconsInternal.REMOVE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REMOVE));
	//		reg.put(IconsInternal.REPOSITORY, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REPOSITORY));
	//		reg.put(IconsInternal.REPOSITORY_CONNECTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REPOSITORY_CONNECTION));
	//		reg.put(IconsInternal.REPOSITORY_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.REPOSITORY_WARNING));
	//		reg.put(IconsInternal.SEARCH, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.SEARCH));
	//		reg.put(IconsInternal.SEARCH_ADVANCED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.SEARCH_ADVANCED));
	//		reg.put(IconsInternal.SEARCH_EXPERT,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.SEARCH_EXPERT));
	//		reg.put(IconsInternal.SORT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.SORT));
	//		reg.put(IconsInternal.TIME, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME));
	//		reg.put(IconsInternal.TEMPLATE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TEMPLATE));
	//		reg.put(IconsInternal.TEMPLATES, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TEMPLATES));
	//		reg.put(IconsInternal.TEMPLATE_MARKUP,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TEMPLATE_MARKUP));
	//
	//		reg.put(IconsInternal.SORT_ALPHABETIC_ASC,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.SORT_ALPHABETIC_ASC));
	//		reg.put(IconsInternal.SORT_ALPHABETIC_DESC,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.SORT_ALPHABETIC_DESC));
	//
	//		reg.put(IconsInternal.TIME_ADD, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_ADD));
	//		reg.put(IconsInternal.TIME_DEFINED,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_DEFINED));
	//		reg.put(IconsInternal.TIME_EDIT, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_EDIT));
	//		reg.put(IconsInternal.TIME_ERROR, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_ERROR));
	//		reg.put(IconsInternal.TIME_NEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_NEW));
	//		reg.put(IconsInternal.TIME_REMOVE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_REMOVE));
	//		reg.put(IconsInternal.TIME_WARNING,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIME_WARNING));
	//		reg.put(IconsInternal.TIMEANDPLACE,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIMEANDPLACE));
	//		reg.put(IconsInternal.TIMEANDPLACE_ERROR,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIMEANDPLACE_ERROR));
	//		reg.put(IconsInternal.TIMEANDPLACE_NEW,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIMEANDPLACE_NEW));
	//		reg.put(IconsInternal.TIMEANDPLACE_QUESTION,
	//				ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TIMEANDPLACE_QUESTION));
	//		reg.put(IconsInternal.TREE, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.TREE));
	//		reg.put(IconsInternal.USER, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.USER));
	//		reg.put(IconsInternal.VIEW, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.VIEW));
	//		reg.put(IconsInternal.WARNING, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.WARNING));
	//		reg.put(IconsInternal.YES, ImageDescriptor.createFromFile(IconsInternal.class, IconsInternal.YES));
	//
	//		_imageRegistryInitialised = true;
	//	}

	/**
	 * Start method of RCP application.
	 * 
	 * @param context
	 *            context.
	 * @throws Exception
	 *             exception.
	 */
	@Override
	public final void start(final BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;
		//			IStatus status = new Status(IStatus.ERROR,Activator.PLUGIN_ID, "AE_HOME: " + AE_HOME);
		//			ILog iLogger = org.bbaw.pdr.ae.view.Activator.getILogger();
		//			iLogger.log(status);
	}

	/**
	 * Stop method of application.
	 * 
	 * @param context
	 *            context.
	 * @throws Exception
	 *             exception.
	 * */
	@Override
	public final void stop(final BundleContext context) throws Exception
	{
		if (_imageRegistryInitialised)
		{
			getImageRegistry().dispose();
			_imageRegistryInitialised = false;
		}
		plugin = null;
		super.stop(context);
	}

	public static void setProjectID(int projectID)
	{
		_projectID = projectID;

	}

	public static int getProjectID()
	{
		return _projectID;
	}

	public static String getBTSHome()
	{
		return null;
	}

}
