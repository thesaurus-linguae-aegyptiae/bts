package org.bbaw.bts.ui.egy.parts.egyTextEditor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

public class BTSTextXtextEditedResourceProvider implements
		IEditedResourceProvider {
	private static final String VIRTUAL_FILE_NAME = "file://E:/AAEW/test/runtime-EclipseXtext/tt/btstest.egydsl";

	@Override
	public XtextResource createResource() {
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(URI
					.createURI(VIRTUAL_FILE_NAME));

			return (XtextResource) resource;
		} catch (Exception e) {
			return null;
		}
	}
}
