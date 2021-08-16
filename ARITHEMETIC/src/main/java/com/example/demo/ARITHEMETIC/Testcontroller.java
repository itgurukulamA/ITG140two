package com.example.demo.ARITHEMETIC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
	@Autowired
	Testservice ser;
	@RequestMapping("/")
public String text() {
	return "Hello";
}
	@RequestMapping("/add")
	public int add()
	{
		return 21+21;
	}
	@PostMapping("/addition")
	public int addition(@RequestBody Test test1) {
	return ser.addition(test1);
	}
}
