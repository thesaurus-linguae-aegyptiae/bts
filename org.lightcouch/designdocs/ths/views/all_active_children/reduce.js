function(keys, values) {
	for (var i = 0, l = doc.relations.length; i < l; i++)
	{
			var relation = doc.relations[i];
			if (relation.type == 'partOf' && relation.objectId == key) {
				return(values);
			}
		}
}