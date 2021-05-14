package com.gs.model.user;

import java.util.Collection;

import com.gs.model.embeddable.PhoneNumber;
import com.gs.model.enums.UserType;
import com.gs.model.order.CartModel;
import com.gs.model.order.OrderModel;

public class CustomerModel extends UserModel {
	
	private UserType userType;
	private Collection<PhoneNumber> phoneNumbers;
	private Collection<CartModel> carts;
	private Collection<OrderModel> orders;

}
