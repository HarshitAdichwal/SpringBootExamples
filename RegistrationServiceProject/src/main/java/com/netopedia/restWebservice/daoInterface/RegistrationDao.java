/**
 * 
 */
package com.netopedia.restWebservice.daoInterface;

import com.netopedia.restWebservice.model.User;

/**
 * @author harshit
 *
 */
public interface RegistrationDao {
	User getUserById(long id);
}
