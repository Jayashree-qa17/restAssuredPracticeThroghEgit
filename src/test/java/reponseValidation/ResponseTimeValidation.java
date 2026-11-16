package reponseValidation;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResponseTimeValidation {
	@Test
	public void responseTimevalidation()
	{
		Response response = given().get("http://49.249.29.6:8084/projects");
		response.then().log().all();
		long timeInMs=response.time();
		long timeInSec = response.timeIn(TimeUnit.SECONDS);
		System.out.println(timeInMs);
		System.out.println(timeInSec);
		
		
		response.then().assertThat().time(Matchers.lessThan(900L));
		response.then().assertThat().time(Matchers.greaterThan(300L));
		response.then().assertThat().time(Matchers.both(Matchers.lessThan(900L)).and(Matchers.greaterThan(300L)));
	}

}
