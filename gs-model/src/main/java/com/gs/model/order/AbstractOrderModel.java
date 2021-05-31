package com.gs.model.order;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.MappedSuperclass;

import com.gs.model.BaseModel;
import com.gs.model.embeddable.DiscountValue;
import com.gs.model.embeddable.TaxValue;
import com.gs.model.user.UserModel;

@MappedSuperclass
public class AbstractOrderModel extends BaseModel {

	private Collection<AbstractOrderEntryModel> entries;
	private BigDecimal totalPrice;
	private BigDecimal subTotal;
	private TaxValue taxValue;
	private DiscountValue discountValue;
	private Collection<DiscountValue> orderDiscountValues;
	private boolean recalculated;
	private UserModel user;
	
	public Collection<AbstractOrderEntryModel> getEntries() {
		return entries;
	}
	public void setEntries(Collection<AbstractOrderEntryModel> entries) {
		this.entries = entries;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public BigDecimal getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}
	public TaxValue getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(TaxValue taxValue) {
		this.taxValue = taxValue;
	}
	public DiscountValue getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(DiscountValue discountValue) {
		this.discountValue = discountValue;
	}
	public Collection<DiscountValue> getOrderDiscountValues() {
		return orderDiscountValues;
	}
	public void setOrderDiscountValues(Collection<DiscountValue> orderDiscountValues) {
		this.orderDiscountValues = orderDiscountValues;
	}
	public boolean isRecalculated() {
		return recalculated;
	}
	public void setRecalculated(boolean recalculated) {
		this.recalculated = recalculated;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	
	

}
