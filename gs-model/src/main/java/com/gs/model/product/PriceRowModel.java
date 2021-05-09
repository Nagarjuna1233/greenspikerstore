package com.gs.model.product;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.gs.model.BaseModel;
import com.gs.model.CurrencyModel;

@Entity
@Table(name = PriceRowModel.TABLE_NAME)
public class PriceRowModel  extends BaseModel {
	
	public static final String TABLE_NAME = "PriceRow";
	
	private double value;
	private CurrencyModel currency;
	private Date startDate;
	private Date endDate;

}
