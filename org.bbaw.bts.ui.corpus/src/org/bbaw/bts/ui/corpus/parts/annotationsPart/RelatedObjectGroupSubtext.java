package org.bbaw.bts.ui.corpus.parts.annotationsPart;

import java.awt.image.BufferedImage;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class RelatedObjectGroupSubtext extends RelatedObjectGroup {

	@Inject
	private BTSTextEditorController textController;
	private Document document;
	private Text transcriptionText;
	private Control canvas;
	@Inject
	public RelatedObjectGroupSubtext(Composite parent, BTSObject object) {
		super(parent, object);
	}

	@Override
	protected void addButtons(Composite composite) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void fillContentComposite(Composite composite) {


		if (!getObject().getRevisions().isEmpty())
		{
			BTSRevision rev = getObject().getRevision(0);
			setGroupTitle(userController.getUserDisplayName(rev
					.getUserId()));
		}
		transcriptionText = new Text(composite, SWT.WRAP | SWT.READ_ONLY | SWT.MULTI);
		transcriptionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true, 1, 1));
		BTSObject o = getObject();
		if (o instanceof BTSText)
		{
			Document doc = new Document();
			this.document = doc;

			AnnotationModel model = new AnnotationModel();

			textController.transformToDocument(((BTSText) getObject()).getTextContent(), doc, model, null, null, null, null);
			transcriptionText.setText(doc.get());
		}
		String mdc = textController.transformTextToJSeshMdCString((BTSText) getObject());
		if (mdc != null)
		{
			BufferedImage bim = null;
			try {
				System.out.println(mdc);
				bim = textController.getImageData(mdc, 100, 100 );
			} catch (Exception e) {
				logger.error(e);
			}
			if (bim != null)
			{
				final Image im = textController.transformToSWT(bim);
				canvas = new Canvas(composite, SWT.NONE);
				canvas.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
						true, true, 1, 1));
				// Create a paint handler for the canvas    
				canvas.addPaintListener(new PaintListener() {
				  public void paintControl(PaintEvent e) {
				    e.gc.drawImage(im, 0, 0);        
				  }
				});
			}
		}
		composite.pack();
		setGroupTitle("Glosse");
		setExpandBarIcon(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_SUBTEXT));
		setExpandBarBackground(BTSUIConstants.COLOR_WIHTE);
	}

	@Override
	public void setBackground(Color color) {
		super.setBackground(color);
		if (canvas != null && !canvas.isDisposed())
		{
			canvas.setBackground(color);
		}
		if (transcriptionText != null && !transcriptionText.isDisposed())
		{
			transcriptionText.setBackground(color);
		}
	}
}
