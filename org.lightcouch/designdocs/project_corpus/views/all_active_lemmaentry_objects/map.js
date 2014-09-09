function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSLemmaEntry' && doc.state == 'active'){
		emit(null, doc);
	}
}