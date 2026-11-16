package authentication;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth_2Test {
	@Test
	public void auth2Test()
	{
		Response resp = given()
		.formParam("client_id", "ninza-client")
		.formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
		.formParam("grant_type", "client_credentials")
		.when().post("http://49.249.28.218:8180/auth/realms/ninza/protocol/openid-connect/token");
		resp.then().log().all();
		
		// capture token from the response  keylock outh2.0
		String token=resp.jsonPath().get("access_token");
		
		given().auth().oauth2(token).log().all()
		.when().get("http://49.249.29.4.8091/projects")
		.then().log().all();
	}

}
