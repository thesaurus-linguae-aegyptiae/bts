function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSTextCorpus'){
		emit(null, doc);
	}
}