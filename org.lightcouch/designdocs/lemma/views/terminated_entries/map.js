function(doc){
	if (doc.state == 'terminated' && doc.eClass == 'http://btsCorpusModel/1.0#//BTSLemmaEntry')
	{
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "revisionState": doc.revisionState, "relations": doc.relations});
	}
}