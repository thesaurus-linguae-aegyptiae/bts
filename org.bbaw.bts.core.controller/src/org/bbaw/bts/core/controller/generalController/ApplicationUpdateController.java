package org.bbaw.bts.core.controller.generalController;

import org.eclipse.core.runtime.IStatus;

public interface ApplicationUpdateController {

	/**
	 * States:
	 * <table><tr><th>Value</th><th>clean state</th><th>requires restart</th></tr>
	 * <tr><td><code>CHECK_RUNNING</code><td>&#x2714;</td><td> </td></tr>
	 * <tr><td><code>CHECK_FAILED</code><td> </td><td> </td></tr>
	 * <tr><td><code>NO_UPDATE</code><td>&#x2714;</td><td> </td></tr>
	 * <tr><td><code>UPDATE_AVAILABLE</code><td>&#x2714;</td><td> </td></tr>
	 * <tr><td><code>UPDATE_REJECTED</code><td>&#x2714;</td><td> </td></tr>
	 * <tr><td><code>UPDATE_RUNNING</code><td>&#x2714;</td><td> </td></tr>
	 * <tr><td><code>UPDATE_FAILED</code><td> </td><td> </td></tr>
	 * <tr><td><code>UPDATE_SUCCESS</code><td>&#x2714;</td><td>&#x2714;</td></tr>
	 * </table>
	 * 
	 * @author jhoeper
	 *
	 */
	public enum EUpdateStatusType {

		CHECK_RUNNING(true, false),
		CHECK_FAILED(false, false),
		NO_UPDATE(true, false),
		UPDATE_AVAILABLE(true, false),
		UPDATE_REJECTED(true, false),
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

		/**
		 * Returns whether this is a clean state as opposed to a state indicating failure.
		 * @return
		 */
		public boolean isOk() {
			return ok;
		}

		/**
		 * Returns whether this state indicates that an application restart might be in order, i.e. if state is <code>UPDATE_SUCCESS</code>.
		 * @return
		 */
		public boolean restartRequired() {
			return restart;
		}
	}
	
	/** Set interval for software update to five minutes. **/
	public final long TIME_UNTIL_RECHECK = 60*1000*5;
	
	public boolean isUpdateAvailable();
	
	public EUpdateStatusType getStatus();
	
	public IStatus scheduleUpdate();
	
	public void scheduleCheck();

	/**
	 * If an update is available and none is already in the process of being installed,
	 * a confirmation dialog is spawned followed by the scheduling of an installation job
	 * on affirmation by user. 
	 */
	public void askForConfirmationAndInstall();
	
}
