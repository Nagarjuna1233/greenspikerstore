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
	public Collection<CategoryModel> getCategories() {
		return categories;
	}
	public void setCategories(Collection<CategoryModel> categories) {
		this.categories = categories;
	}
	public List<StockLevelModel> getStockLevels() {
		return stockLevels;
	}
	public void setStockLevels(List<StockLevelModel> stockLevels) {
		this.stockLevels = stockLevels;
	}
	public CatalogVersionModel getCatalogVersion() {
		return catalogVersion;
	}
	public void setCatalogVersion(CatalogVersionModel catalogVersion) {
		this.catalogVersion = catalogVersion;
	}
	public List<PriceRowModel> getPriceRows() {
		return priceRows;
	}
	public void setPriceRows(List<PriceRowModel> priceRows) {
		this.priceRows = priceRows;
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
	public ImageBinaryModel getNormalImageBinary() {
		return normalImageBinary;
	}
	public void setNormalImageBinary(ImageBinaryModel normalImageBinary) {
		this.normalImageBinary = normalImageBinary;
	}
	public Collection<ImageBinaryModel> getGalaryImageBinares() {
		return galaryImageBinares;
	}
	public void setGalaryImageBinares(Collection<ImageBinaryModel> galaryImageBinares) {
		this.galaryImageBinares = galaryImageBinares;
	}
	public ImageBinaryModel getThumbnailImageBinary() {
		return thumbnailImageBinary;
	}
	public void setThumbnailImageBinary(ImageBinaryModel thumbnailImageBinary) {
		this.thumbnailImageBinary = thumbnailImageBinary;
	}
	public Date getOnlineDate() {
		return onlineDate;
	}
	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}
	public Date getOfflineDate() {
		return offlineDate;
	}
	public void setOfflineDate(Date offlineDate) {
		this.offlineDate = offlineDate;
	}
	
	

}
