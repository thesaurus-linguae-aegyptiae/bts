function(doc){
	if (doc.state == 'terminated')
	{
		emit(null, doc);
	}
}