package org.bbaw.bts.corpus.text.egy.ui.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;

public class BTSLocationInFileProvider extends DefaultLocationInFileProvider
		implements ILocationInFileProvider {

	@Override
	public ITextRegion getSignificantTextRegion(EObject obj) {
		System.out.println(obj);

		return super.getSignificantTextRegion(obj);
	}

	@Override
	public ITextRegion getSignificantTextRegion(EObject owner,
			EStructuralFeature feature, int indexInList) {
		System.out.println(owner);
		return super.getSignificantTextRegion(owner, feature, indexInList);
	}

	@Override
	public ITextRegion getFullTextRegion(EObject obj) {
		System.out.println(obj);
		return super.getFullTextRegion(obj);
	}

	@Override
	public ITextRegion getFullTextRegion(EObject owner,
			EStructuralFeature feature, int indexInList) {
		System.out.println(owner);
		return super.getFullTextRegion(owner, feature, indexInList);
	}

}
