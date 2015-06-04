function(doc){
	if (true && doc.state == 'active'  && doc.eClass != 'http://btsmodel/1.0#//BTSIDReservationObject'){
		emit(doc._id, {"name": doc.name, "eClass": doc.eClass, "type": doc.type, "subtype": doc.subtype, "sortKey" : doc.sortKey, "visibility": doc.visibility, "readers": doc.readers, "updaters": doc.updaters, "revisionState": doc.revisionState});
	}
}