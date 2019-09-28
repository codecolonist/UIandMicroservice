package com.codecolonist.hcui.Repository;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class MP_User {

	
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
		
		private String username;
		
		private String email;
		
		private String password;
		
		private Date create_time;
		
		private String firstname;
		
		private String lastname;
		
		private String phone;
		
		private Date lastlogin;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getCreate_time() {
			return create_time;
		}

		public void setCreate_time(Date create_time) {
			this.create_time = create_time;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Date getLastlogin() {
			return lastlogin;
		}

		public void setLastlogin(Date lastlogin) {
			this.lastlogin = lastlogin;
		}

	
		
}
