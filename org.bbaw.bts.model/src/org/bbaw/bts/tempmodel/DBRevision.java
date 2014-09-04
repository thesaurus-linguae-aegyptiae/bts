package org.bbaw.bts.tempmodel;

public class DBRevision {

	
	public static final int LOCAL = 0;
	public static final int REMOTE = 1;
	public static final int NOT_AVAILABLE = 2;
	private int location;
	private String revision;
	
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}

}
