package com.gs.model.embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class TaxValue implements BaseValue{

	@Override
	public double getValue() {
		return 0;
	}

}