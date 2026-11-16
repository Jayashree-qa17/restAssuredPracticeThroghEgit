package reponseValidation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class ResponseHeaderValidation {
	@Test
	public void verifyHeader()
	{
		Response response = given().get("http://49.249.29.6:8084/projects");
		response.then().log().all();
		response.then().statusCode(200);
		response.then().statusLine("HTTP/1.1 200 ");
		response.then().contentType(ContentType.JSON);
		response.then().header("Pragma","no-cache");
	}

}
