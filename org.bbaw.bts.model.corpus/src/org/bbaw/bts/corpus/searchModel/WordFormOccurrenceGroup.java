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
package org.bbaw.bts.corpus.searchModel;

import java.util.List;
import java.util.Vector;

/**
 * @author plutte
 *
 */
public class WordFormOccurrenceGroup {
	
	public static String GROUP_LEMMA = "lemma";
	
	public static String GROUP_TRANSLITERATION = "transliteration";

	public static String GROUP_TRANSLATION = "translation";

	public static String GROUP_FLEXION = "flexion";

	public static String GROUP_SPELLING = "spelling";

	
	private String value;
	
	private String label;
	
	private String groupType;
	
	private List<WordFormOccurrence> occurrences;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the occurrences
	 */
	public List<WordFormOccurrence> getOccurrences() {
		return occurrences;
	}

	/**
	 * @param occurrences the occurrences to set
	 */
	public void setOccurrences(List<WordFormOccurrence> occurrences) {
		this.occurrences = occurrences;
	}
	
	public void addOccurrence(WordFormOccurrence occurrence) {
		if (occurrence == null) return;
		if (this.occurrences == null)
		{
			this.occurrences = new Vector<WordFormOccurrence>();
		}
		this.occurrences.add(occurrence);
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

}
