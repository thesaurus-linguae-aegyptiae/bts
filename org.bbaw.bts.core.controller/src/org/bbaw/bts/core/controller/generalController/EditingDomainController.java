package org.bbaw.bts.core.controller.generalController;

import java.util.List;

import org.eclipse.emf.edit.domain.EditingDomain;

public interface EditingDomainController {

	EditingDomain getEditingDomain(Object object);

	List<Object> getLastSelectedObjects();
}
