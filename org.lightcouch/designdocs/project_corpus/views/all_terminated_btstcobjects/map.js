function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSTCObject' && doc.state == 'terminated'){
		emit(null, doc);
	}
}