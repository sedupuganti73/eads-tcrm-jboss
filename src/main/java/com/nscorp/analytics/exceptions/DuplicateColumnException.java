package com.nscorp.analytics.exceptions;

/**
 * @author sedupuganti
 *
 */

public class DuplicateColumnException extends Exception{
	private String columnName ="";
	public DuplicateColumnException(String columnName){
		this.columnName = columnName;
	}
	@Override
	public String getMessage() {
		return this.columnName+" is a duplicate column";
	}
}
