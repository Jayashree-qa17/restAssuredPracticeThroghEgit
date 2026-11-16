package parametersPractice;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ParamParameter {
	@Test
	public void getProjectDetails()
	{
		
		// to get all the project whose team size is 2
		given()
		.param("teamSize", 2 )
		.log().all()
		.when().post("http://49.249.29.4:8091/project").then().assertThat().log().all();
	}
}
