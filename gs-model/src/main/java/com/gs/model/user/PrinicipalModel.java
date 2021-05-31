package com.gs.model.user;

import java.util.Collection;

import com.gs.model.BaseModel;

public class PrinicipalModel extends BaseModel {

	private Collection<UserGroupModel> userGroups;

	public Collection<UserGroupModel> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(Collection<UserGroupModel> userGroups) {
		this.userGroups = userGroups;
	}
	
	
}
