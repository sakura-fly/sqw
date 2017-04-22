package com.sqw.model;

public class Order {

	private int id;
	private String uuid;
	private String name;
	private String addr;
	private String nowAddr;
	private String userName;

	
	public Order() {
	}

	public Order(String uuid, String name, String addr, String nowAddr, String userName) {
		super();
		this.uuid = uuid;
		this.name = name;
		this.addr = addr;
		this.nowAddr = nowAddr;
		this.userName = userName;
	}

	public Order(int id, String uuid, String name, String addr, String nowAddr, String userName) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.name = name;
		this.addr = addr;
		this.nowAddr = nowAddr;
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

	public String getNowAddr() {
		return nowAddr;
	}

	public void setNowAddr(String nowAddr) {
		this.nowAddr = nowAddr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"id\":\"");
		builder.append(id);
		builder.append("\", \"uuid\":\"");
		builder.append(uuid);
		builder.append("\", \"name\":\"");
		builder.append(name);
		builder.append("\", \"addr\":\"");
		builder.append(addr);
		builder.append("\", \"nowAddr\":\"");
		builder.append(nowAddr);
		builder.append("\", \"userName\":\"");
		builder.append(userName);
		builder.append("\"}");
		return builder.toString();
	}

}
