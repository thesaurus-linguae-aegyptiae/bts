package org.bbaw.bts.core.dao;

import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;

public interface Backend2ClientUpdateDao
{

	void addUpdateListener(Backend2ClientUpdateListener listener);

	void runAndListenToUpdates(CorpusObjectDao corpusObjectDao);

	void removeUpdateListener(Backend2ClientUpdateListener listener);

	void stopListening();
}
