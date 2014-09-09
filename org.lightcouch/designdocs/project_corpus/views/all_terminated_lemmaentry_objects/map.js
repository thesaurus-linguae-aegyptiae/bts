function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSLemmaEntry'  && doc.state == 'terminated'){
		emit(null, doc);
	}
}