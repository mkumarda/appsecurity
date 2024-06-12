package com.intel.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyappController {
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Application Security!";
	}
    @GetMapping("/hello")
	public String hello() {
		return "Please Login First!";
	}

}
