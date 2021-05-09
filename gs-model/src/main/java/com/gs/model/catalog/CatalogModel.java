package com.gs.model.catalog;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = CatalogModel.TABLE_NAME)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CatalogModel extends BaseModel {
	
	public static final String TABLE_NAME = "Catalog";

}