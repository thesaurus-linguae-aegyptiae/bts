/**
 * This file is part of Thesaurus Linguae Aegyptiae, TLA.
 * 
 * The software TLA serves as a web interface for presenting and working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software TLA was developed at Free University Berlin, www.fu-berlin.de together with 
 * the Berlin-Brandenburg Academy of Sciences and Humanities, 
 * Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2016  Free University of Berlin and Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software TLA was developed by @author: Christoph Plutte.
 * 
 * TLA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * TLA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with TLA.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.core.commons.corpus;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;

/**
 * @author plutte
 *
 */
public class CorpusUtils {

	

	public static final String TYPE_PATH_DELIMITER = ".";

	public static final String ANNOTATION_RUBRUM_TYPE = "rubrum";
	
	public static final String SUBTEXT_TYPE = "subtext";
	
	public static final String EMPTY_TYPE = "error";


	public static String getTypeIdentifier(BTSIdentifiableItem object)
	{
		String typeIdentifier = getObjectClassName(object);
		if(object instanceof BTSObject)
		{
			BTSObject btsObject = (BTSObject) object;
			if (btsObject.getType() != null && !"".equals(btsObject.getType()))
			{
				typeIdentifier += TYPE_PATH_DELIMITER + btsObject.getType();

				if (btsObject.getSubtype() != null && !"".equals(btsObject.getSubtype()))
				{
					typeIdentifier += TYPE_PATH_DELIMITER + btsObject.getSubtype();
				}
			}
		}
		return typeIdentifier;
	}
	
	public static String getTypeIdentifier(String elementType, BTSConfigItem typeConfigItem, 
			BTSConfigItem subtypeConfigItem)
	{
		if (elementType != null && !"".equals(elementType))
		{
			if (typeConfigItem != null)
			{
				elementType += TYPE_PATH_DELIMITER + typeConfigItem.getValue();
				if (subtypeConfigItem != null)
				{
					elementType += TYPE_PATH_DELIMITER + subtypeConfigItem.getValue();
				}
			}
		}
		else
		{
			elementType = EMPTY_TYPE;
		}
		return elementType;
	}
	
	public static String getObjectClassName(BTSIdentifiableItem object)
	{
		if (object.eClass().getName().startsWith("BTSAbstractText")) {
			return BTSConstants.ABSTRACT_TEXT;
		}else if (object.eClass().getName().startsWith("BTSAnnotation")) {
			return BTSConstants.ANNOTATION;
		}
		else if (object.eClass().getName().startsWith("BTSTCObject")) {
			return BTSConstants.CORPUS_OBJECT;
		} else if (object.eClass().getName().startsWith("BTSImage")) {
			return BTSConstants.IMAGE;
		} else if (object.eClass().getName().startsWith("BTSLemmaEntry")) {
			return BTSConstants.WLIST_ENTRY;
		} 
		else if (object.eClass().getName().startsWith("BTSTextCorpus")) {
			return BTSConstants.TEXT_CORPUS;
		}
		else if (object.eClass().getName().startsWith("BTSText")) {
			return BTSConstants.TEXT;
		}
		  else if (object.eClass().getName().startsWith("BTSThsEntry")) {
			return BTSConstants.THS_ENTRY;
		} else if (object.eClass().getName().startsWith("BTSComment")) {
			return BTSConstants.COMMENT;
		}
		else
		{
			return EMPTY_TYPE;
		}
	}
}
