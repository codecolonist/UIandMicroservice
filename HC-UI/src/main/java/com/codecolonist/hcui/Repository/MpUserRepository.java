package com.codecolonist.hcui.Repository;

import org.springframework.data.repository.CrudRepository;


public interface MpUserRepository extends CrudRepository<MP_User, Integer> {
	
	 	
	     MP_User findUserByEmail(String email);

}
