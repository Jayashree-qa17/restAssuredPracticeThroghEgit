package complexPostRequest;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import allPojoClasses.ProjectPojo;
import io.restassured.http.ContentType;

public class PostReqViaPojoClass {
	@Test
	public void postDataToServer() {
		
		
		Random random=new Random();
		int ran=random.nextInt(5000);

		ProjectPojo obj=new ProjectPojo("shyam", "Apple_"+ran, "Created", 10);

		given().contentType(ContentType.JSON).body(obj).when().post("http://49.249.29.4:8091/addProject").then()
				.assertThat().statusCode(201).log().all();
	}

}
