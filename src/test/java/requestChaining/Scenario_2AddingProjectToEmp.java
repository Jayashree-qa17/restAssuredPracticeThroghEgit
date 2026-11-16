package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import allPojoClasses.EmployeePojo;
import allPojoClasses.projectpojo1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scenario_2AddingProjectToEmp {
	
	//creating project
	@Test
	public void creatingproject() {
	// creating project
	Random random=new Random();
	int ran=random.nextInt(5000);

	projectpojo1 obj= new projectpojo1("Kiwi"+ran,"Created","Virat",0);

	// creating project as precondition
	Response res = given().contentType(ContentType.JSON).body(obj).when().post("http://49.249.29.4:8091/addProject");
	res.then().assertThat().statusCode(201).log().all();
	String projectName= res.jsonPath().get("projectName");
	
	// Creating Employee
	
//	String designation, String dob, String email, String empName, double experience,
//	String mobileNo, String project, String role, String username
	
	EmployeePojo empObj=new EmployeePojo("testeng", "05/06/1990","ramu@gmail.com", "Ram", 2.0, "6666666666", projectName,"ROLE_ADMIN","ram_"+ ran);
		given().contentType(ContentType.JSON).body(empObj).when().post("http://49.249.29.4:8091/employees").then().assertThat().statusCode(201).log().all();
				
	}
	
	
	
	

}
