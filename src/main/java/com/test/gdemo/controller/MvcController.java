package com.test.gdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {

	@GetMapping("/")
	public ResponseEntity<String> getHome(){
		return new ResponseEntity<String>("Gradle Build !!!", HttpStatus.OK);
	}
	
	@GetMapping("/custom")
	public ResponseEntity<String> getCustom(){
		return new ResponseEntity<String>("Custom Gradle Build !!!", HttpStatus.OK);
	}
}
