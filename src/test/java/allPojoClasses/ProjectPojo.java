package allPojoClasses;

public class ProjectPojo {

	private String createdBy;
	private String projectName;
	private String status;
	private int teamSize;

	public ProjectPojo() {

	}

	public ProjectPojo(String createdBy, String projectname, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectname;
		this.status = status;
		this.teamSize = teamSize;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectname() {
		return projectName;
	}

	public void setProjectname(String projectname) {
		this.projectName = projectname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

}
