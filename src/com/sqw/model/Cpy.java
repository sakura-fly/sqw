package com.sqw.model;

import net.sf.json.JSONObject;

public class Cpy {
	private int id;
	private String userName;
	private String pwd;
	
	
	public Cpy(int id,String userName,String pwd) {
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
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
		JSONObject r = new JSONObject();
		r.put("id", id);
		return r.toString();
	}
}
