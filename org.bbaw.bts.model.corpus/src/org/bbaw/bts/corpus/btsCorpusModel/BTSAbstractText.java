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
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
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
package org.bbaw.bts.corpus.btsCorpusModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTS Abstract Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractText()
 * @model
 * @generated
 */
public interface BTSAbstractText extends BTSCorpusObject {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' reference list.
	 * The list contents are of type {@link org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' reference list.
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#getBTSAbstractText_Paragraphs()
	 * @model
	 * @generated
	 */
	EList<BTSAbstractParagraph> getParagraphs();

} // BTSAbstractText
