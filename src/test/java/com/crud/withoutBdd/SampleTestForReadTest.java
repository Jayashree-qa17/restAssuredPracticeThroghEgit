package com.crud.withoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForReadTest {
	@Test
	public void getDataFromServer()
	{
		Response response = RestAssured.get("http://49.249.29.4:8091/projects");
		response.then().assertThat().statusCode(200);
		response.then().log().all();
//		System.out.println(response.prettyPrint());
	}
	

}
