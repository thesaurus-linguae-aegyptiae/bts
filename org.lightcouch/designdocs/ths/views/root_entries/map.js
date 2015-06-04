function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSIDReservationObject')
	{
		return
	}
	if (doc.relations == null){
		emit(doc._id, doc);
	}
	else
	{
		for (var i = 0, l = doc.relations.length; i < l; i++) {
			var relation = doc.relations[i];
			if (relation.type == 'partOf') {
				return;
			}
		}
		emit(doc._id, doc);
	}
}