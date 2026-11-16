package parametersPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class PathParameter {
	@Test
	public void getProject()
	{
		given().pathParam("projectId", "NH_PROJ_001").when()
		.get("http://49.249.29.4:8091/project/{projectId}")
		.then().assertThat().statusCode(200).log().all();
	}

}
