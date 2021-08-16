package com.example.demo.crud;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dbcontroller {
@Autowired
Dbservice ds;
@PostMapping("/i")
public String insert(@RequestBody Dbpojo dp)
{
	int i=ds.insert(dp);
	if(i>0)
	{
		return "inserted succesfully";
	}
	else {
		return "insertion failed";
	}
}
@PostMapping("/d")
public String delete(@RequestBody Dbpojo dp)
{
	int i=ds.delete(dp);
	if(i>0)
	{
		return "deleted succesfully";
	}
	else {
		return "deletion failed";
	}
}
@PostMapping("/u")
public String update(@RequestBody Dbpojo dp)
{
	int i=ds.update(dp);
	if(i>0)
	{
		return "updated succesfully";
	}
	else {
		return "updation failed";
	}
}
@PostMapping("/s")
public Map<String, Object> select(@RequestBody Dbpojo dp)
{
	return ds.select(dp);
}
}
