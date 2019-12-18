package com.netopedia.restWebservice.daoImpl;

import org.springframework.stereotype.Repository;

import com.netopedia.restWebservice.daoInterface.RegistrationDao;
import com.netopedia.restWebservice.model.User;

@Repository
public class RegDaoImpl implements RegistrationDao {
	User user = null;
	@Override
	public User getUserById(long id) {
		if (id == 1) {
			
			return user;
		} else if (id == 2) {
			User user = new User();
			user.setFirstName("Payal");
			user.setLastName("Adichwal");
			user.setAge(26);
			user.setAddress("Canada");
			return user;
		} else {
			return null;
		}
	}

	@Override
	public String createUserById(User user) {
		this.user = user;
		return "User Registered";
	}

	

}
