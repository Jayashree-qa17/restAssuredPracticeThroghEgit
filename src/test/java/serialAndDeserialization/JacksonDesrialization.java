package serialAndDeserialization;

import java.io.File;

import tools.jackson.databind.ObjectMapper;

public class JacksonDesrialization {

	public static void main(String[] args) {
		ObjectMapper objmap=new ObjectMapper();
		Project pObj = objmap.readValue(new File("./project.json"), Project.class);
		System.out.println(pObj.getProjectname());
		System.out.println(pObj.getTeamSize());
		System.out.println(pObj.getCreatedBy());
		System.out.println(pObj.getStatus());
		}

}
