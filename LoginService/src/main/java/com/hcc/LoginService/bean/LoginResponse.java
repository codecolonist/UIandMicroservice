package com.hcc.LoginService.bean;

public class LoginResponse {

	private String FirstName;
	private String LastName;
	private String ServiceMessage;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getServiceMessage() {
		return ServiceMessage;
	}
	public void setServiceMessage(String serviceMessage) {
		ServiceMessage = serviceMessage;
	}
	@Override
	public String toString() {
		return "LoginResponse [FirstName=" + FirstName + ", LastName=" + LastName + ", ServiceMessage=" + ServiceMessage
				+ "]";
	}
	
	
	
}
