package com.sj.model;

public class User {
	
	String usrname;
	String password;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String usrname, String password) {
		super();
		this.usrname = usrname;
		this.password = password;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [usrname=" + usrname + ", password=" + password + "]";
	}
	
	

}
