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

}
