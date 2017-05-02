package com.sqw.rowmapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sqw.model.Car;

public class CarRowMapp implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Car(rs.getInt("id"), rs.getString("car_num"), rs.getString("type"));
	}

}
