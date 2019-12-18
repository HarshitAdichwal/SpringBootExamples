package com.netopedia.restWebservice.ServiceInterface;

import com.netopedia.restWebservice.model.User;

public interface RegService {
	User getRegUserById(long id);
	String createUserById(User user);
}
