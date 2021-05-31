package com.gs.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
//import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class RootModel {

	@Id
	@GeneratedValue(generator = "gs-pkgenerator")
	@GenericGenerator(name = "gs-pkgenerator", strategy = "com.gs.core.service.GsPkGenerator")
	private String pk;
	
	private Date createdTime;
	
	private Date modifiedTime;
	
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}
	
	
}
