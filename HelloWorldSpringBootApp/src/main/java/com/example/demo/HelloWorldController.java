package com.example.demo;


import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World, This is rest Controller";
	}
}
