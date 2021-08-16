package com.example.demo.one;

import org.springframework.stereotype.Service;
import com.example.demo.one.Test;

@Service

public class TestService {
	public int add(Test tt) {
		return tt.getNum1() + tt.getNum2();

	}
}