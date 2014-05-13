package org.bbaw.bts.core.commons.exceptions;

public class BTSDBException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1556776064316564601L;

	public BTSDBException(String message)
	{
		super(message);
	}

	public BTSDBException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
