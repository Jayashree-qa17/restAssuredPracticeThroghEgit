package com.crud.withBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleTestForCompleteUpdateOfProject {
	@Test
	public void putDataToServer() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("createdBy", "jayashree");
		jsonObj.put("projectName", "TekPyrRS_2");
		jsonObj.put("status", "created");
		jsonObj.put("teamSize", 1);

		given().contentType(ContentType.JSON).body(jsonObj.toJSONString())
		.when().put("http://49.249.29.4:8091/project/NH_PROJ_015")
		.then().assertThat().statusCode(200).log().all();

	}
}
