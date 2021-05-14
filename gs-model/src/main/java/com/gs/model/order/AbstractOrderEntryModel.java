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

}
