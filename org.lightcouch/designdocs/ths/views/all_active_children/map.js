function(doc){
	if (doc.state != 'active')
	{
		return
	}
	else if (doc.relations == null){
		return
	}
	else
	{
		for (var i = 0, l = doc.relations.length; i < l; i++) {
			var relation = doc.relations[i];
			if (relation.type == 'partOf') {
				emit(doc._id, {"name": doc.name, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "relations": doc.relations});
			}
		}
		return
	}
}