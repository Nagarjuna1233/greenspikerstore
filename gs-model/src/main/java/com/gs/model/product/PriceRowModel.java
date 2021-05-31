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
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public CurrencyModel getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyModel currency) {
		this.currency = currency;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

}
