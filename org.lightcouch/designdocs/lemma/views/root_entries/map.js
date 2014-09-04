function(doc){
	if (doc.relations == null){
		emit(null, doc);
	}
	else
	{
		for (var i = 0, l = doc.relations.length; i < l; i++) {
			var relation = doc.relations[i];
			if (relation.type == 'partOf') {
				return;
			}
		}
		emit(null, doc);
	}
}