/*
* generated by Xtext
*/
package org.bbaw.bts.corpus.text.egy;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EgyDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.bbaw.bts.corpus.text.egy.ui.internal.EgyDslActivator.getInstance().getInjector("org.bbaw.bts.corpus.text.egy.EgyDsl");
	}
	
}