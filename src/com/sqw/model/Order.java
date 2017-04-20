package com.sqw.model;

public class Order {

	private int id;
	private String uuid;
	private String name;
	private String addr;
	private String userName;

	public Order(int id, String uuid, String name, String addr, String userName) {
		this.id = id;
		this.uuid = uuid;
		this.name  = name;
		this.addr = addr;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
