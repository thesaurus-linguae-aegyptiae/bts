package org.bbaw.bts.ui.egy.textSign.test;

import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Test {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);

		shell.setSize(300, 300);
		shell.setLayout(new FillLayout());
		// Text helloWorldTest = new Text(shell, SWT.NONE);
		// helloWorldTest.setText("Hello World SWT");
		// helloWorldTest.pack();

		Composite edComposite = new Composite(shell, SWT.NONE);
		edComposite.setLayout(new FillLayout());

		BTSText text = makeMockup();

		SignTextComposite editor = new SignTextComposite(
edComposite);
		editor.setInput(text, null, null);

		edComposite.layout();
		// edComposite.pack();
		shell.layout();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

	private static BTSText makeMockup() {
		BTSText text = BtsCorpusModelFactory.eINSTANCE.createBTSText();
		text.setTextContent(BtsCorpusModelFactory.eINSTANCE.createBTSTextContent());

		BTSSenctence s = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
		for (int i = 0; i < 5; i++) {
			BTSWord w = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
			w.setWChar("abc");
			w.setLKey("LKey" + i);
			s.getSentenceItems().add(w);
			BTSMarker m = BtsCorpusModelFactory.eINSTANCE.createBTSMarker();
			m.setType("mno");
			m.setName("hlkllj");
			s.getSentenceItems().add(m);
		}
		text.getTextContent().getTextItems().add(s);
		return text;
	}

}
