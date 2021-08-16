package com.example.demo.neww;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
@Autowired JdbcTemplate jdbctemplate;

		 public int insert (Student ss)
		{
	     
		 int id= ss.getId();
	     String name=ss.getName();
		 int age=ss.getAge();
         String email=ss.getEmail();
         int phno= ss.getPhno();
         String sql= "insert into itg140 values(?,?,?,?,?)";
         return jdbctemplate.update(sql,id,name,age,email,phno);
        

	}
		 
	}

