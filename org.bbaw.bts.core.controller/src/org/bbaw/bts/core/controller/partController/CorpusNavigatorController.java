package org.bbaw.bts.core.controller.partController;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSTCObjectService;
import org.bbaw.bts.core.services.BTSTextCorpusService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.core.services.CorpusObjectService;
import org.bbaw.bts.core.services.IDService;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class CorpusNavigatorController
{

	@Inject
	private BTSTextCorpusService textCorpusService;

	@Inject
	private BTSTCObjectService tcObjectService;

	@Inject
	private CorpusObjectService corpusObjectService;

	@Inject
	IDService ids;

	@Inject
	private Backend2ClientUpdateService updateService;

	public List<BTSTextCorpus> getRootBTSCorpusObjects()
	{
		// BTSTextCorpus corpus = textCorpusService.list()
		List<BTSTextCorpus> list = textCorpusService.list();
		return list;
	}

	public BTSTextCorpus createNewTextCorpus()
	{
		BTSTextCorpus corpus = textCorpusService.createNew();
		return corpus;
	}

	public BTSTCObject createNewTCObject()
	{
		BTSTCObject o = tcObjectService.createNew();
		return o;
	}

	public void addChild(final BTSCorpusObject object, WritableList input, final BTSCorpusObject parent)
	{
		input.getRealm().asyncExec(new Runnable()
		{
			public void run()
			{
				System.out.println("run refresh");
				if (parent != null)
				{
					System.out.println("selection is instance of BTSTextCorpus");
					parent.getChildren().add(object);
					BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
					rel.setObjectId(object.get_id());
					rel.setType("child");
					parent.getRelations().add(rel);
					object.setParent(parent);
					tcObjectService.save((BTSTCObject) object);
					corpusObjectService.save((BTSCorpusObject) parent);
				}
			}
		});
	}

	public void save(BTSCorpusObject o)
	{
		corpusObjectService.save(o);

	}
}
