/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.quickfix;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.validation.Issue;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class ReplaceModification implements IModification {

	private final Issue issue;
	private final String replacement;

	public ReplaceModification(Issue issue, String replacement) {
		this.issue = issue;
		this.replacement = replacement;
	}
	
	public void apply(IModificationContext context) throws BadLocationException {
		context.getXtextDocument().replace(issue.getOffset(), issue.getLength(), replacement);
	}

}
