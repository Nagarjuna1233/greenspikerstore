package com.gs.model.order;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = OrderModel.TABLE_NAME)
public class OrderModel  extends AbstractOrderModel {
	
	public static final String TABLE_NAME = "Order";
	
	private Collection<OrderEntryModel> entries;

}
