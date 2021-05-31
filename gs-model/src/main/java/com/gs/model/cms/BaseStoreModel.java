package com.gs.model.cms;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;
import com.gs.model.CurrencyModel;
import com.gs.model.catalog.CatalogModel;
import com.gs.model.enums.TaxGroupEnum;

@Entity
@Table(name = BaseStoreModel.TABLE_NAME)
public class BaseStoreModel extends BaseModel {
	
	public static final String TABLE_NAME = "BaseStore";

	private List<BaseStoreModel> baseSites;
	private CatalogModel previewProductCatalog;
	private CurrencyModel defaultCurrency;
	private boolean net;
	private TaxGroupEnum taxGroup;
	public List<BaseStoreModel> getBaseSites() {
		return baseSites;
	}
	public void setBaseSites(List<BaseStoreModel> baseSites) {
		this.baseSites = baseSites;
	}
	public CatalogModel getPreviewProductCatalog() {
		return previewProductCatalog;
	}
	public void setPreviewProductCatalog(CatalogModel previewProductCatalog) {
		this.previewProductCatalog = previewProductCatalog;
	}
	public CurrencyModel getDefaultCurrency() {
		return defaultCurrency;
	}
	public void setDefaultCurrency(CurrencyModel defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	public boolean isNet() {
		return net;
	}
	public void setNet(boolean net) {
		this.net = net;
	}
	public TaxGroupEnum getTaxGroup() {
		return taxGroup;
	}
	public void setTaxGroup(TaxGroupEnum taxGroup) {
		this.taxGroup = taxGroup;
	}
	
	

}
