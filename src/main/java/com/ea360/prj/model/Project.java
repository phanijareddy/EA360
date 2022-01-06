package com.ea360.prj.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ea360_project")
public class Project {
	
	@Id
	private String id;
	
	@Field(name = "ProjectName")	
	private String projectName;
	
	@Field(name = "CreateDate")
	private String createDate;
	
	@Field(name = "ProjectStatus")
	private String projectStatus;
	
	@Field(name = "ProjectOwner")
	private String projectOwner;
	
	@Field(name = "ScrumMaster")
	private String scrumMaster;	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getProjectOwner() {
		return projectOwner;
	}
	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}
	public String getScrumMaster() {
		return scrumMaster;
	}
	public void setScrumMaster(String scrumMaster) {
		this.scrumMaster = scrumMaster;
	}
	
	

}
