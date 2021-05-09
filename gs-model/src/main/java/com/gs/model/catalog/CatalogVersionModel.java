package com.gs.model.catalog;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = CatalogVersionModel.TABLE_NAME)
public class CatalogVersionModel extends BaseModel {
	
	public static final String TABLE_NAME = "CatalogVersion";

	
}