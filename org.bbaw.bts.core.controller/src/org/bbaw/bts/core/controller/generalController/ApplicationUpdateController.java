package org.bbaw.bts.core.controller.generalController;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

public interface ApplicationUpdateController {

	public enum EUpdateStatusType {
		CHECK_RUNNING(true, false),
		CHECK_FAILED(false, false),
		NO_UPDATE(true, false),
		UPDATE_AVAILABLE(true, false),
		UPDATE_DECLINED(true, false),
		UPDATE_RUNNING(true, false),
		UPDATE_FAILED(false, false),
		UPDATE_SUCCESS(true, true);
		
		public final int ordinal;
		
		private final boolean ok; 
		private final boolean restart;
		
		EUpdateStatusType(boolean ok, boolean restartRequired) {
			this.ordinal = super.ordinal();
			this.ok = ok;
			this.restart = restartRequired;
		}
		
		public boolean isOk() {
			return ok;
		}
		
		public boolean restartRequired() {
			return restart;
		}
	}
	
	
	public final long TIME_UNTIL_RECHECK = 60*1000*5;
	
	public boolean isUpdateAvailable();
	
	public EUpdateStatusType getStatus();
	
	public IStatus scheduleUpdate();
	
	public void scheduleCheck();
	
}
