package com.gs.model.product;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = ProductModel.TABLE_NAME)
public class ProductModel  extends BaseModel {
	public static final String TABLE_NAME = "Product";
	private List<StockLevelModel> stockLevels;
	private List<PriceRowModel> priceRows;
	
}
