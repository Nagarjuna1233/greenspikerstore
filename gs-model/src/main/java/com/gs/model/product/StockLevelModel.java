package com.gs.model.product;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;

@Entity
@Table(name = StockLevelModel.TABLE_NAME)
public class StockLevelModel  extends BaseModel {
	
	public static final String TABLE_NAME = "StockLevel";
	
	private double quantity;

}
