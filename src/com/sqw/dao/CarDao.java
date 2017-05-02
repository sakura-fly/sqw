package com.sqw.dao;

import java.util.List;

import com.sqw.model.Car;

public interface CarDao {
	public int add(Car c);

	public List<Car> list(int skip, int limit);

	public List<Car> list(int skip, int limit, String query);

//	public
}
