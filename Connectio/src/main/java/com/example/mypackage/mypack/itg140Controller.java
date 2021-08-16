package com.example.mypackage.mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class itg140Controller {
	
	@Autowired
	Itg140Service its;
	@PostMapping("/ITGI")
	public String insert(@RequestBody Itg140 itg) {
		int i =its.insert(itg);
		if(i>0) {
			return("Inserted Succesfully");
		}
			else
			{
		
			return("Not inserted");
	}

}
}