package reponseValidation;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class ResponseBodyValidationUsingJsonpath {
	
	@Test
	public void jsonPath()
	{
		Response response = given().get("http://49.249.29.6:8084/projects");
//		response.then().log().all();
		List<String> list = JsonPath.read(response.asString(), "[*].projectId");
		System.out.println(list);
	}

}
