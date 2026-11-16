package complexPostRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReqViaHashmap {
	@Test
	public void postDataToServer()
	{
		HashMap map=new HashMap();
		map.put("createdBy", "jayashree");
		map.put("projectName", "projectc");
		map.put("status", "created");
		map.put("teamSize", 0);
		
		given().contentType(ContentType.JSON).body(map)
		.when().post("http://49.249.29.6:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}

}
