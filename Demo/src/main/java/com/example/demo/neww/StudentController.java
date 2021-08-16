package com.example.demo.neww;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
StudentService ss1;
@PostMapping ("/istudent")
	public String insert(@RequestBody Student ss)
	{
			int i= ss1.insert(ss);
            if (i>0)
            {
            	return("Inserted Successfully");
            }
            else
            {
            	return("Not Inserted");
            }
}
}