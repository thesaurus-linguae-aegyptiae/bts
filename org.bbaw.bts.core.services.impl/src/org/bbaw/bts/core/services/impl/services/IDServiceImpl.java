package org.bbaw.bts.core.services.impl.services;

import java.util.Calendar;
import java.util.UUID;

import javax.inject.Inject;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.net.util.Base64;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.services.IDService;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class IDServiceImpl implements IDService
{

	private static final String PATTERN = "(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})";
	private static final String GROUPS = "$1-$2-$3-$4-$5";
	private IEclipseContext eclipseCtx;
	private static Calendar now;
	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
	private String btsUUID = prefs.get(BTSConstants.BTS_UUID, null);
	@Inject
	public IDServiceImpl(IEclipseContext eclipseCtx)
	{
		this.eclipseCtx = eclipseCtx;
		eclipseCtx.set(IDServiceImpl.class, this);
	}

	public String createId()
	{
		now = Calendar.getInstance();
		String id = new Long(now.getTimeInMillis()).toString();
		BTSUser user = (BTSUser) eclipseCtx.get("currentUser");
		if (user != null)
		{
			id += user.get_id().substring(5, 15);
		}
		if (btsUUID != null && btsUUID.length() > 10)
		{
			id += btsUUID.substring(5, 10);
		}
		while (id.length() < 32)
		{
			id += new Long(now.getTimeInMillis()).toString();
		}
		String uuid = id.substring(0, 32).replaceAll(                                            
			   PATTERN,                            
			    GROUPS);                                                      
		// creating UUID      
		UUID uid = UUID.fromString(uuid);
		id = uid.randomUUID().toString();
		id = id.replace("-", "");
		
		// encode Base32 to reduce size
		Base32 base32 = new Base32();
		byte[] array = DatatypeConverter.parseHexBinary(id);
	    id = base32.encodeToString(array);
	    id = id.replace("-", "Q");
	    id = id.replace("_", "W");
	    id = id.replace("=", "");
//		System.out.println(id);
		return id;
	}
}
