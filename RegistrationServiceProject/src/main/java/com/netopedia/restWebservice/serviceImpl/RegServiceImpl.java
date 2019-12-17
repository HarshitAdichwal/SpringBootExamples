package com.netopedia.restWebservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netopedia.restWebservice.ServiceInterface.RegService;
import com.netopedia.restWebservice.daoInterface.RegistrationDao;
import com.netopedia.restWebservice.model.User;

@Service
public class RegServiceImpl implements RegService {

	@Autowired
	RegistrationDao registrationDao;
	
	@Override
	public User getRegUserById(long id) {
		return registrationDao.getUserById(id);
	}

}
