package org.bbaw.bts.core.commons.exceptions;

public class BTSDBException extends RuntimeException
{
	public BTSDBException(String message)
	{
		super(message);
	}

	public BTSDBException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
