package com.example.mypackage.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.jdbc.main.classes.Jdbc;
//import com.jdbc.main.classes.JdbcServices;
@RestController
public class CompanyController {



@Autowired CompanyService ta1;

@PostMapping("/itable")
public Map<String,String> insert(@RequestBody Company ta) {
return ta1.update(ta);

  }

}
