package parametersPractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	public void getProjectDetails()
	{
		
		// to get all the project whose team size is 2
		given()
		.queryParam("teamSize", 2 )
//		.queryParam("status", "On Going")
		.log().all()
		.when().get("http://49.249.29.4:8091/project").then().assertThat().statusCode(200).log().all();
	}

}
