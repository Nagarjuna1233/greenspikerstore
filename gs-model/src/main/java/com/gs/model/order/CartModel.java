package com.gs.model.order;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = CartModel.TABLE_NAME)
public class CartModel  extends AbstractOrderModel {
	
	public static final String TABLE_NAME = "Cart";

}
