package org.bbaw.bts.ui.egy.parts.support;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

/**
 * An example of using a SourceViewer with Annotation support outside of the
 * TextEditor class. This annotations can be configured in the preferences if
 * the markerAnnotationSpecification is setup in the plugin.xml.
 * 
 * To execute this, run as an Eclipse Application and then open a file using
 * Open with.. -> Other, and select Sample Editor. You will see the text that
 * comes in this example and the highlight.
 */
public class WrappedSourceViewer
{
	public static final String ANNO_TYPE = "com.mycompany.element";
	public static final String ANNO_KEY_HIGHLIGHT = "annotateElemHighlight";
	public static final String ANNO_KEY_OVERVIEW = "annotateElemOverviewRuler";
	public static final String ANNO_KEY_VERTICAL = "annotateElemVertialRuler";
	public static final String ANNO_KEY_TEXT = "annotateElemText";
	public static final String ANNO_KEY_COLOR = "annotateElemColor";

	protected SourceViewer _sourceViewer;
	protected SourceViewerDecorationSupport _sds;
	protected IDocument _document;
	protected AnnotationModel _annotationModel;

	protected String _docString = "this\nis\na\ntest\ndocument";

	public WrappedSourceViewer(Composite parent)
	{
		createPartControl(parent);
	}

	public void createPartControl(Composite parent)
	{
		int VERTICAL_RULER_WIDTH = 12;

		int styles = SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION;
		ISharedTextColors sharedColors = EditorsPlugin.getDefault().getSharedTextColors();
		IOverviewRuler overviewRuler = new OverviewRuler(null, VERTICAL_RULER_WIDTH, sharedColors);
		CompositeRuler ruler = new CompositeRuler(VERTICAL_RULER_WIDTH);

		_document = new Document();
		_document.set(_docString);

		_annotationModel = new AnnotationModel();
		_annotationModel.connect(_document);

		_sourceViewer = new SourceViewer(parent, ruler, overviewRuler, true, styles);
		_sourceViewer.configure(new SourceViewerConfiguration());

		_sds = new SourceViewerDecorationSupport(_sourceViewer, overviewRuler, null, sharedColors);

		AnnotationPreference ap = new AnnotationPreference();
		ap.setColorPreferenceKey(ANNO_KEY_COLOR);
		ap.setHighlightPreferenceKey(ANNO_KEY_HIGHLIGHT);
		ap.setVerticalRulerPreferenceKey(ANNO_KEY_VERTICAL);
		ap.setOverviewRulerPreferenceKey(ANNO_KEY_OVERVIEW);
		ap.setTextPreferenceKey(ANNO_KEY_TEXT);
		ap.setAnnotationType(ANNO_TYPE);
		_sds.setAnnotationPreference(ap);

		//		_sds.install(EditorsPlugin.getDefault().getPreferenceStore());

		_sourceViewer.setDocument(_document, _annotationModel);

		_sourceViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		ruler.addDecorator(0, new LineNumberRulerColumn());

		Annotation annotation = new Annotation(false);
		annotation.setType(ANNO_TYPE);
		Position position = new Position(0, 4);
		_annotationModel.addAnnotation(annotation, position);
		parent.layout();
	}

	public void dispose()
	{
		// The _sourceViewer goes away automatically when the editor goes
		// away because it's hooked to the controls
		_sds.dispose();
	}

	//
	// This stuff below is just needed to make the EditorPart happy
	// 

	public void doSave(IProgressMonitor monitor)
	{
	}

	public void doSaveAs()
	{
	}

	public boolean isDirty()
	{
		return false;
	}

	public boolean isSaveAsAllowed()
	{
		return false;
	}

	public void setFocus()
	{

	}

}
