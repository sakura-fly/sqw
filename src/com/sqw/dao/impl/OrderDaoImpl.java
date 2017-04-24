package com.sqw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;

import com.sqw.dao.OrderDao;
import com.sqw.model.Order;
import com.sqw.rowmapp.OrderRowMapp;
import com.sqw.util.Sql;
@Component
public class OrderDaoImpl implements OrderDao {

	private JdbcOperations jdbc;

	@Inject
	public OrderDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<Order> list(int skip, int limit) {
		List<Order> res = new ArrayList<Order>();
		try {
			jdbc.query(Sql.ORDER_LIST, new Object[]{} , new OrderRowMapp());	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public Order findByUUID(String uuid) {
		return jdbc.queryForObject(Sql.ORDER_FIND_BY_UUID, new OrderRowMapp(),uuid);
	}

	@Override
	public int addOrder(Order o) {
		int r = 1;
		try {
			jdbc.update(Sql.ORDER_ADD,o.getUuid(),o.getUserName(),o.getAddr(),o.getName());
		} catch (Exception e) {
			e.printStackTrace();
			r = -1;
		}
		return r;
	}

}
