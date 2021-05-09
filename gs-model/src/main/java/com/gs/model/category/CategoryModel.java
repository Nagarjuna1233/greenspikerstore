package com.gs.model.category;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = CategoryModel.TABLE_NAME)
public class CategoryModel  extends BaseModel {
	
	public static final String TABLE_NAME = "Catagory";

}
