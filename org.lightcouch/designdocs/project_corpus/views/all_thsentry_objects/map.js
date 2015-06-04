function(doc){
	if (doc.eClass == 'http://btsCorpusModel/1.0#//BTSThsEntry'){
		emit(doc._id, doc);
	}
}