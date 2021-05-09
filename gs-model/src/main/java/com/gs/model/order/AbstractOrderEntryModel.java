package com.gs.model.order;

import javax.persistence.MappedSuperclass;

import com.gs.model.BaseModel;

@MappedSuperclass
public class AbstractOrderEntryModel  extends BaseModel {
	
	public static final String TABLE_NAME = "Language";

}
