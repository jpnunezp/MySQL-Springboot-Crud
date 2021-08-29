package com.jp.crud.cl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

public abstract class ApiSubError {
	
}

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
class ApiValidationError extends ApiSubError{
	private String Object;
	private String Field;
	private Object RejectedValue;
	private String Message;
	
	public ApiValidationError(String object, String message) {
		this.Object = object;
		this.Message = message;
	}
	
}
