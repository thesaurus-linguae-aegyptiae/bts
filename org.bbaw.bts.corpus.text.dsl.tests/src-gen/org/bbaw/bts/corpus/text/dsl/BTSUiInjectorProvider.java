/*
* generated by Xtext
*/
package org.bbaw.bts.corpus.text.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BTSUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.bbaw.bts.corpus.text.dsl.ui.internal.BTSActivator.getInstance().getInjector("org.bbaw.bts.corpus.text.dsl.BTS");
	}
	
}