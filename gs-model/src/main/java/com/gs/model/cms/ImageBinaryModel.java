package com.gs.model.cms;

import com.gs.model.AbstractBinaryModel;
import com.gs.model.catalog.CatalogVersionModel;

public class ImageBinaryModel extends AbstractBinaryModel {

	private String url;
	private String altText;
	private CatalogVersionModel catalogVersion;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAltText() {
		return altText;
	}
	public void setAltText(String altText) {
		this.altText = altText;
	}
	public CatalogVersionModel getCatalogVersion() {
		return catalogVersion;
	}
	public void setCatalogVersion(CatalogVersionModel catalogVersion) {
		this.catalogVersion = catalogVersion;
	}
	
	

}
