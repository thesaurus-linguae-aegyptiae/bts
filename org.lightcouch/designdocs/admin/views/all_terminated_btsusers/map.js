function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSUser' && doc.state == 'terminated'){
		emit(doc._id, doc);
	}
}