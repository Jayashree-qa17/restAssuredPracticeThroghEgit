package com.crud.withoutBdd;

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
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("createdBy", "jayashree.s");
		
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(jsonObj.toJSONString());
		Response response = reqSpec.patch("http://49.249.29.4:8091/project/NH_PROJ_009");
		response.then().log().all();
		response.then().assertThat().statusCode(200);
	}

}
