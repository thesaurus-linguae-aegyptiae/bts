function(doc){
	if (true && doc.state == 'terminated'){
		emit(null, doc);
	}
}