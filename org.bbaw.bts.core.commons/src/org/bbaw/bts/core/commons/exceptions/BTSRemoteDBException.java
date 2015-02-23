package org.bbaw.bts.core.commons.exceptions;

public class BTSRemoteDBException extends BTSRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8773506479346131624L;

	public BTSRemoteDBException(String message)
	{
		super(message);
	}

	/**
	 * Instantiates a new BTSDB exception.
	 *
	 * @param message the message
	 * @param throwable the throwable
	 */
	public BTSRemoteDBException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
