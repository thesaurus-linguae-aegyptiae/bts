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

import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractParagraph;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusHeader;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryGroup;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntryItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtsCorpusModelPackageImpl extends EPackageImpl implements BtsCorpusModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCorpusObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btstcObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsLemmaEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextCorpusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsCorpusHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsThsEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsGraphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsSenctenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsSentenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAmbivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsLemmaCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsTextSentenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAmbivalenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsPassportEntryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAbstractTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btsAbstractParagraphEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtsCorpusModelPackageImpl() {
		super(eNS_URI, BtsCorpusModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BtsCorpusModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtsCorpusModelPackage init() {
		if (isInited) return (BtsCorpusModelPackage)EPackage.Registry.INSTANCE.getEPackage(BtsCorpusModelPackage.eNS_URI);

		// Obtain or create and register package
		BtsCorpusModelPackageImpl theBtsCorpusModelPackage = (BtsCorpusModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtsCorpusModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtsCorpusModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BtsmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBtsCorpusModelPackage.createPackageContents();

		// Initialize created meta-data
		theBtsCorpusModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtsCorpusModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtsCorpusModelPackage.eNS_URI, theBtsCorpusModelPackage);
		return theBtsCorpusModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSCorpusObject() {
		return btsCorpusObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSCorpusObject_Passport() {
		return (EReference)btsCorpusObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusObject_CorpusPrefix() {
		return (EAttribute)btsCorpusObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusObject_WorkPhase() {
		return (EAttribute)btsCorpusObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTCObject() {
		return btstcObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSText() {
		return btsTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSText_TextContent() {
		return (EReference)btsTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSLemmaEntry() {
		return btsLemmaEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSLemmaEntry_Ignore() {
		return (EAttribute)btsLemmaEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSLemmaEntry_Words() {
		return (EReference)btsLemmaEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSLemmaEntry_Translations() {
		return (EReference)btsLemmaEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassport() {
		return btsPassportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Date() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Children() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassport_Comment() {
		return (EAttribute)btsPassportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassport_Descriptions() {
		return (EReference)btsPassportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSPassport__GetPassportEntryByPath__String() {
		return btsPassportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSPassport__GetPassportEntryStringValueByPath__String() {
		return btsPassportEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAnnotation() {
		return btsAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntryGroup() {
		return btsPassportEntryGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryGroup_Items() {
		return (EReference)btsPassportEntryGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextCorpus() {
		return btsTextCorpusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTextCorpus_Header() {
		return (EReference)btsTextCorpusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSTextCorpus_Active() {
		return (EAttribute)btsTextCorpusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSImage() {
		return btsImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSImage_MediaType() {
		return (EAttribute)btsImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBTSImage__GetAttachement() {
		return btsImageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSCorpusHeader() {
		return btsCorpusHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_AuthorName() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_ProjectId() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSCorpusHeader_ProjectName() {
		return (EAttribute)btsCorpusHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSThsEntry() {
		return btsThsEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextContent() {
		return btsTextContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSTextContent_TextItems() {
		return (EReference)btsTextContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntry() {
		return btsPassportEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Provider() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Comment() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Type() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Value() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntry_Children() {
		return (EReference)btsPassportEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntry_Label() {
		return (EReference)btsPassportEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Name() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntry_Key() {
		return (EAttribute)btsPassportEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSWord() {
		return btsWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWord_Translation() {
		return (EReference)btsWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_WType() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_LType() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_LKey() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_FlexCode() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_WChar() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSWord_Value() {
		return (EAttribute)btsWordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSWord_Graphics() {
		return (EReference)btsWordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextItems() {
		return btsTextItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSGraphic() {
		return btsGraphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_InnerSentenceOrder() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Code() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Reference() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSGraphic_Ignored() {
		return (EAttribute)btsGraphicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSSenctence() {
		return btsSenctenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSSenctence_SentenceItems() {
		return (EReference)btsSenctenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSSenctence_Translation() {
		return (EReference)btsSenctenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSMarker() {
		return btsMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSMarker_Value() {
		return (EAttribute)btsMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSSentenceItem() {
		return btsSentenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAmbivalence() {
		return btsAmbivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAmbivalence_Cases() {
		return (EReference)btsAmbivalenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSLemmaCase() {
		return btsLemmaCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSLemmaCase_Scenario() {
		return (EReference)btsLemmaCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSTextSentenceItem() {
		return btsTextSentenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAmbivalenceItem() {
		return btsAmbivalenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSPassportEntryItem() {
		return btsPassportEntryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntryItem_Subtype() {
		return (EAttribute)btsPassportEntryItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSPassportEntryItem_SubValue() {
		return (EAttribute)btsPassportEntryItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_ExternalReferences() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_Timespan() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_Description() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSPassportEntryItem_Translation() {
		return (EReference)btsPassportEntryItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAbstractText() {
		return btsAbstractTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAbstractText_Paragraphs() {
		return (EReference)btsAbstractTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTSAbstractParagraph() {
		return btsAbstractParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBTSAbstractParagraph_Witnesses() {
		return (EReference)btsAbstractParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSAbstractParagraph_SortKey() {
		return (EAttribute)btsAbstractParagraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSAbstractParagraph_Type() {
		return (EAttribute)btsAbstractParagraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBTSAbstractParagraph_Name() {
		return (EAttribute)btsAbstractParagraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtsCorpusModelFactory getBtsCorpusModelFactory() {
		return (BtsCorpusModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		btsCorpusObjectEClass = createEClass(BTS_CORPUS_OBJECT);
		createEReference(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__PASSPORT);
		createEAttribute(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__CORPUS_PREFIX);
		createEAttribute(btsCorpusObjectEClass, BTS_CORPUS_OBJECT__WORK_PHASE);

		btstcObjectEClass = createEClass(BTSTC_OBJECT);

		btsTextEClass = createEClass(BTS_TEXT);
		createEReference(btsTextEClass, BTS_TEXT__TEXT_CONTENT);

		btsLemmaEntryEClass = createEClass(BTS_LEMMA_ENTRY);
		createEAttribute(btsLemmaEntryEClass, BTS_LEMMA_ENTRY__IGNORE);
		createEReference(btsLemmaEntryEClass, BTS_LEMMA_ENTRY__WORDS);
		createEReference(btsLemmaEntryEClass, BTS_LEMMA_ENTRY__TRANSLATIONS);

		btsPassportEClass = createEClass(BTS_PASSPORT);
		createEReference(btsPassportEClass, BTS_PASSPORT__DATE);
		createEReference(btsPassportEClass, BTS_PASSPORT__CHILDREN);
		createEAttribute(btsPassportEClass, BTS_PASSPORT__COMMENT);
		createEReference(btsPassportEClass, BTS_PASSPORT__DESCRIPTIONS);
		createEOperation(btsPassportEClass, BTS_PASSPORT___GET_PASSPORT_ENTRY_BY_PATH__STRING);
		createEOperation(btsPassportEClass, BTS_PASSPORT___GET_PASSPORT_ENTRY_STRING_VALUE_BY_PATH__STRING);

		btsAnnotationEClass = createEClass(BTS_ANNOTATION);

		btsPassportEntryGroupEClass = createEClass(BTS_PASSPORT_ENTRY_GROUP);
		createEReference(btsPassportEntryGroupEClass, BTS_PASSPORT_ENTRY_GROUP__ITEMS);

		btsTextCorpusEClass = createEClass(BTS_TEXT_CORPUS);
		createEReference(btsTextCorpusEClass, BTS_TEXT_CORPUS__HEADER);
		createEAttribute(btsTextCorpusEClass, BTS_TEXT_CORPUS__ACTIVE);

		btsImageEClass = createEClass(BTS_IMAGE);
		createEAttribute(btsImageEClass, BTS_IMAGE__MEDIA_TYPE);
		createEOperation(btsImageEClass, BTS_IMAGE___GET_ATTACHEMENT);

		btsCorpusHeaderEClass = createEClass(BTS_CORPUS_HEADER);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__AUTHOR_NAME);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__PROJECT_ID);
		createEAttribute(btsCorpusHeaderEClass, BTS_CORPUS_HEADER__PROJECT_NAME);

		btsThsEntryEClass = createEClass(BTS_THS_ENTRY);

		btsTextContentEClass = createEClass(BTS_TEXT_CONTENT);
		createEReference(btsTextContentEClass, BTS_TEXT_CONTENT__TEXT_ITEMS);

		btsPassportEntryEClass = createEClass(BTS_PASSPORT_ENTRY);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__PROVIDER);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__COMMENT);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__TYPE);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__VALUE);
		createEReference(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__CHILDREN);
		createEReference(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__LABEL);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__NAME);
		createEAttribute(btsPassportEntryEClass, BTS_PASSPORT_ENTRY__KEY);

		btsWordEClass = createEClass(BTS_WORD);
		createEReference(btsWordEClass, BTS_WORD__TRANSLATION);
		createEAttribute(btsWordEClass, BTS_WORD__WTYPE);
		createEAttribute(btsWordEClass, BTS_WORD__LTYPE);
		createEAttribute(btsWordEClass, BTS_WORD__LKEY);
		createEAttribute(btsWordEClass, BTS_WORD__FLEX_CODE);
		createEAttribute(btsWordEClass, BTS_WORD__WCHAR);
		createEAttribute(btsWordEClass, BTS_WORD__VALUE);
		createEReference(btsWordEClass, BTS_WORD__GRAPHICS);

		btsTextItemsEClass = createEClass(BTS_TEXT_ITEMS);

		btsGraphicEClass = createEClass(BTS_GRAPHIC);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__INNER_SENTENCE_ORDER);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__CODE);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__REFERENCE);
		createEAttribute(btsGraphicEClass, BTS_GRAPHIC__IGNORED);

		btsSenctenceEClass = createEClass(BTS_SENCTENCE);
		createEReference(btsSenctenceEClass, BTS_SENCTENCE__SENTENCE_ITEMS);
		createEReference(btsSenctenceEClass, BTS_SENCTENCE__TRANSLATION);

		btsMarkerEClass = createEClass(BTS_MARKER);
		createEAttribute(btsMarkerEClass, BTS_MARKER__VALUE);

		btsSentenceItemEClass = createEClass(BTS_SENTENCE_ITEM);

		btsAmbivalenceEClass = createEClass(BTS_AMBIVALENCE);
		createEReference(btsAmbivalenceEClass, BTS_AMBIVALENCE__CASES);

		btsLemmaCaseEClass = createEClass(BTS_LEMMA_CASE);
		createEReference(btsLemmaCaseEClass, BTS_LEMMA_CASE__SCENARIO);

		btsTextSentenceItemEClass = createEClass(BTS_TEXT_SENTENCE_ITEM);

		btsAmbivalenceItemEClass = createEClass(BTS_AMBIVALENCE_ITEM);

		btsPassportEntryItemEClass = createEClass(BTS_PASSPORT_ENTRY_ITEM);
		createEAttribute(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__SUBTYPE);
		createEAttribute(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__SUB_VALUE);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__EXTERNAL_REFERENCES);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__TIMESPAN);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__DESCRIPTION);
		createEReference(btsPassportEntryItemEClass, BTS_PASSPORT_ENTRY_ITEM__TRANSLATION);

		btsAbstractTextEClass = createEClass(BTS_ABSTRACT_TEXT);
		createEReference(btsAbstractTextEClass, BTS_ABSTRACT_TEXT__PARAGRAPHS);

		btsAbstractParagraphEClass = createEClass(BTS_ABSTRACT_PARAGRAPH);
		createEReference(btsAbstractParagraphEClass, BTS_ABSTRACT_PARAGRAPH__WITNESSES);
		createEAttribute(btsAbstractParagraphEClass, BTS_ABSTRACT_PARAGRAPH__SORT_KEY);
		createEAttribute(btsAbstractParagraphEClass, BTS_ABSTRACT_PARAGRAPH__TYPE);
		createEAttribute(btsAbstractParagraphEClass, BTS_ABSTRACT_PARAGRAPH__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BtsmodelPackage theBtsmodelPackage = (BtsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(BtsmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		btsCorpusObjectEClass.getESuperTypes().add(theBtsmodelPackage.getBTSObject());
		btstcObjectEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsTextEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsLemmaEntryEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsAnnotationEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsPassportEntryGroupEClass.getESuperTypes().add(this.getBTSPassportEntry());
		btsTextCorpusEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsImageEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsThsEntryEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsPassportEntryEClass.getESuperTypes().add(theBtsmodelPackage.getBTSIdentifiableItem());
		btsWordEClass.getESuperTypes().add(this.getBTSAmbivalenceItem());
		btsWordEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsTextItemsEClass.getESuperTypes().add(theBtsmodelPackage.getAdministrativDataObject());
		btsTextItemsEClass.getESuperTypes().add(theBtsmodelPackage.getBTSNamedTypedObject());
		btsGraphicEClass.getESuperTypes().add(theBtsmodelPackage.getBTSIdentifiableItem());
		btsSenctenceEClass.getESuperTypes().add(this.getBTSTextItems());
		btsMarkerEClass.getESuperTypes().add(this.getBTSAmbivalenceItem());
		btsMarkerEClass.getESuperTypes().add(this.getBTSTextSentenceItem());
		btsMarkerEClass.getESuperTypes().add(this.getBTSTextItems());
		btsMarkerEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsSentenceItemEClass.getESuperTypes().add(theBtsmodelPackage.getBTSNamedTypedObject());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSTextSentenceItem());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSTextItems());
		btsAmbivalenceEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsLemmaCaseEClass.getESuperTypes().add(theBtsmodelPackage.getBTSNamedTypedObject());
		btsTextSentenceItemEClass.getESuperTypes().add(this.getBTSSentenceItem());
		btsTextSentenceItemEClass.getESuperTypes().add(this.getBTSTextItems());
		btsAmbivalenceItemEClass.getESuperTypes().add(theBtsmodelPackage.getBTSIdentifiableItem());
		btsPassportEntryItemEClass.getESuperTypes().add(this.getBTSPassportEntry());
		btsAbstractTextEClass.getESuperTypes().add(this.getBTSCorpusObject());
		btsAbstractParagraphEClass.getESuperTypes().add(theBtsmodelPackage.getBTSIdentifiableItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(btsCorpusObjectEClass, BTSCorpusObject.class, "BTSCorpusObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSCorpusObject_Passport(), this.getBTSPassport(), null, "passport", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusObject_CorpusPrefix(), ecorePackage.getEString(), "corpusPrefix", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusObject_WorkPhase(), ecorePackage.getEString(), "workPhase", null, 0, 1, BTSCorpusObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btstcObjectEClass, BTSTCObject.class, "BTSTCObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsTextEClass, BTSText.class, "BTSText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSText_TextContent(), this.getBTSTextContent(), null, "textContent", null, 0, 1, BTSText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsLemmaEntryEClass, BTSLemmaEntry.class, "BTSLemmaEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSLemmaEntry_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, BTSLemmaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSLemmaEntry_Words(), this.getBTSWord(), null, "words", null, 0, -1, BTSLemmaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSLemmaEntry_Translations(), theBtsmodelPackage.getBTSTranslations(), null, "translations", null, 0, 1, BTSLemmaEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEClass, BTSPassport.class, "BTSPassport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSPassport_Date(), theBtsmodelPackage.getBTSTimespan(), null, "date", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Children(), this.getBTSPassportEntry(), null, "children", null, 0, -1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassport_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassport_Descriptions(), theBtsmodelPackage.getBTSTranslations(), null, "descriptions", null, 0, -1, BTSPassport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBTSPassport__GetPassportEntryByPath__String(), this.getBTSPassportEntry(), "getPassportEntryByPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBTSPassport__GetPassportEntryStringValueByPath__String(), ecorePackage.getEString(), "getPassportEntryStringValueByPath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsAnnotationEClass, BTSAnnotation.class, "BTSAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsPassportEntryGroupEClass, BTSPassportEntryGroup.class, "BTSPassportEntryGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSPassportEntryGroup_Items(), this.getBTSPassportEntryItem(), null, "items", null, 0, -1, BTSPassportEntryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextCorpusEClass, BTSTextCorpus.class, "BTSTextCorpus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTextCorpus_Header(), this.getBTSCorpusHeader(), null, "header", null, 0, 1, BTSTextCorpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSTextCorpus_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, BTSTextCorpus.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsImageEClass, BTSImage.class, "BTSImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSImage_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, BTSImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBTSImage__GetAttachement(), ecorePackage.getEObject(), "getAttachement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(btsCorpusHeaderEClass, BTSCorpusHeader.class, "BTSCorpusHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSCorpusHeader_AuthorName(), ecorePackage.getEString(), "authorName", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusHeader_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSCorpusHeader_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, BTSCorpusHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsThsEntryEClass, BTSThsEntry.class, "BTSThsEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsTextContentEClass, BTSTextContent.class, "BTSTextContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSTextContent_TextItems(), this.getBTSTextItems(), null, "textItems", null, 0, -1, BTSTextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsPassportEntryEClass, BTSPassportEntry.class, "BTSPassportEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEntry_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntry_Children(), this.getBTSPassportEntry(), null, "children", null, 0, -1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntry_Label(), theBtsmodelPackage.getBTSTranslations(), null, "label", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntry_Key(), ecorePackage.getEInt(), "key", null, 0, 1, BTSPassportEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsWordEClass, BTSWord.class, "BTSWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSWord_Translation(), theBtsmodelPackage.getBTSTranslations(), null, "translation", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_WType(), ecorePackage.getEString(), "wType", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_LType(), ecorePackage.getEString(), "lType", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_LKey(), ecorePackage.getEString(), "lKey", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_FlexCode(), ecorePackage.getEString(), "flexCode", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_WChar(), ecorePackage.getEString(), "wChar", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSWord_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSWord_Graphics(), this.getBTSGraphic(), null, "graphics", null, 0, -1, BTSWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextItemsEClass, BTSTextItems.class, "BTSTextItems", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsGraphicEClass, BTSGraphic.class, "BTSGraphic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSGraphic_InnerSentenceOrder(), ecorePackage.getEInt(), "innerSentenceOrder", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Code(), ecorePackage.getEString(), "code", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSGraphic_Ignored(), ecorePackage.getEBoolean(), "ignored", null, 0, 1, BTSGraphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsSenctenceEClass, BTSSenctence.class, "BTSSenctence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSSenctence_SentenceItems(), this.getBTSSentenceItem(), null, "sentenceItems", null, 0, -1, BTSSenctence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSSenctence_Translation(), theBtsmodelPackage.getBTSTranslations(), null, "translation", null, 0, 1, BTSSenctence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsMarkerEClass, BTSMarker.class, "BTSMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSMarker_Value(), ecorePackage.getEString(), "value", null, 0, 1, BTSMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsSentenceItemEClass, BTSSentenceItem.class, "BTSSentenceItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsAmbivalenceEClass, BTSAmbivalence.class, "BTSAmbivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAmbivalence_Cases(), this.getBTSLemmaCase(), null, "cases", null, 0, -1, BTSAmbivalence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsLemmaCaseEClass, BTSLemmaCase.class, "BTSLemmaCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSLemmaCase_Scenario(), this.getBTSAmbivalenceItem(), null, "scenario", null, 0, -1, BTSLemmaCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsTextSentenceItemEClass, BTSTextSentenceItem.class, "BTSTextSentenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsAmbivalenceItemEClass, BTSAmbivalenceItem.class, "BTSAmbivalenceItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btsPassportEntryItemEClass, BTSPassportEntryItem.class, "BTSPassportEntryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBTSPassportEntryItem_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSPassportEntryItem_SubValue(), ecorePackage.getEString(), "subValue", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_ExternalReferences(), theBtsmodelPackage.getBTSExternalReference(), null, "externalReferences", null, 0, -1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_Timespan(), theBtsmodelPackage.getBTSTimespan(), null, "timespan", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_Description(), theBtsmodelPackage.getBTSTranslations(), null, "description", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBTSPassportEntryItem_Translation(), theBtsmodelPackage.getBTSTranslations(), null, "translation", null, 0, 1, BTSPassportEntryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAbstractTextEClass, BTSAbstractText.class, "BTSAbstractText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAbstractText_Paragraphs(), this.getBTSAbstractParagraph(), null, "paragraphs", null, 0, -1, BTSAbstractText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(btsAbstractParagraphEClass, BTSAbstractParagraph.class, "BTSAbstractParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTSAbstractParagraph_Witnesses(), theBtsmodelPackage.getBTSRelation(), null, "witnesses", null, 0, -1, BTSAbstractParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSAbstractParagraph_SortKey(), ecorePackage.getEInt(), "sortKey", null, 0, 1, BTSAbstractParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSAbstractParagraph_Type(), ecorePackage.getEString(), "type", null, 0, 1, BTSAbstractParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBTSAbstractParagraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTSAbstractParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BtsCorpusModelPackageImpl
