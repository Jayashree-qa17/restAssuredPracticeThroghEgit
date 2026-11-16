package complexPostRequest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReqViaJonObject {
	@Test
	public void postDataToServer()
	{
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("createdBy", "jayashree1");
		jsonObj.put("projectName", "projectC");
		jsonObj.put("status", "Created");
		jsonObj.put("teamSize", 0);
		
		given().contentType(ContentType.JSON).body(jsonObj.toJSONString())
		.when().post("http://49.249.29.6:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}

}
