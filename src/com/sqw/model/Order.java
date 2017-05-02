package com.sqw.model;

import java.sql.Timestamp;

public class Order {

	private int id;
	private String uuid;
	private String name;
	private String addr;
	private String nowAddr;
	private String userName;
	private String carNum;
	private Timestamp time; 
	private Timestamp sendTime;
	private int uid;

	
	public Order() {
	}








	public Order(int id, String uuid, String name, String addr, String nowAddr, String userName, String carNum,
			Timestamp time, Timestamp sendTime, int uid) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.name = name;
		this.addr = addr;
		this.nowAddr = nowAddr;
		this.userName = userName;
		this.carNum = carNum;
		this.time = time;
		this.sendTime = sendTime;
		this.uid = uid;
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

	public String getCarCard() {
		return carNum;
	}


	public void setCarCard(String carNum) {
		this.carNum = carNum;
	}


	public String getCarNum() {
		return carNum;
	}








	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}








	public Timestamp getTime() {
		return time;
	}








	public void setTime(Timestamp time) {
		this.time = time;
	}








	public Timestamp getSendTime() {
		return sendTime;
	}








	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}








	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
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
		builder.append("\", \"carNum\":\"");
		builder.append(carNum);
		builder.append("\", \"time\":\"");
		builder.append(time);
		builder.append("\", \"sendTime\":\"");
		builder.append(sendTime);
		builder.append("\", \"uid\":\"");
		builder.append(uid);
		builder.append("\"}");
		return builder.toString();
	}

}
