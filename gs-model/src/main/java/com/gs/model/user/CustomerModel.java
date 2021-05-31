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
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public Collection<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Collection<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Collection<CartModel> getCarts() {
		return carts;
	}
	public void setCarts(Collection<CartModel> carts) {
		this.carts = carts;
	}
	public Collection<OrderModel> getOrders() {
		return orders;
	}
	public void setOrders(Collection<OrderModel> orders) {
		this.orders = orders;
	}
	
	

}
