package com.gs.model.cms;

import java.util.List;

import com.gs.model.BaseModel;
import com.gs.model.LanguageModel;
import com.gs.model.catalog.CatalogModel;
import com.gs.model.enums.BaseSiteThemEnum;

public class BaseSiteModel extends BaseModel {

	private List<BaseStoreModel> baseStores;
	private CatalogModel previewContentCatalog;
	private LanguageModel defaultLanguage;
	private BaseSiteThemEnum them;

}
