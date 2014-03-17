package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSThsEntry;

public interface BTSThsEntryService extends
		GenericObjectService<BTSThsEntry, String> {

	List<BTSThsEntry> listRootEntries();

}
