package com.gs.model.catalog;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;
import com.gs.model.enums.Version;

@Entity
@Table(name = CatalogVersionModel.TABLE_NAME)
public class CatalogVersionModel extends BaseModel {
	
	public static final String TABLE_NAME = "CatalogVersion";

	
	private CatalogModel catelog;
	private Version version;
	
}