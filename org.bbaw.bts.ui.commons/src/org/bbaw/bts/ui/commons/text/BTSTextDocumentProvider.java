package org.bbaw.bts.ui.commons.text;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.IElementStateListener;

public class BTSTextDocumentProvider implements IDocumentProvider
{

	@Override
	public void connect(Object element) throws CoreException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void disconnect(Object element)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public IDocument getDocument(Object element)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetDocument(Object element) throws CoreException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void saveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public long getModificationStamp(Object element)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getSynchronizationStamp(Object element)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isDeleted(Object element)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mustSaveDocument(Object element)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canSaveDocument(Object element)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IAnnotationModel getAnnotationModel(Object element)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aboutToChange(Object element)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void changed(Object element)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addElementStateListener(IElementStateListener listener)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void removeElementStateListener(IElementStateListener listener)
	{
		// TODO Auto-generated method stub

	}

}
