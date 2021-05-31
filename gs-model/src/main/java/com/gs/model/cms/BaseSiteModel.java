package com.gs.model.cms;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;
import com.gs.model.LanguageModel;
import com.gs.model.catalog.CatalogModel;
import com.gs.model.enums.BaseSiteThemEnum;

@Entity
@Table(name = BaseSiteModel.TABLE_NAME)
public class BaseSiteModel extends BaseModel {
	
	public static final String TABLE_NAME = "BaseSite";

	private List<BaseStoreModel> baseStores;
	private CatalogModel previewContentCatalog;
	private LanguageModel defaultLanguage;
	private BaseSiteThemEnum them;
	
	public List<BaseStoreModel> getBaseStores() {
		return baseStores;
	}
	public void setBaseStores(List<BaseStoreModel> baseStores) {
		this.baseStores = baseStores;
	}
	public CatalogModel getPreviewContentCatalog() {
		return previewContentCatalog;
	}
	public void setPreviewContentCatalog(CatalogModel previewContentCatalog) {
		this.previewContentCatalog = previewContentCatalog;
	}
	public LanguageModel getDefaultLanguage() {
		return defaultLanguage;
	}
	public void setDefaultLanguage(LanguageModel defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	public BaseSiteThemEnum getThem() {
		return them;
	}
	public void setThem(BaseSiteThemEnum them) {
		this.them = them;
	}
	
	

}
