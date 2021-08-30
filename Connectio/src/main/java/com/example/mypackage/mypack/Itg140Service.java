package com.example.mypackage.mypack;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class Itg140Service {
	@Autowired JdbcTemplate jdbctemplate;
	
public int insert(Itg140 it) {
	
	int id = it.getId();
	
	String name = it.getName();
	
	int age = it.getAge();
	
	String email = it.getEmail();
	
	int phone =it.getPhone();
	
	String sql = "insert into itg140 values(?,?,?,?,?)";
	return jdbctemplate.update (sql, id, name, email, age, phone);
	
   }

 }
