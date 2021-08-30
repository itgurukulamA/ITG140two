package com.example.mypackage.mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	@GetMapping("/getall")
	public String hello()
	{
	RestTemplate obj=new RestTemplate();
	String s=obj.getForObject("http://localhost:8080/hel", String.class);
	return s;
	}
	@GetMapping("/seepost")
	public String seeAllposts()
	{
	RestTemplate obj=new RestTemplate();
	Itg140 sobj=new Itg140();
	sobj.setId(5);
	sobj.setName("NandiniSrinivas");
	sobj.setAge(22);
	sobj.setEmail("dr@gmail.com");
	sobj.setPhone(9553696);
	String s=obj.postForObject("http://localhost:8080/istudent", sobj, String.class);
	return s;
	}
}