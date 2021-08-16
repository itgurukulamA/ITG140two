package com.example.demo.ARITHEMETIC;

import org.springframework.stereotype.Service;

@Service
public class Testservice {
public int addition(Test test) {
	return test.getParameter1()+test.getParameter2();
}
}
