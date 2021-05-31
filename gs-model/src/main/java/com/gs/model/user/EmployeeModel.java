package com.gs.model.user;

import java.util.Collection;

import com.gs.model.embeddable.PhoneNumber;
import com.gs.model.enums.UserType;

public class EmployeeModel extends UserModel {

	private UserType userType;
	private Collection<PhoneNumber> phoneNumbers;
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
	
	
	
}
