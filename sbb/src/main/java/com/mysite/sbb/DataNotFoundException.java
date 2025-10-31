<<<<<<< HEAD
package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="entity not found")
public class DataNotFoundException extends RuntimeException{
	private static final long serialVersionUID =1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
=======
package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="entity not found")
public class DataNotFoundException extends RuntimeException{
	private static final long serialVersionUID =1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
>>>>>>> d33bc38e305935db62527ada7b813d773719fe6c
