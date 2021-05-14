package com.gs.model.embeddable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.gs.model.enums.PhoneType;

public class PhoneNumber {
	
	private String number;
	
	@Enumerated(EnumType.STRING)
	private PhoneType type;
}
