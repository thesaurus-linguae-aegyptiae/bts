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

import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;

/**
 * @author plutte
 *
 */
public class WordFormOccurrence {
	
	private BTSText text;
	
	private List<BTSCorpusObject> path;
	
	private List<BTSWord> matchingWords;
	
	private BTSSenctence matchingSentence;
	
	private List<BTSSenctence> coTextBefore;
	
	private List<BTSSenctence> coTextAfter;

	public WordFormOccurrence() {
	}
	/**
	 * @param matchingWord
	 * @param text2
	 */
	public WordFormOccurrence(BTSWord matchingWord, BTSText text) {
		this.text = text;
		this.matchingWords = new Vector<BTSWord>(1);
		this.matchingWords.add(matchingWord);
	}

	/**
	 * @return the text
	 */
	public BTSText getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(BTSText text) {
		this.text = text;
	}

	/**
	 * @return the path
	 */
	public List<BTSCorpusObject> getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(List<BTSCorpusObject> path) {
		this.path = path;
	}

	/**
	 * @return the matchingSentence
	 */
	public BTSSenctence getMatchingSentence() {
		return matchingSentence;
	}

	/**
	 * @param matchingSentence the matchingSentence to set
	 */
	public void setMatchingSentence(BTSSenctence matchingSentence) {
		this.matchingSentence = matchingSentence;
	}


	public List<BTSWord> getMatchingWords() {
		return matchingWords;
	}

	public void setMatchingWords(List<BTSWord> matchingWords) {
		this.matchingWords = matchingWords;
	}

	/**
	 * @return the coTextBefore
	 */
	public List<BTSSenctence> getCoTextBefore() {
		return coTextBefore;
	}

	/**
	 * @param coTextBefore the coTextBefore to set
	 */
	public void setCoTextBefore(List<BTSSenctence> coTextBefore) {
		this.coTextBefore = coTextBefore;
	}

	/**
	 * @return the coTextAfter
	 */
	public List<BTSSenctence> getCoTextAfter() {
		return coTextAfter;
	}

	/**
	 * @param coTextAfter the coTextAfter to set
	 */
	public void setCoTextAfter(List<BTSSenctence> coTextAfter) {
		this.coTextAfter = coTextAfter;
	}

}
