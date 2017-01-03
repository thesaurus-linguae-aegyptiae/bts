 
package bts.transform.ui.handlers;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.inject.Named;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import bts.transform.ui.chars.FileEntityReplacer;
import bts.transform.ui.corpus.CorpusImporter;
import bts.transform.ui.lemma.LemmaImporter;
import bts.transform.ui.users.ThsImporter;
import bts.transform.ui.users.UsersImporter;

public class TransformHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, IEclipseContext context) {
		System.out.println("transform");
		String fileName;
		
	
		try {
			context.modify(BTSCoreConstants.LISTEN_TO_BACKEND_UPDATES, "false");
		} catch (Exception e) {
		}
//		
//		FileDialog fd = new FileDialog(shell);
//		fileName = fd.open();
		
		// users
//		UsersImporter ui = new UsersImporter();
//		ui.importUsers(fileName);
//		
		// ths
//		ThsImporter ths = new ThsImporter();
//		ths.importUsers(fileName);
		
		// lemma
//		LemmaImporter lemma = new LemmaImporter();
//		lemma.importLemmata(fileName);
		
		//corpus
//		CorpusImporter ci = new CorpusImporter();
//		System.out.println(fileName);
//		old ci.importFromInternalList(); 
		
		//new
//		ci.importCorpus(fileName, null);
		
		corpusDirImporter(shell);
		
//		context.modify(BTSCoreConstants.LISTEN_TO_BACKEND_UPDATES, "true");

	}

	private void corpusDirImporter(Shell shell) {
		
		DirectoryDialog fd = new DirectoryDialog(shell);
//		
		String dirName = fd.open();
//		// TODO Auto-generated method stub
		File dir = new File(dirName);
//		FileEntityReplacer text = new FileEntityReplacer();
//
		FilenameFilter ff = new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String name) {
				return (name.endsWith(".corpusdtdneu"));
			}
		};
		CorpusImporter ci = new CorpusImporter();

		if (dir.isDirectory())
		{
			for (String fname : dir.list(ff))
			{
				ci.importCorpus(dir.getAbsolutePath() + "/" + fname, null);
			}
		}
	}
		
}