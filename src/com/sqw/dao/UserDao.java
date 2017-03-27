package com.sqw.dao;

import com.sqw.model.Order;
import com.sqw.model.Report;
import com.sqw.model.User;

public interface UserDao {
	public User login(User u);

	public int enterOrder(Order o);
	
	public Order qoertOrder(int id);
	
	public Report generateReport(Order o);
}
