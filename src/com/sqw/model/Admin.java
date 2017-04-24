package com.sqw.model;


public class Admin {
	private int id;
	private String userName;
	private String pwd;
	
	public Admin(int id,String userName,String pwd) {
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"id\":\"");
		builder.append(id);
		builder.append("\", \"userName\":\"");
		builder.append(userName);
		builder.append("\", \"pwd\":\"");
		builder.append(pwd);
		builder.append("\"}");
		return builder.toString();
	}
	
	
	
}
