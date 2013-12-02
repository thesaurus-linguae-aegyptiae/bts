function (newDoc, oldDoc, userCtx, secObj) {
	// if new doc allow
	if (!oldDoc) { 
		return;
	} else {
		// testen, ob benutzer admin ist
		if (userCtx.roles.indexOf('_admin') !== -1 || userCtx.roles.indexOf('admin') !== -1) {
			return;
		} else if (secObj && secObj.admins && secObj.admins.roles) {
			// testen ob benutzer mitglied einer gruppe mit admin rechten ist
			for (var i = 0, l = secObj.admins.roles.length; i < l; i++) {
				// testen, ob benutzer mitglied einer gruppe ist, die in den writers eingetragen ist
				if (userCtx.roles.indexOf(secObj.admins.roles[i]) !== -1) {
					return;
				}
			}
		} else {
			// testen, ob benutzer ein editor ist oder mitglied einer gruppe mit editor rechten ist
			if (userCtx.roles.indexOf('editors') !== -1) {
				return;
			}
			if (secObj && secObj.editors && secObj.editors.roles) {
			
				for (var i = 0, l = secObj.editors.roles.length; i < l; i++) {
					// testen, ob benutzer mitglied einer gruppe ist, die in den writers eingetragen ist
					if (userCtx.roles.indexOf(secObj.editors[i]) !== -1) {
						return;
					}
				}
			}
			// testen, ob benutzer in den writers des objects eingetraten ist
			for (var i = 0, l = oldDoc.writers.length; i < l; i++) {
				if (oldDoc.writers[i] == userCtx.name) {
					return;
					
				}
				// testen, ob benutzer mitglied einer gruppe ist, die in den writers eingetragen ist
				if (userCtx.roles.indexOf(oldDoc.writers[i]) !== -1) {
					return;
				}
			}
		}
		throw({
			forbidden : secObj.admins.names[0] + secObj.editors.names[0] + 'name: ' + userCtx.name + userCtx.roles[0] + ' ' + userCtx.roles[1] + ' Only admins may edit the database. Hallo Welt22. writers: ' + oldDoc.writers[0]
		});
	}
	
	throw({forbidden : secObj.admins.names[0] + ' hallo ' + secObj.editors.names[0] + ' name: ' + userCtx.name + userCtx.roles[0] + ' ' + userCtx.roles[1] + ' Only admins may edit the database. Hallo Welt22. writers: ' + oldDoc.writers[0]
	});
}
