package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/show")
	public String show()
	{
		return "Welcome to Spring boot application";
	}
	
}
