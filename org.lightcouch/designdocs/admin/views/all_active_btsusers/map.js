function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSUser' && doc.state == 'active'){
		emit(null, doc);
	}
}