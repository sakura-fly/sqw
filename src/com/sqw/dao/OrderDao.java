package com.sqw.dao;

import java.util.List;

import com.sqw.model.Order;

public interface OrderDao {
	public List<Order> list(int skip,int limit);
	public Order findByUUID(String uuid);
	public int addOrder(Order o);
	public int orderAddrNow(String uuid,String nowAddr);
	public List<Order> listByUserName(int skip,int limit,String userName);
	public int updateWl(String uuid,String addr);
}
