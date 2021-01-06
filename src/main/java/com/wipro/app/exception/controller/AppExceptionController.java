package com.wipro.app.exception.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.wipro.app.exception.RecordNotfoundException;
import com.wipro.app.vo.Notification;

@RestControllerAdvice
public class AppExceptionController extends ResponseEntityExceptionHandler{

	@ExceptionHandler(RecordNotfoundException.class)
	public final ResponseEntity<Object> HandleRecordNotfoundException(HttpServletRequest request,RecordNotfoundException ex) {
		Notification notification = new Notification();
		notification.setContextPath(request.getServletPath());
		notification.setDescription(ex.getMessage());
		notification.setStatus("FAILED");
		notification.setErrorCode("B-110");
		return new ResponseEntity<>(notification,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
