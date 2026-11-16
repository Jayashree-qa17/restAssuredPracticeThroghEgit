package serialAndDeserialization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonPropertyOrder(
//		value={"createdBy",
//				"teamSize",
//				"Status",
//				"teamSize"
		
//})

//@JsonIgnoreProperties(
//		value= {"teamSize"},allowSetters=true)



public class Project {
	private String projectname;
//	@JsonProperty(value="created by")
	private String createdBy;
	private int teamSize;
	private String Status;
	
	public Project() {
    }

	public Project(String projectname, String createdBy, int teamSize, String status) {
		super();
		this.projectname = projectname;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		Status = status;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
