function(doc){
	if (doc._id){
		emit(doc._id, doc._id.match(/\D*(\d*)/)[1]);
	}
}