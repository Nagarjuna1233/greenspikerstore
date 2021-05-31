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
	
	public CatalogVersionModel getCatalogVersion() {
		return catalogVersion;
	}
	public void setCatalogVersion(CatalogVersionModel catalogVersion) {
		this.catalogVersion = catalogVersion;
	}
	public Collection<ProductModel> getProducts() {
		return products;
	}
	public void setProducts(Collection<ProductModel> products) {
		this.products = products;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
