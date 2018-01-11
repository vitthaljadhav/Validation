package com.info.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Login {
	@NotEmpty(message="please Enter Your UserName")
private String userName;
	@NotEmpty
	@Size(min=3, max=6,message="Please Enter password min 3 and Max 6 character or Numerical")
private String password;
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
}
