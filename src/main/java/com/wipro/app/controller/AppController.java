package com.wipro.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.app.service.impl.PhoneDirectoryServiceImpl;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	private PhoneDirectoryServiceImpl phoneDirectoryService;

	
	@GetMapping(path = "/palindromic/{input}")
	public ResponseEntity<?> getPalindrome(@PathVariable(value = "input") final String input) {
		return new ResponseEntity<>(phoneDirectoryService.getPalindrome(input), HttpStatus.OK);
	}
	
	
	@GetMapping(path = "/phonedirectory/{name}")
	public ResponseEntity<?> getPhoneDirectoryName(@PathVariable(value = "name") final String name) {
		return new ResponseEntity<>(phoneDirectoryService.getPhoneDirectoryName(name), HttpStatus.OK);
	}
}
