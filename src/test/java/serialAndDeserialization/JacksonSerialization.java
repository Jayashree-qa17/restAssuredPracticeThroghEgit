package serialAndDeserialization;

import java.io.File;

import tools.jackson.databind.ObjectMapper;

public class JacksonSerialization {

	public static void main(String[] args) {
		Project projectObj = new Project(" sunmicros","jay", 01,"created");
		ObjectMapper objmap=new ObjectMapper();
		objmap.writeValue(new File("./project1.json"), projectObj);
		System.out.println("=========end==========");

	}

}
