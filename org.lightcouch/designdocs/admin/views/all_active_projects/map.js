function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSProject' && doc.state == 'active'){
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "revisionState": doc.revisionState});
	}
}