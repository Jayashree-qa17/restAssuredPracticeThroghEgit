package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import allPojoClasses.projectpojo1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario_1DeletingProject {
	@Test
	public void deletingProject() {
		Random random=new Random();
		int ran=random.nextInt(5000);

		projectpojo1 obj= new projectpojo1("Kiwi"+ran,"Created","Virat",0);

		// creating project as precondition
		Response res = given().contentType(ContentType.JSON).body(obj).when().post("http://49.249.29.4:8091/addProject");
		res.then().assertThat().statusCode(201).log().all();
		String projectId= res.jsonPath().get("projectId");
		
		// deleting the created project
		given().delete("http://49.249.29.4:8091/project/"+projectId).then().log().all();
		
		
	}
	
	

}
