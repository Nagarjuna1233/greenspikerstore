package com.gs.model.category;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;
import com.gs.model.catalog.CatalogVersionModel;
import com.gs.model.product.ProductModel;

@Entity
@Table(name = CategoryModel.TABLE_NAME)
public class CategoryModel extends BaseModel {

	public static final String TABLE_NAME = "Catagory";

	private CatalogVersionModel catalogVersion;
	private Collection<ProductModel> products;
	private String displayName;
	private String description;

}
