package com.gs.model.product;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;
import com.gs.model.catalog.CatalogVersionModel;
import com.gs.model.category.CategoryModel;
import com.gs.model.cms.ImageBinaryModel;

@Entity
@Table(name = ProductModel.TABLE_NAME)
public class ProductModel extends BaseModel {
	public static final String TABLE_NAME = "Product";

	private Collection<CategoryModel> categories;
	private List<StockLevelModel> stockLevels;
	private CatalogVersionModel catalogVersion;
	private List<PriceRowModel> priceRows;
	private String displayName;
	private String description;
	private ImageBinaryModel normalImageBinary;
	private Collection<ImageBinaryModel> galaryImageBinares;
	private ImageBinaryModel thumbnailImageBinary;
	private Date onlineDate;
	private Date offlineDate;

}
