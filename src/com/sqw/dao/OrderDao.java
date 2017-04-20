package com.sqw.dao;

import java.util.List;

import com.sqw.model.Order;

public interface OrderDao {
	public List<Order> list(int skip,int limit);
	public Order findByUUID(String uuid);
}
