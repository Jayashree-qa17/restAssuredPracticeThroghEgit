package com.crud.withBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;


public class SampleTestForCreateProjectTest {
	@Test
	public void postDataToServer()
	{
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("createdBy", "jayashree");
		jsonObj.put("projectName", "projectB");
		jsonObj.put("status", "created");
		jsonObj.put("teamSize", 0);
		
		given().contentType(ContentType.JSON).body(jsonObj.toJSONString())
		.when().post("http://49.249.29.4:8091/addProject")
		.then().assertThat().statusCode(201).log().all();
		
		
		
	}

}
