package com.codecolonist.hcui.bean;


public class RegistrationResponse {

	private String lastName;
	private ServiceStatus serviceStatus;



	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	
}
