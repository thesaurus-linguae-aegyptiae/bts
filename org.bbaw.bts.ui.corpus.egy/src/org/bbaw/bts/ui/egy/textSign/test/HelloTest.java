package org.bbaw.bts.ui.egy.textSign.test;

import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class HelloTest {

	private static FigureCanvas can;
	private static SignTextComposite editor;

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		Label l = new Label(shell, SWT.NONE);
		l.setText("Hallo");
		l.pack();
		final TabFolder t = new TabFolder(shell, SWT.NONE);

		{
		TabItem ti = new TabItem(t, SWT.NONE);
		Composite c = new Composite(t, SWT.NONE);
		c.setLayout(new FillLayout());
		ti.setControl(c);
		ti.setText("1");
		// LightweightSystem lwSystem = new LightweightSystem(shell);

			can = new FigureCanvas(c);
		can.setLayout(new FillLayout());

			loadContent(can);

			c.layout();
		}
		{
		TabItem ti2 = new TabItem(t, SWT.NONE);
		Composite c2 = new Composite(t, SWT.NONE);
		c2.setLayout(new FillLayout());
		ti2.setControl(c2);
		ti2.setText("2");
		// LightweightSystem lwSystem = new LightweightSystem(shell);

			FigureCanvas can2 = new FigureCanvas(c2);
		can2.setLayout(new FillLayout());

		IFigure contents2 = new Figure();
		LineBorder border2 = new LineBorder();
		border2.setWidth(5);
			contents2.setBorder(border2);

		ToolbarLayout layout2 = new ToolbarLayout(false);
		layout2.setSpacing(10);
		contents2.setLayoutManager(layout2);

		org.eclipse.draw2d.Label label2 = new org.eclipse.draw2d.Label(
				"Hello world!!! 222");
		contents2.add(label2);

			can2.setContents(contents2);
		c2.layout();

		}
		{
			TabItem ti3 = new TabItem(t, SWT.NONE);
			Composite c3 = new Composite(t, SWT.NONE);
			c3.setLayout(new FillLayout());
			ti3.setControl(c3);
			ti3.setText("3");
			Composite edComposite = new Composite(c3, SWT.NONE);
			edComposite.setLayout(new FillLayout());

			BTSText text = makeMockup();

			editor = new SignTextComposite(edComposite);
			editor.setInput(text);

			edComposite.layout();
			c3.layout();

		}

		t.addSelectionListener(new SelectionListener() {


			@Override
			public void widgetSelected(SelectionEvent e) {
				if (t.getSelectionIndex() == 0) {
					loadContent(can);
				} else if (t.getSelectionIndex() == 2) {
					editor.setInput(makeMockup());
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		shell.open();
		shell.layout();
		// lwSystem.setControl(can);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

		display.dispose();
	}

	private static void loadContent(FigureCanvas can) {
		IFigure contents = new Figure();
		LineBorder border = new LineBorder();
		border.setWidth(5);
		contents.setBorder(border);

		ToolbarLayout layout = new ToolbarLayout(false);
		layout.setSpacing(10);
		contents.setLayoutManager(layout);

		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label(
				"Hello world!!!");
		contents.add(label);
		label.addFigureListener(new FigureListener() {

			@Override
			public void figureMoved(IFigure source) {
				System.out.println("Figure listener " + source);

			}
		});
		can.setContents(contents);

	}

	private static BTSText makeMockup() {
		BTSText text = BtsmodelFactory.eINSTANCE.createBTSText();
		text.setTextContent(BtsmodelFactory.eINSTANCE.createBTSTextContent());

		BTSSenctence s = BtsmodelFactory.eINSTANCE.createBTSSenctence();
		for (int i = 0; i < 5; i++) {
			BTSWord w = BtsmodelFactory.eINSTANCE.createBTSWord();
			w.setWChar("abc");
			w.setLKey("LKey" + i);
			s.getSentenceItems().add(w);
			BTSMarker m = BtsmodelFactory.eINSTANCE.createBTSMarker();
			m.setType("mno");
			m.setName("hlkllj");
			s.getSentenceItems().add(m);
		}
		text.getTextContent().getTextItems().add(s);
		return text;
	}
}