package com.codecolonist.hcui.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.codecolonist.hcui.bean.ServiceStatus;

@ControllerAdvice
public class RestResponseEntityExceptionHandler  {
	
	
	@ExceptionHandler(LoginErrorException.class)
	public final ResponseEntity<Object> CustomException(
			LoginErrorException ex,  WebRequest request) {
	    String error = "No handler found for " ;
	 
	    ServiceStatus apiError = new ServiceStatus(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), error);
	    return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> DefaultException(
			Exception ex, WebRequest request) {
	    String error = "No handler found for ";
	 
	    ServiceStatus apiError = new ServiceStatus(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), error);
	    return new ResponseEntity<Object>(apiError, new HttpHeaders(), apiError.getStatus());
	}

}
