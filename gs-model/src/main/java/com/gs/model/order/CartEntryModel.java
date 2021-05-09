package com.gs.model.order;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = CartEntryModel.TABLE_NAME)
public class CartEntryModel  extends AbstractOrderEntryModel {
	
	public static final String TABLE_NAME = "CartEntry";

}
