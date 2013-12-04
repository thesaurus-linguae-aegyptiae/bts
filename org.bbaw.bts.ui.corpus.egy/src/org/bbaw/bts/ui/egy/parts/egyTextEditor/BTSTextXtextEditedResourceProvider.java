package org.bbaw.bts.ui.egy.parts.egyTextEditor;

import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.corpus.text.dsl.BTSStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

public class BTSTextXtextEditedResourceProvider implements IEditedResourceProvider
{
	private BTSText text;

	public BTSTextXtextEditedResourceProvider()
	{
		BTSStandaloneSetup.doSetup();
	}

	@Override
	public XtextResource createResource()
	{
		try
		{
			if (text != null)
			{
				return (XtextResource) text.eResource();
			}
		} catch (Exception e)
		{
			return null;
		}
		return null;
	}

	public BTSText getText()
	{
		return text;
	}

	public void setText(BTSText text)
	{
		this.text = text;
	}

}
