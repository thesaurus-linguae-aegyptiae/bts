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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage
 * @generated
 */
public interface BtsCorpusModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtsCorpusModelFactory eINSTANCE = org.bbaw.bts.corpus.btsCorpusModel.impl.BtsCorpusModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BTSTC Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTSTC Object</em>'.
	 * @generated
	 */
	BTSTCObject createBTSTCObject();

	/**
	 * Returns a new object of class '<em>BTS Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Text</em>'.
	 * @generated
	 */
	BTSText createBTSText();

	/**
	 * Returns a new object of class '<em>BTS Lemma Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Lemma Entry</em>'.
	 * @generated
	 */
	BTSLemmaEntry createBTSLemmaEntry();

	/**
	 * Returns a new object of class '<em>BTS Passport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport</em>'.
	 * @generated
	 */
	BTSPassport createBTSPassport();

	/**
	 * Returns a new object of class '<em>BTS Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Annotation</em>'.
	 * @generated
	 */
	BTSAnnotation createBTSAnnotation();

	/**
	 * Returns a new object of class '<em>BTS Passport Entry Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Entry Group</em>'.
	 * @generated
	 */
	BTSPassportEntryGroup createBTSPassportEntryGroup();

	/**
	 * Returns a new object of class '<em>BTS Text Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Text Corpus</em>'.
	 * @generated
	 */
	BTSTextCorpus createBTSTextCorpus();

	/**
	 * Returns a new object of class '<em>BTS Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Image</em>'.
	 * @generated
	 */
	BTSImage createBTSImage();

	/**
	 * Returns a new object of class '<em>BTS Corpus Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Corpus Header</em>'.
	 * @generated
	 */
	BTSCorpusHeader createBTSCorpusHeader();

	/**
	 * Returns a new object of class '<em>BTS Ths Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Ths Entry</em>'.
	 * @generated
	 */
	BTSThsEntry createBTSThsEntry();

	/**
	 * Returns a new object of class '<em>BTS Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Word</em>'.
	 * @generated
	 */
	BTSWord createBTSWord();

	/**
	 * Returns a new object of class '<em>BTS Graphic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Graphic</em>'.
	 * @generated
	 */
	BTSGraphic createBTSGraphic();

	/**
	 * Returns a new object of class '<em>BTS Senctence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Senctence</em>'.
	 * @generated
	 */
	BTSSenctence createBTSSenctence();

	/**
	 * Returns a new object of class '<em>BTS Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Marker</em>'.
	 * @generated
	 */
	BTSMarker createBTSMarker();

	/**
	 * Returns a new object of class '<em>BTS Ambivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Ambivalence</em>'.
	 * @generated
	 */
	BTSAmbivalence createBTSAmbivalence();

	/**
	 * Returns a new object of class '<em>BTS Lemma Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Lemma Case</em>'.
	 * @generated
	 */
	BTSLemmaCase createBTSLemmaCase();

	/**
	 * Returns a new object of class '<em>BTS Passport Entry Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Passport Entry Item</em>'.
	 * @generated
	 */
	BTSPassportEntryItem createBTSPassportEntryItem();

	/**
	 * Returns a new object of class '<em>BTS Abstract Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Abstract Text</em>'.
	 * @generated
	 */
	BTSAbstractText createBTSAbstractText();

	/**
	 * Returns a new object of class '<em>BTS Abstract Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTS Abstract Paragraph</em>'.
	 * @generated
	 */
	BTSAbstractParagraph createBTSAbstractParagraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtsCorpusModelPackage getBtsCorpusModelPackage();
	
	BTSSenctence createBTSSenctence(boolean setId);

	BTSWord createBTSWord(boolean setId);
	BTSMarker createBTSMarker(boolean setId);
	BTSAmbivalence createBTSAmbivalence(boolean setId);
	BTSLemmaCase createBTSLemmaCase(boolean setId);
	
	BTSTextContent createBTSTextContent(boolean setId);

	BTSTextContent createBTSTextContent();
} //BtsCorpusModelFactory
