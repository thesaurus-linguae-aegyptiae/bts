function(doc){
	if (doc.state == 'active'  && doc.eClass != 'http://btsmodel/1.0#//BTSIDReservationObject'){
		emit(doc._id, doc);
	}
}