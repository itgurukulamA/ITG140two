package com.example.demo.crud;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ch.qos.logback.classic.Logger;

@Service
public class Dbservice {
@Autowired
JdbcTemplate jt;

public int insert(@RequestBody Dbpojo dp)
{
	String sql="insert into itg140 values(?,?,?,?)";
	int i=jt.update(sql,dp.getId(),dp.getAge(),dp.getName(),dp.getPhno());
	return i;
}
public int delete(@RequestBody Dbpojo dp)
{
	String sql="delete from itg140 where id=?";
	int i=jt.update(sql,dp.getId());
	return i;
}
public int update(@RequestBody Dbpojo dp)
{
	String sql="update itg140 set age=?,name=?,phno=? where id=?";
	int i=jt.update(sql,dp.getAge(),dp.getName(),dp.getPhno(),dp.getId());
	return i;	
}
public Map<String, Object> select(@RequestBody Dbpojo dp)
{
	String sql="select * from itg140 where id=?";
	Map<String, Object> data=jt.queryForMap(sql,dp.getId());
	return data;
}
}
