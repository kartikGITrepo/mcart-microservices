package com.mcart.UsersMS.dto;

import javax.validation.constraints.NotNull;

public class LoginDTO {
	@NotNull(message = "UserName can't be null")
	private String userName;
	@NotNull(message = "Password can't be null")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
