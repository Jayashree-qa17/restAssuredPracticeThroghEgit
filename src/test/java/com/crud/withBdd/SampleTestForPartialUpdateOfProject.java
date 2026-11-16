package com.crud.withBdd;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPartialUpdateOfProject {
	@Test
	public void patchDataToServer()
	{
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("projectName", "TekPyrRS_1");
		given().contentType(ContentType.JSON).body(jsonObj.toJSONString())
		.when().patch("http://49.249.29.4:8091/project/NH_PROJ_015")
		.then().assertThat().statusCode(200).log().all();
	}

}
