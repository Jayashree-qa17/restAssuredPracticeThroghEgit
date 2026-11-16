package requestChaining;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Scenario3 {
	@Test
	public void getPayRoll()
	{
		//API-1 to generate access token
		Response resp = given()
		.formParam("client_id", "ninza-client")
		.formParam("client_secret", "gPQBf1Yxew5OMccMhzos1GefIyiSnXzM")
		.formParam("grant_type", "client_credentials")
		.when().post("http://49.249.29.4:8091/auth/realms/ninza/protocol/openid-connect/token");
	
	    resp.then().log().all();
	}

}
