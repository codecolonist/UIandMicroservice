package com.hcc.LoginService.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcc.LoginService.Repository.MpUserRepository;
import com.hcc.LoginService.Repository.UserInfo;
import com.hcc.LoginService.bean.LoginRequest;
import com.hcc.LoginService.bean.LoginResponse;


@RestController
public class LoginServiceController {
	
	
	@Autowired
	private MpUserRepository mpuserrepo;
	

	@RequestMapping(value="/userLogin",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<LoginResponse> UserLogin(@RequestBody LoginRequest loginRequest,HttpServletRequest servletRequest) throws Exception  {
		
		 
		
		LoginResponse loginResponse = new LoginResponse();
		UserInfo mpuser = new UserInfo();
		
		mpuser= mpuserrepo.findUserByEmail(loginRequest.getEmail());
		
		
		if(loginRequest.getPassword().equalsIgnoreCase(mpuser.getPassword())  ){
			
			loginResponse.setFirstName(mpuser.getFirstname());
			loginResponse.setLastName(mpuser.getLastname());
			loginResponse.setServiceMessage("Welcome");
			return new ResponseEntity<>(loginResponse,HttpStatus.OK);
			
		}else {
             
			loginResponse.setServiceMessage("Login failed to Creds app");
			
			return new ResponseEntity<>(loginResponse,HttpStatus.BAD_REQUEST);
			
		}
		
		
		
	}
	

}
