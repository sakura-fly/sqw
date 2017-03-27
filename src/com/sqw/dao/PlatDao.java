package com.sqw.dao;

import java.util.ArrayList;

import com.sqw.model.Order;
import com.sqw.model.Plat;
import com.sqw.model.Report;

public interface PlatDao {
	public Plat login(Plat plat);

	public int entryOrder(Order o);

	public ArrayList<Order> queryOrder();

	public Order queryOrderOne(Order o);

	public String report(Report report);
}
