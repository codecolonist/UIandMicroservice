package com.hcc.LoginService.Repository;

import org.springframework.data.repository.CrudRepository;


public interface MpUserRepository extends CrudRepository<UserInfo, Integer> {
	
	 	
	     UserInfo findUserByEmail(String email);

}
