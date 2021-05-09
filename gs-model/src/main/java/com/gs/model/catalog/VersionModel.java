package com.gs.model.catalog;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = VersionModel.TABLE_NAME)
public class VersionModel  extends BaseModel {
	
	public static final String TABLE_NAME = "Version";

}
