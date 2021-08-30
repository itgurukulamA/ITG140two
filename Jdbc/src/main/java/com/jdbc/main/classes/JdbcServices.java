package com.jdbc.main.classes;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcServices {
	
	@Autowired JdbcTemplate jdbctemplate;
	public int insert(Jdbc jdbc) {
		
		

		String sql = "insert into jdbc values(?,?,?,?,?)";
		
		return jdbctemplate.update(sql,jdbc.getId(),jdbc.getName(),jdbc.getGmail(),jdbc.getAge(),jdbc.getPhone());
	}
}

