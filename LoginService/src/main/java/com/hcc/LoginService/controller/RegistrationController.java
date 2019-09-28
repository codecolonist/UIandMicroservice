package com.hcc.LoginService.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcc.LoginService.Repository.MpUserRepository;
import com.hcc.LoginService.Repository.UserInfo;
import com.hcc.LoginService.bean.RegistrationRequest;
import com.hcc.LoginService.bean.RegistrationResponse;
import com.hcc.LoginService.bean.ServiceStatus;



@RestController
public class RegistrationController {
	
	@Autowired
	private MpUserRepository mpuserrepo;
	
	@RequestMapping(value="/register",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RegistrationResponse UserRegistration(@RequestBody RegistrationRequest registationRequest,HttpServletRequest servletRequest) throws Exception  {
		
		UserInfo mpuser = new UserInfo();		
		mpuser=registationRequest.getMpuser();
		RegistrationResponse registrationResponse = new RegistrationResponse();
		
		try {
			mpuserrepo.save(mpuser);	
			ServiceStatus serviceStatus = new ServiceStatus(HttpStatus.ACCEPTED,"Registration is successfully done!","");
			registrationResponse.setLastName(mpuser.getLastname());	
			registrationResponse.setServiceStatus(serviceStatus);
		} catch (DataIntegrityViolationException e) {
			// TODO Auto-generated catch block
			ServiceStatus serviceStatus = new ServiceStatus(HttpStatus.ACCEPTED,"Username or email Id already exists!","please check your email Id");
			registrationResponse.setLastName(mpuser.getLastname());	
			registrationResponse.setServiceStatus(serviceStatus);
	
			e.printStackTrace();
		}
		
		
		return registrationResponse;
		
		
	}
	
	@RequestMapping(value="/allregs",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<UserInfo> getAllUsers() {
		// This returns a JSON or XML with the users
		return mpuserrepo.findAll();
	}

}
