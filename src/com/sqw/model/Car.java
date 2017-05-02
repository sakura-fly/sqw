package com.sqw.model;

public class Car {
	private int id;
	private String carNum;
	private String type;
	
	public Car() {
	}

	public Car(int id, String carNum, String type) {
		super();
		this.id = id;
		this.carNum = carNum;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"id\":\"");
		builder.append(id);
		builder.append("\", \"carNum\":\"");
		builder.append(carNum);
		builder.append("\", \"type\":\"");
		builder.append(type);
		builder.append("\"}");
		return builder.toString();
	}
	
}
