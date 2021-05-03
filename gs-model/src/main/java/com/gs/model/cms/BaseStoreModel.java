package com.gs.model.cms;

import java.util.List;

import com.gs.model.BaseModel;
import com.gs.model.CurrencyModel;
import com.gs.model.catalog.CatalogModel;
import com.gs.model.enums.TaxGroupEnum;

public class BaseStoreModel extends BaseModel {

	private List<BaseStoreModel> baseSites;
	private CatalogModel previewProductCatalog;
	private CurrencyModel defaultCurrency;
	private boolean net;
	private TaxGroupEnum taxGroup;

}
