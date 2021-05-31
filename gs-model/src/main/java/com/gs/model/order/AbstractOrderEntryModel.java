package com.gs.model.order;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.MappedSuperclass;

import com.gs.model.BaseModel;
import com.gs.model.embeddable.DiscountValue;
import com.gs.model.embeddable.TaxValue;
import com.gs.model.product.ProductModel;

@MappedSuperclass
public class AbstractOrderEntryModel extends BaseModel {

	private ProductModel product;
	private int quantity;
	private BigDecimal basePrice;
	private BigDecimal totalPrice;
	private boolean recalculated;
	@ElementCollection
	private Collection<TaxValue> taxValues;
	@ElementCollection
	private Collection<DiscountValue> discountValues;
	private AbstractOrderModel order;
	
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isRecalculated() {
		return recalculated;
	}
	public void setRecalculated(boolean recalculated) {
		this.recalculated = recalculated;
	}
	public Collection<TaxValue> getTaxValues() {
		return taxValues;
	}
	public void setTaxValues(Collection<TaxValue> taxValues) {
		this.taxValues = taxValues;
	}
	public Collection<DiscountValue> getDiscountValues() {
		return discountValues;
	}
	public void setDiscountValues(Collection<DiscountValue> discountValues) {
		this.discountValues = discountValues;
	}
	public AbstractOrderModel getOrder() {
		return order;
	}
	public void setOrder(AbstractOrderModel order) {
		this.order = order;
	}
	
	

}
