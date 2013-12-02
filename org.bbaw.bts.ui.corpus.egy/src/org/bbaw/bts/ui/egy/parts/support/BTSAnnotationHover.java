package org.bbaw.bts.ui.egy.parts.support;

import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;

public class BTSAnnotationHover implements IAnnotationHover
{

	public BTSAnnotationHover(ISourceViewer sourceViewer)
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber)
	{
		// TODO Auto-generated method stub
		return "Hallo Christoph";
	}

}
