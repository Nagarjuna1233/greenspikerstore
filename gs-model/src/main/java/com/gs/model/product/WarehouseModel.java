package com.gs.model.product;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = WarehouseModel.TABLE_NAME)
public class WarehouseModel  extends BaseModel {
	
	public static final String TABLE_NAME = "Warehouse";

	private List<StockLevelModel> stockLevels;

	public List<StockLevelModel> getStockLevels() {
		return stockLevels;
	}

	public void setStockLevels(List<StockLevelModel> stockLevels) {
		this.stockLevels = stockLevels;
	}
	
	
}
