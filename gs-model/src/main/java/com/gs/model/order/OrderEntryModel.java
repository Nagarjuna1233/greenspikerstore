package com.gs.model.order;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = OrderEntryModel.TABLE_NAME)
public class OrderEntryModel  extends AbstractOrderEntryModel {
	
	public static final String TABLE_NAME = "OrderEntry";

}
