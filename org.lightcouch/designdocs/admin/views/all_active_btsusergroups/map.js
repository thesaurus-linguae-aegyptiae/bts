function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSUserGroup' && doc.state == 'active'){
		emit(doc._id, doc);
	}
}