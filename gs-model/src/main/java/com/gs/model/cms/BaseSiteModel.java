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

}
