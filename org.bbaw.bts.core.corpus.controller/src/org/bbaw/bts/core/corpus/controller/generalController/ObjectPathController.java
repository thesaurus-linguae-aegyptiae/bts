package org.bbaw.bts.core.corpus.controller.generalController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSObject;

public interface ObjectPathController {

	BTSObject[] loadFullPath(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache);

	BTSObject[] loadFullPathThs(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache);

	BTSObject[] loadFullPathLemma(BTSObject[] objects,
			Map<String, List<BTSObject>> pathCache);

}
