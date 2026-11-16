package practice;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class RestAssuredMethodsPractice {

	public static void main(String[] args) {
		get("https://reqres.in/api/users?page=2").then().log().all();
       

	}

}
