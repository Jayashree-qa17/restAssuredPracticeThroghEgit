package com.crud.withoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForCreateProjectTest {
	@Test
	public void postDataToServer()
	{
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("createdBy", "jayashree");
		jsonObj.put("projectName", "projectA");
		jsonObj.put("status", "created");
		jsonObj.put("teamSize", 0);
		
		
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(jsonObj.toJSONString());
		Response response = reqSpec.post("http://49.249.29.4:8091/addProject");
		response.then().log().all();
		response.then().assertThat().statusCode(201);
	}

}
