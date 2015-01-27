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
package org.bbaw.bts.ui.resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.tools.services.BasicResourceProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * The Class BTSResourceProviderImpl implements BTSResourceProvider.
 *
 * @author Christoph Plutte
 */
public class BTSResourceProviderImpl extends BasicResourceProvider implements
		BTSResourceProvider {

	protected IEclipseContext eclipseContext = StaticAccessController
			.getContext();

	public Image getImage(Display display, String key) {
		URL url = FileLocator.find(context.getBundle(),
				new Path(properties.get(key)), null);

		if (url != null) {
			Image image = null;
			Map<URL, Image> map = null;
			try {
				map = getImageMap();
				image = map.get(url);
				if (image != null)
					return image;
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			InputStream stream = null;
			try {
				stream = url.openStream();
				image = new Image(display, stream);
				if (map != null) map.put(url, image);
				return image;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (stream != null) {
					try {
						stream.close();
					} catch (IOException e) {
					}
				}
			}
		}

		// TODO Auto-generated method stub
		return null;
	}

	private Map<URL, Image> getImageMap() {
		if (eclipseContext == null)
		{
			eclipseContext = StaticAccessController
					.getContext();
		}
		Object o = eclipseContext.get("url_image_map");
		Map<URL, Image> map;
		if (o == null || !(o instanceof Map<?, ?>)) {
			map = new HashMap<URL, Image>();
			eclipseContext.set("url_image_map", map);
		} else {
			map = (Map<URL, Image>) o;
		}
		return map;
	}
}
