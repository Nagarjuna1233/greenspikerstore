package com.gs.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = CountryModel.TABLE_NAME)
public class CountryModel extends BaseModel {

	public static final String TABLE_NAME = "Country";

}
