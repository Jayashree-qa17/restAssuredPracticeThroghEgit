
package reponseValidation;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseBodyValidation {
	@Test
	public void verifyHeader() {
		Response response = given().get("http://49.249.29.6:8084/projects");
		String projectName = response.jsonPath().get("[0].projectName");
		System.out.println(projectName);		
		
		assertEquals(projectName, "OrangeHrm_111");
		// or
//		response.then().assertThat().body("[0].projectName", Matchers.equalTo("OrangeHrm_111"));
         
	}

}
