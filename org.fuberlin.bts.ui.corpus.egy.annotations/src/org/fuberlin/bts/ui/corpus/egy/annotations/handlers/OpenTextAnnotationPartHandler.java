/**
 * This file is part of Thesaurus Linguae Aegyptiae, TLA.
 * 
 * The software TLA serves as a web interface for presenting and working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software TLA was developed at Free University Berlin, www.fu-berlin.de together with 
 * the Berlin-Brandenburg Academy of Sciences and Humanities, 
 * Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2016  Free University of Berlin and Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software TLA was developed by @author: Christoph Plutte.
 * 
 * TLA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * TLA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with TLA.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.fuberlin.bts.ui.corpus.egy.annotations.handlers;



import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.fuberlin.bts.ui.corpus.egy.annotations.internal.Activator;
import org.fuberlin.bts.ui.corpus.egy.annotations.parts.TextAnnotationsPart;
/**
 * @author plutte
 *
 */
public class OpenTextAnnotationPartHandler {
	

		@Execute
		public void execute(EPartService partService) {
			MPart part = partService.findPart(TextAnnotationsPart.PART_ID);
			if (part == null)
			{
				part = partService.createPart(TextAnnotationsPart.PART_ID);
			}
			partService.activate(part);
		}
			
		@CanExecute
		public boolean canExecute()
		{
			System.out.println("llllaalalala");
			return true;
		}
}
