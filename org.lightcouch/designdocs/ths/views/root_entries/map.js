function(doc){
	if (doc.relations == null){
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "revisionState": doc.revisionState});
	}
	else
	{
		for (var i = 0, l = doc.relations.length; i < l; i++) {
			var relation = doc.relations[i];
			if (relation.type == 'partOf') {
				return;
			}
		}
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "revisionState": doc.revisionState});
	}
}