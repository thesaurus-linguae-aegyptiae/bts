function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSUser'){
		emit(doc._id, doc);
	}
}