function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSUser'){
		emit(null, doc);
	}
}