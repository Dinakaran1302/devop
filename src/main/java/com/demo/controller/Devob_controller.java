package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Devob_controller {
	@GetMapping ("/get")
	public String get() {
		return "successfully";
	}

}
