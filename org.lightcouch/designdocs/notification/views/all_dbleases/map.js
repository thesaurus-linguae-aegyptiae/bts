function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//DBLease'){
		emit(doc._id, doc);
	}
}