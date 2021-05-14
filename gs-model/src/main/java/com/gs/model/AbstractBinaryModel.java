package com.gs.model;

import javax.persistence.MappedSuperclass;

import com.gs.model.enums.MimeType;

@MappedSuperclass
public class AbstractBinaryModel extends BaseModel {

	private MimeType mimeType;
	private long size;
	private String location;

}
