package requestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Scenario_3GetPayroll {
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
	    
//	    String token=resp.jsonPath().get("access_token");
//	    
//	    // APi-2 get payroll
//	    given().auth().oauth2(token).get("http://49.249.29.4:8091/admin/payrolls").then().log().all();
	}

}
