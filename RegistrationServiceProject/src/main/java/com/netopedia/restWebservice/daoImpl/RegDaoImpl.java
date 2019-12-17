package com.netopedia.restWebservice.daoImpl;

import org.springframework.stereotype.Repository;

import com.netopedia.restWebservice.daoInterface.RegistrationDao;
import com.netopedia.restWebservice.model.User;

@Repository
public class RegDaoImpl implements RegistrationDao {

	@Override
	public User getUserById(long id) {
		if (id == 1) {
			User user = new User();
			user.setFirstName("Harpal");
			user.setLastName("Adichwal");
			user.setAge(5);
			user.setAddress("Canada");
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

}
