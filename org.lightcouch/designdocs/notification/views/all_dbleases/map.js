function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//DBLease'){
		emit(null, doc);
	}
}