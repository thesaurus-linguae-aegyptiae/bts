function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSProject' && doc.state == 'terminated'){
		emit(null, doc);
	}
}