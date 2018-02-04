package com.raju.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Application {
	@Id
	@GeneratedValue
	private Long id;
	private Long appCode;
	private String appDescription;
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	private HashMap properties[];
	private String version;
	private Date modifiedDate;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Long getAppCode() {
		return appCode;
	}
	public void setAppCode(Long appCode) {
		this.appCode = appCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public HashMap[] getProperties() {
		return properties;
	}
	public void setProperties(HashMap[] properties) {
		this.properties = properties;
	}
	public String getAppDescription() {
		return appDescription;
	}
	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}
	
	
	

}
