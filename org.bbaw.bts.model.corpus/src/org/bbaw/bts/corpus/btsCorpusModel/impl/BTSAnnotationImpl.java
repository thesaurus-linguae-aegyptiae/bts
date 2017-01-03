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
package org.bbaw.bts.corpus.btsCorpusModel.impl;

import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTS Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BTSAnnotationImpl extends BTSCorpusObjectImpl implements BTSAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTSAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtsCorpusModelPackage.Literals.BTS_ANNOTATION;
	}

} //BTSAnnotationImpl
