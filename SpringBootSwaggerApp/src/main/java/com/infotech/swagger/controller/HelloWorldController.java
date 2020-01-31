package com.infotech.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/hello-egiants")
	public String hello(){
		return "Welcome to Egiants Iowa !!";
	}
}
