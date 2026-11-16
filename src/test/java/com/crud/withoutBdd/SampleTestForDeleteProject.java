package com.crud.withoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForDeleteProject {
	@Test
	public void deleteDataFromServer()
	{
		Response response = RestAssured.delete("http://49.249.29.4:8091/project/NH_PROJ_011");
		response.then().assertThat().statusCode(204);
		response.then().log().all();
//		System.out.println(response.prettyPrint());
	}

}
