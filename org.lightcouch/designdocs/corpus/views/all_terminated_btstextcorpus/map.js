function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSTextCorpus' && doc.state == 'terminated'){
		emit(null, doc);
	}
}