package com.codecolonist.hcui.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codecolonist.hcui.Exception.RestResponseEntityExceptionHandler;
import com.codecolonist.hcui.Repository.MP_User;
import com.codecolonist.hcui.Repository.MpUserRepository;
import com.codecolonist.hcui.bean.LoginRequest;
import com.codecolonist.hcui.bean.LoginResponse;

@RestController
public class LoginController extends  RestResponseEntityExceptionHandler{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private MpUserRepository mpuserrepo;

	
	@RequestMapping(value="/userLogin",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<LoginResponse> UserLogin(@RequestBody LoginRequest loginRequest,HttpServletRequest servletRequest) throws Exception  {
		
		 
		
		LoginResponse loginResponse = new LoginResponse();
		MP_User mpuser = new MP_User();
		
		mpuser= mpuserrepo.findUserByEmail(loginRequest.getEmail());
		
		
		if(loginRequest.getPassword().equalsIgnoreCase(mpuser.getPassword())  ){
			
			loginResponse.setFirstName(mpuser.getFirstname());
			loginResponse.setLastName(mpuser.getLastname());
			loginResponse.setServiceMessage("Welcome");
			return new ResponseEntity<>(loginResponse,HttpStatus.OK);
			
		}else {
             throw new Exception();
			//loginResponse.setServiceMessage("Login failed to MahanyaRam Photography");
			
			//return new ResponseEntity<>(loginResponse,HttpStatus.EXPECTATION_FAILED);
			
		}
		
		
		
	}
	

	
}
