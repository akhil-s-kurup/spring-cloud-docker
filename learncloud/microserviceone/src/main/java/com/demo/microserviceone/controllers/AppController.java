package com.demo.microserviceone.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class AppController {
	
	@GetMapping("/get")
	public String home() {
		 Logger logger = LoggerFactory.getLogger(AppController.class);
		 logger.info("Got ge request");
		return "<h2>Microservice one is running</h2>";
	}

}
