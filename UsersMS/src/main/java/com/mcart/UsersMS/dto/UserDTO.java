package com.mcart.UsersMS.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.mcart.UsersMS.entity.Users;

public class UserDTO {
	@NotNull(message = "UserName can't be null")
	private String userName;
	@Size(min = 5, message = "Minimum 5 characters should be there in password")
	private String password;
	//@Pattern(regexp = "([0-9]{10})", message = "Phone Number Should be 10 digits")
	@Range(min = 1000000000, max = 9999999999L, message = "Phone Number Should be 10 digits")
	private long phoneNumber;
	@Email(message = "Enter a valid email ID")
	private String email;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static Users valueOf(UserDTO dto) {
		Users user = new Users();
		user.setUserName(dto.getUserName());
		user.setPassword(dto.getPassword());
		user.setPhoneNumber(dto.getPhoneNumber());
		user.setEmail(dto.getEmail());
		return user;
	}
}
