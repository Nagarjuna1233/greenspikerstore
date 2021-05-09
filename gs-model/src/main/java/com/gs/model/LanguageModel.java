package com.gs.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = LanguageModel.TABLE_NAME)
public class LanguageModel extends BaseModel {
	
	public static final String TABLE_NAME = "Language";

}
