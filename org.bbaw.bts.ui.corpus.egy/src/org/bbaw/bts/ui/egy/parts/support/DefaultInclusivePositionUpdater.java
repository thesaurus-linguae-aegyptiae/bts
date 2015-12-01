/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.ui.egy.parts.support;

import org.bbaw.bts.ui.egy.parts.EgyTextEditorPart;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.link.InclusivePositionUpdater;

/**
 * Updates only {@link Position}s of the specified category that
 * {@link DefaultPositionUpdater} fails to give an accurate length,
 * i.e. those at the end of which a {@link DocumentEvent} appended
 * new trailing characters.
 * 
 * @author hoeper
 *
 */
public class DefaultInclusivePositionUpdater extends InclusivePositionUpdater {

	public DefaultInclusivePositionUpdater(String category) {
		super(category);
	}
	
	@Override
	public void update(DocumentEvent event) {

		int eventOffset= event.getOffset();
		int eventOldLength= event.getLength();
		int eventNewLength= event.getText() == null ? 0 : event.getText().length();
		int deltaLength= eventNewLength - eventOldLength;

		if (eventNewLength > 0)
			try {
				Position[] positions= event.getDocument().getPositions(getCategory());
	
				for (int i= 0; i != positions.length; i++) {
	
					Position position= positions[i];
	
					if (position.isDeleted()) {
						System.out.println("position has been deleted: "+position);
						continue;
					}
	
					int offset= position.getOffset();
					int length= position.getLength();
					int end= offset + length;
	
					if (offset == eventOffset + eventNewLength) { // + eventOldLength
						// position begins immediately after textchange - adjust length, shift offset
						int newOffset = eventOffset;
						position.setOffset(newOffset);
						position.setLength(end-newOffset);
						System.out.println("update position ["+offset+"-"+(end)+"] -> ["+newOffset+"-"+end+"]");
					} else if (offset > eventOffset + eventOldLength) {
						// position comes way
						// after change - leave alone
					} else if (end < eventOffset) {
						// position comes way before change -
						// leave alone
					} else if (offset <= eventOffset && end > eventOffset + eventOldLength) {
						// event completely internal to the position - leave alone
					} else if (offset < eventOffset) {
						// event extends over end of position - adjust length
						int newEnd= eventOffset + eventNewLength;
						System.out.println("update position ["+offset+"-"+(offset+length)+"] -> ["+offset+"-"+newEnd+"]");
						position.setLength(newEnd - offset);
					} else if (end > eventOffset + eventOldLength) {
						// event extends from before position into it - leave alone
					} else {
						// event consumes the position - leave alone
					}
				}
			} catch (BadPositionCategoryException e) {
				// ignore and return
			}
	}
	
}
