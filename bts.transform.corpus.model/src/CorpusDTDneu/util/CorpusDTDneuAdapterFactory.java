/**
 */
package CorpusDTDneu.util;

import CorpusDTDneu.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CorpusDTDneu.CorpusDTDneuPackage
 * @generated
 */
public class CorpusDTDneuAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorpusDTDneuPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorpusDTDneuAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorpusDTDneuPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorpusDTDneuSwitch<Adapter> modelSwitch =
		new CorpusDTDneuSwitch<Adapter>() {
			@Override
			public Adapter caseBausteinPassageType(BausteinPassageType object) {
				return createBausteinPassageTypeAdapter();
			}
			@Override
			public Adapter caseDateThsType(DateThsType object) {
				return createDateThsTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEgyPunctuationType(EgyPunctuationType object) {
				return createEgyPunctuationTypeAdapter();
			}
			@Override
			public Adapter caseEgySentType(EgySentType object) {
				return createEgySentTypeAdapter();
			}
			@Override
			public Adapter caseEgySubTxtType(EgySubTxtType object) {
				return createEgySubTxtTypeAdapter();
			}
			@Override
			public Adapter caseEgySzenarioType(EgySzenarioType object) {
				return createEgySzenarioTypeAdapter();
			}
			@Override
			public Adapter caseEgyTB1Type(EgyTB1Type object) {
				return createEgyTB1TypeAdapter();
			}
			@Override
			public Adapter caseEgyTB3EndType(EgyTB3EndType object) {
				return createEgyTB3EndTypeAdapter();
			}
			@Override
			public Adapter caseEgyTB3StartType(EgyTB3StartType object) {
				return createEgyTB3StartTypeAdapter();
			}
			@Override
			public Adapter caseEgyTxtCorpusType(EgyTxtCorpusType object) {
				return createEgyTxtCorpusTypeAdapter();
			}
			@Override
			public Adapter caseEgyTxtType(EgyTxtType object) {
				return createEgyTxtTypeAdapter();
			}
			@Override
			public Adapter caseEgyWordType(EgyWordType object) {
				return createEgyWordTypeAdapter();
			}
			@Override
			public Adapter caseFormattingElementType(FormattingElementType object) {
				return createFormattingElementTypeAdapter();
			}
			@Override
			public Adapter caseGlossePassageType(GlossePassageType object) {
				return createGlossePassageTypeAdapter();
			}
			@Override
			public Adapter caseGlosseType(GlosseType object) {
				return createGlosseTypeAdapter();
			}
			@Override
			public Adapter caseLanguagePassageType(LanguagePassageType object) {
				return createLanguagePassageTypeAdapter();
			}
			@Override
			public Adapter caseLeipzigPassageType(LeipzigPassageType object) {
				return createLeipzigPassageTypeAdapter();
			}
			@Override
			public Adapter caseLineCountType(LineCountType object) {
				return createLineCountTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter casePassportDataItem(PassportDataItem object) {
				return createPassportDataItemAdapter();
			}
			@Override
			public Adapter casePassportDataItemType(PassportDataItemType object) {
				return createPassportDataItemTypeAdapter();
			}
			@Override
			public Adapter casePicturesTableType(PicturesTableType object) {
				return createPicturesTableTypeAdapter();
			}
			@Override
			public Adapter casePictureType(PictureType object) {
				return createPictureTypeAdapter();
			}
			@Override
			public Adapter casePunctuationType(PunctuationType object) {
				return createPunctuationTypeAdapter();
			}
			@Override
			public Adapter caseTCArrangementType(TCArrangementType object) {
				return createTCArrangementTypeAdapter();
			}
			@Override
			public Adapter caseTCCaptionType(TCCaptionType object) {
				return createTCCaptionTypeAdapter();
			}
			@Override
			public Adapter caseTCGroupType(TCGroupType object) {
				return createTCGroupTypeAdapter();
			}
			@Override
			public Adapter caseTCHeaderType(TCHeaderType object) {
				return createTCHeaderTypeAdapter();
			}
			@Override
			public Adapter caseTCLocationType(TCLocationType object) {
				return createTCLocationTypeAdapter();
			}
			@Override
			public Adapter caseTCObjectType(TCObjectType object) {
				return createTCObjectTypeAdapter();
			}
			@Override
			public Adapter caseTCObjPartType(TCObjPartType object) {
				return createTCObjPartTypeAdapter();
			}
			@Override
			public Adapter caseTCPassportType(TCPassportType object) {
				return createTCPassportTypeAdapter();
			}
			@Override
			public Adapter caseTCPictureType(TCPictureType object) {
				return createTCPictureTypeAdapter();
			}
			@Override
			public Adapter caseTCSceneType(TCSceneType object) {
				return createTCSceneTypeAdapter();
			}
			@Override
			public Adapter caseTCSuperTextType(TCSuperTextType object) {
				return createTCSuperTextTypeAdapter();
			}
			@Override
			public Adapter caseTCTextType(TCTextType object) {
				return createTCTextTypeAdapter();
			}
			@Override
			public Adapter caseThsEntryType(ThsEntryType object) {
				return createThsEntryTypeAdapter();
			}
			@Override
			public Adapter caseWorkType(WorkType object) {
				return createWorkTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.BausteinPassageType <em>Baustein Passage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.BausteinPassageType
	 * @generated
	 */
	public Adapter createBausteinPassageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.DateThsType <em>Date Ths Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.DateThsType
	 * @generated
	 */
	public Adapter createDateThsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyPunctuationType <em>Egy Punctuation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyPunctuationType
	 * @generated
	 */
	public Adapter createEgyPunctuationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgySentType <em>Egy Sent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgySentType
	 * @generated
	 */
	public Adapter createEgySentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgySubTxtType <em>Egy Sub Txt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgySubTxtType
	 * @generated
	 */
	public Adapter createEgySubTxtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgySzenarioType <em>Egy Szenario Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgySzenarioType
	 * @generated
	 */
	public Adapter createEgySzenarioTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyTB1Type <em>Egy TB1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyTB1Type
	 * @generated
	 */
	public Adapter createEgyTB1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyTB3EndType <em>Egy TB3 End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyTB3EndType
	 * @generated
	 */
	public Adapter createEgyTB3EndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyTB3StartType <em>Egy TB3 Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyTB3StartType
	 * @generated
	 */
	public Adapter createEgyTB3StartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyTxtCorpusType <em>Egy Txt Corpus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyTxtCorpusType
	 * @generated
	 */
	public Adapter createEgyTxtCorpusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyTxtType <em>Egy Txt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyTxtType
	 * @generated
	 */
	public Adapter createEgyTxtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.EgyWordType <em>Egy Word Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.EgyWordType
	 * @generated
	 */
	public Adapter createEgyWordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.FormattingElementType <em>Formatting Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.FormattingElementType
	 * @generated
	 */
	public Adapter createFormattingElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.GlossePassageType <em>Glosse Passage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.GlossePassageType
	 * @generated
	 */
	public Adapter createGlossePassageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.GlosseType <em>Glosse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.GlosseType
	 * @generated
	 */
	public Adapter createGlosseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.LanguagePassageType <em>Language Passage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.LanguagePassageType
	 * @generated
	 */
	public Adapter createLanguagePassageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.LeipzigPassageType <em>Leipzig Passage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.LeipzigPassageType
	 * @generated
	 */
	public Adapter createLeipzigPassageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.LineCountType <em>Line Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.LineCountType
	 * @generated
	 */
	public Adapter createLineCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.PassportDataItem <em>Passport Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.PassportDataItem
	 * @generated
	 */
	public Adapter createPassportDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.PassportDataItemType <em>Passport Data Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.PassportDataItemType
	 * @generated
	 */
	public Adapter createPassportDataItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.PicturesTableType <em>Pictures Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.PicturesTableType
	 * @generated
	 */
	public Adapter createPicturesTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.PictureType <em>Picture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.PictureType
	 * @generated
	 */
	public Adapter createPictureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.PunctuationType <em>Punctuation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.PunctuationType
	 * @generated
	 */
	public Adapter createPunctuationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCArrangementType <em>TC Arrangement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCArrangementType
	 * @generated
	 */
	public Adapter createTCArrangementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCCaptionType <em>TC Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCCaptionType
	 * @generated
	 */
	public Adapter createTCCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCGroupType <em>TC Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCGroupType
	 * @generated
	 */
	public Adapter createTCGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCHeaderType <em>TC Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCHeaderType
	 * @generated
	 */
	public Adapter createTCHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCLocationType <em>TC Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCLocationType
	 * @generated
	 */
	public Adapter createTCLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCObjectType <em>TC Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCObjectType
	 * @generated
	 */
	public Adapter createTCObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCObjPartType <em>TC Obj Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCObjPartType
	 * @generated
	 */
	public Adapter createTCObjPartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCPassportType <em>TC Passport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCPassportType
	 * @generated
	 */
	public Adapter createTCPassportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCPictureType <em>TC Picture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCPictureType
	 * @generated
	 */
	public Adapter createTCPictureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCSceneType <em>TC Scene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCSceneType
	 * @generated
	 */
	public Adapter createTCSceneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCSuperTextType <em>TC Super Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCSuperTextType
	 * @generated
	 */
	public Adapter createTCSuperTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.TCTextType <em>TC Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.TCTextType
	 * @generated
	 */
	public Adapter createTCTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.ThsEntryType <em>Ths Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.ThsEntryType
	 * @generated
	 */
	public Adapter createThsEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CorpusDTDneu.WorkType <em>Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CorpusDTDneu.WorkType
	 * @generated
	 */
	public Adapter createWorkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CorpusDTDneuAdapterFactory
