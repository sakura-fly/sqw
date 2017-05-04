package com.sqw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcOperations;

import com.sqw.dao.CarDao;
import com.sqw.model.Car;
import com.sqw.rowmapp.CarRowMapp;
import com.sqw.util.Sql;

public class CaoDaoImpl implements CarDao {

	private JdbcOperations jdbc;

	@Inject
	public CaoDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public int add(Car c) {
		int res = -1;
		try {
			res = jdbc.update(Sql.CAR_ADD, c.getCarNum(), c.getType());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Car> list(int skip, int limit) {
		List<Car> res = new ArrayList<Car>();
		jdbc.query(Sql.CAR_LIST, new Object[] { skip, limit }, new CarRowMapp());
		return res;
	}

	@Override
	public List<Car> list(int skip, int limit, String query) {
		
		return null;
	}

}
