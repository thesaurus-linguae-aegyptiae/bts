 
package org.bbaw.bts.ui.corpus.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;

public class AbstractTextEditorPart {
	private Table table;
	private Text text_paraName;
	private Text text;
	@Inject
	public AbstractTextEditorPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		
		Composite composite_left = new Composite(sashForm, SWT.NONE);
		composite_left.setLayout(new GridLayout(1, false));
		
		Label lblParagraphs = new Label(composite_left, SWT.NONE);
		lblParagraphs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblParagraphs.setText("Paragraphs");
		
		TableViewer tableViewer = new TableViewer(composite_left, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_right = new Composite(sashForm, SWT.NONE);
		composite_right.setLayout(new GridLayout(1, false));
		
		Composite composite_paragraphEditor = new Composite(composite_right, SWT.NONE);
		composite_paragraphEditor.setLayout(new GridLayout(2, false));
		composite_paragraphEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite_paragraphEditor.setBounds(0, 0, 64, 64);
		
		Label lblName = new Label(composite_paragraphEditor, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");
		
		text_paraName = new Text(composite_paragraphEditor, SWT.BORDER);
		text_paraName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblSortkey = new Label(composite_paragraphEditor, SWT.NONE);
		lblSortkey.setText("SortKey");
		
		Spinner spinner_sortKey = new Spinner(composite_paragraphEditor, SWT.BORDER);
		
		ScrolledComposite scrollComp_relEditors = new ScrolledComposite(composite_paragraphEditor, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrollComp_relEditors.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		scrollComp_relEditors.setBounds(0, 0, 85, 85);
		scrollComp_relEditors.setExpandHorizontal(true);
		scrollComp_relEditors.setExpandVertical(true);
		
		Composite composite = new Composite(scrollComp_relEditors, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Composite paraRel_Editor = new Composite(composite, SWT.NONE);
		paraRel_Editor.setLayout(new GridLayout(1, false));
		paraRel_Editor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		paraRel_Editor.setBounds(0, 0, 64, 64);
		
		Group grpTextname = new Group(paraRel_Editor, SWT.NONE);
		grpTextname.setText("[textName]");
		grpTextname.setLayout(new GridLayout(3, false));
		grpTextname.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblRel = new Label(grpTextname, SWT.NONE);
		lblRel.setBounds(0, 0, 55, 15);
		lblRel.setText("Rel");
		
		Label lblEdit = new Label(grpTextname, SWT.NONE);
		lblEdit.setBounds(0, 0, 55, 15);
		lblEdit.setText("edit");
		
		Label lblDel = new Label(grpTextname, SWT.NONE);
		lblDel.setBounds(0, 0, 55, 15);
		lblDel.setText("del");
		
		ExpandBar expandBar = new ExpandBar(grpTextname, SWT.NONE);
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		
		ExpandItem xpndtmSynopse = new ExpandItem(expandBar, SWT.NONE);
		xpndtmSynopse.setExpanded(true);
		xpndtmSynopse.setText("Synopse");
		
		Composite composite_1 = new Composite(expandBar, SWT.NONE);
		xpndtmSynopse.setControl(composite_1);
		xpndtmSynopse.setHeight(xpndtmSynopse.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		composite_1.setLayout(new GridLayout(1, false));
		
		text = new Text(composite_1, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		new Label(grpTextname, SWT.NONE);
		new Label(grpTextname, SWT.NONE);
		new Label(grpTextname, SWT.NONE);
		scrollComp_relEditors.setContent(composite);
		scrollComp_relEditors.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		
		
		
		
		
		
		
		sashForm.setWeights(new int[] {1, 1});
		
	}
	
	
	
	
	@Persist
	public void save() {
		
	}
}