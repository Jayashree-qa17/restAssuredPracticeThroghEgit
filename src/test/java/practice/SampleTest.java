package practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTest {

	public static void main(String[] args) {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.prettyPrint());
	}

}
