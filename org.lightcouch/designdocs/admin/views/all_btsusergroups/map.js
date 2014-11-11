function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSUserGroup'){
		emit(doc._id, doc);
	}
}