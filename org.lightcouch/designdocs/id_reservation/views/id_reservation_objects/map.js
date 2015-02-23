function(doc){
	if (doc.eClass == 'http://btsmodel/1.0#//BTSIDReservationObject'){
		emit(doc.btsUUID, doc);
	}
}