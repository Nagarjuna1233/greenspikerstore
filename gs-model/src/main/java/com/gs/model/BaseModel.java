package com.gs.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
	private String uid;
	private String name;
}
