package com.jdbc.main.update;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class TableService {
	@Autowired

	private JdbcTemplate jdbcTemplate;
	public static final Logger log = LoggerFactory.getLogger(TableService.class);
	@Autowired
	private NamedParameterJdbcTemplate npt;

	public Map<String, String> insert(Table ta) {

		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO employee (id,name,age) VALUES (:Id,:Name,:Age)";
		try {
			SqlParameterSource parameters = new MapSqlParameterSource().addValue("Id", ta.getId())
					.addValue("Name", ta.getName()).addValue("Age", ta.getAge());

			result = npt.update(sql, parameters);
			if (result > 0)
				data.put("success", "Record inserted successfully");
			else
				data.put("failed", "Record failed to insert, please try again!");
		} catch (Exception e) {

			data.put("error", "Error occured, please try again!");

		}

		return data;

	}

	public Map<String, String> update(Table ta) {
		Map<String, String> data = new HashMap<String, String>();
		//log.info("entered into update method");
		String sql = "update employee set age = :age where id = :id";
		SqlParameterSource parameters = new MapSqlParameterSource().addValue("id", ta.getId()).addValue("age",
				ta.getAge());
		int status = npt.update(sql, parameters);
		if (status > 0) {
			//log.info("Record updated successfully");
			data.put("updated", "succesfully data updated");
		} else {
			//log.info("Record not updated ");
			data.put("not updated", "not ");

		}
		return data;

	}

	public List<Map> nandini(int j) {
		Map<String, Object> dataMap =  null;
		List<Map> responseList = new ArrayList<Map>();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String nandu ="Select id,name,age from employee where id=? ";
		
		try {
			dataList = jdbcTemplate.queryForList(nandu,j);
			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap<String, Object>();
				dataMap.put("id", row.get("id"));
				dataMap.put("name", row.get("name"));
				dataMap.put("age", row.get("age"));
				responseList.add(dataMap);

			}
		}

		catch (Exception e) {
			dataMap.put("error", "error occured");
			
		}
		return responseList;

	}



}
