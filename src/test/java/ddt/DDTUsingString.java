package ddt;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class DDTUsingString {
	@Test
	public void ddtUsingString()
	{
		String pName="google";
		String status="Created";
		String resBody="{\r\n"
				+ "  \"createdBy\": \"Geetha\",\r\n"
				+ "  \"projectName\": \""+pName+"\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"teamSize\": 0\r\n"
				+ "}";
				
		 given()
		.contentType(ContentType.JSON)
		.body(resBody)
		.when().post("http://49.249.29.4:8091/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

}
