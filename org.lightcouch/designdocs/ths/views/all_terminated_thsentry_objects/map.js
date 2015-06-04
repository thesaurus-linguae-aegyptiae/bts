function(doc){
	if (doc.state == 'terminated'  && doc.eClass != 'http://btsmodel/1.0#//BTSIDReservationObject'){
		emit(doc._id, doc);
	}
}