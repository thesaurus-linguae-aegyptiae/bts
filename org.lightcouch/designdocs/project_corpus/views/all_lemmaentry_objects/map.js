function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSLemmaEntry'){
		emit(null, doc);
	}
}