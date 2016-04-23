package com.gapperdan.hsbrs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET, produces="application/json")
	public String hello() {
		return "{\"hello\": \"world!\"}";
	}
}
