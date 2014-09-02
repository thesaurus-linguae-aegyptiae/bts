function(doc){
	if (doc.state == 'active'){
		emit(null, doc);
	}
}