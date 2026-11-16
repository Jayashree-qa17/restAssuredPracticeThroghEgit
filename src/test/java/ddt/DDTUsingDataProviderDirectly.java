package ddt;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DDTUsingDataProviderDirectly {
	
@Test(dataProvider="getData")
public void  ddtUsingDataProvider(String pName, String status)
{
	
	String resBody="{\r\n"
			+ "  \"createdBy\": \"Geetha\",\r\n"
			+ "  \"projectName\": \""+pName+"\",\r\n"
			+ "  \"status\": \""+status+"\",\r\n"
			+ "  \"teamSize\": 0\r\n"
			+ "}";
			
	 given()
	.contentType(ContentType.JSON)
	.body(resBody)
	.when().post("http://49.249.29.4:8091/addProject")
	.then().assertThat().statusCode(201).log().all();
	 
	 
}
@DataProvider
public  Object[] [] getData()
{
	Object[][] objArr=new Object[3][2];
	objArr[0][1]="AirIndia1";
	objArr[0][1]="Created";
	objArr[1][0]="AirIndia2";
	objArr[1][1]="Created";
	objArr[2][0]="AirIndia3";
	objArr[2][1]="Created";
	
	return objArr;
	
}
}


