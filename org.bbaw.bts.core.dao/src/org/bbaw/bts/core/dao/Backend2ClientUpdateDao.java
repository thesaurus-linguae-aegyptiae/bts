package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;

public interface Backend2ClientUpdateDao
{

	void addUpdateListener(Backend2ClientUpdateListener listener);

	void runAndListenToUpdates(CorpusObjectDao corpusObjectDao, String dbCollection);

	void removeUpdateListener(Backend2ClientUpdateListener listener);

	void stopListening();

	List<String> fingQueryIds(Object object, String id, String dbCollection);
}
