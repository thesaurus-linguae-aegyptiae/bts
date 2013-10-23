package org.bbaw.bts.core.services;

import java.util.List;

public interface BTSEvaluationService
{

	<T> List<T> filter(List<T> objects);

	boolean filter(Object object);

	void computeSelection(Object selection);

	boolean isLocked(Object object);

	// ValidationResponse validate(Object object, Object parentObject);
}
