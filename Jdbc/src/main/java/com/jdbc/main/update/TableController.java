package com.jdbc.main.update;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




//import com.jdbc.main.classes.Jdbc;
//import com.jdbc.main.classes.JdbcServices;
@RestController
public class TableController {
	
	
	 
		@Autowired TableService ta1;

		@PostMapping("/itable")
		public Map<String,String> insert(@RequestBody Table ta) {
			return ta1.update(ta);
			
	   }

		@GetMapping("/select")
		public List<Map> nandini(@RequestBody Table t)
		{
			int i= t.getId();
          return ta1.nandini(i);
		
		}
		
		
}