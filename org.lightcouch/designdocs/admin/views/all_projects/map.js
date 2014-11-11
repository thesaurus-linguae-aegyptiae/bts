function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSProject'){
		emit(doc._id, doc);
	}
}