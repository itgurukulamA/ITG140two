package com.example.demo;



import java.util.concurrent.TimeUnit;


import org.springframework.util.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class Bound {
	@Test
	public void getItems() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/itemdata").then().statusCode(200).log().body();
		System.out.println("ok");
	}

public void addTestProjectContacts() {
		RestAssured.baseURI = "http://localhost:8080";
		//RestAssured.when().post("/itemdata").then().statusCode(200).log().body();
		JSONObject req = new JSONObject();

		req.put("id", 2584);
		req.put("price", 59990.0);
		req.put("name","Sony vivo");
	
		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON)
				.header("Content-Type", "application/json")
				.body(req.toJSONString()).when().post("/itemdata").then().extract().response();
		System.out.println("res==>" + res.asString());
		String result = res.jsonPath().getString("success");

		String samplepost = "Record  successfully";
		System.out.println("result==>" + result);

		System.out.println();

	}
public static void getResponseTime(){
		 RestAssured.baseURI = "http://localhost:8080";
		  System.out.println("time to finish"+RestAssured.given().get("/itemdata").
		         timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
		}

}
