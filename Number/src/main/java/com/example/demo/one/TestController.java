package com.example.demo.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	TestService ts;
	@RequestMapping("/")
	String display() {
		return "hello";

	}

	@RequestMapping("/add")
	int add() {
		return 20 + 15;

	}

	

	@PostMapping("/addition")
	int addition(@RequestBody Test tt) {
		int i = ts.add(tt);
		return i;
	} 
	@PostMapping("/addparam") 
	int addition1(int a ,int b) 
	{
		return a+b;
	}

}
