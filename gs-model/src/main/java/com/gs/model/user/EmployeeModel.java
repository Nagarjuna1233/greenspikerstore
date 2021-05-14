package com.gs.model.user;

import java.util.Collection;

import com.gs.model.embeddable.PhoneNumber;
import com.gs.model.enums.UserType;

public class EmployeeModel extends UserModel {

	private UserType userType;
	private Collection<PhoneNumber> phoneNumbers;
	
}
