package complexPostRequest;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostReqViaJsonFile {
	@Test
	public void postDataToServer() {

		File fileObj = new File("./project.json");
		

		given().contentType(ContentType.JSON).body(fileObj).when()
				.post("http://49.249.29.6:8084/addProject").then().assertThat().statusCode(201).log().all();
	}

}
