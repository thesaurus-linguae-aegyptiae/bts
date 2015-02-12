function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSText' && doc.state == 'active'){
		emit(doc._id, doc);
	}
}