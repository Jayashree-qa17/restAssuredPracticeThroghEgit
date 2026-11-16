package ddt;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;
import io.restassured.http.ContentType;

public class DDTUdingDataProvAndExcel {
	
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
public  Object[] [] getData() throws EncryptedDocumentException, IOException
{
	ExcelUtility eUtil=new ExcelUtility();
	int rowCount = eUtil.getrowCount("projects");
	
	Object[][] objArr=new Object[rowCount][2];
	for(int i=0;i<rowCount;i++)
	{
		objArr[i][0]=eUtil.getSingleCellDataFromExcelFile("projects", i+1, 0);
		objArr[i][1]=eUtil.getSingleCellDataFromExcelFile("projects", i+1, 1);;	
	}
	return objArr;
	
	
}

}
