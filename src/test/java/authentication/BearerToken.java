package authentication;

import static  io.restassured.RestAssured.* ;
import org.testng.annotations.Test;

public class BearerToken {
	@Test
	public void bearerTokenTest()
	{
		given().auth().oauth2("cROwJVgFjlOHhB6nSARaQSA09luzBaNeqhTQdwskymALm7cM7WXLuSwzwPFoWibYa4zcvnvkg2yOkGrCeLYrNmqOyF9t9Bp2PfYHEAb1EIySKaZkKCqfGU_TsKmQ").log().all()
		.when()
		.get("http://49.249.29.4:8091/projects")
		.then().assertThat().statusCode(200).log().all();
	}

}
