package com.gs.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = CurrencyModel.TABLE_NAME)
public class CurrencyModel  extends BaseModel {
	public static final String TABLE_NAME = "Currency";
}
