package com.sqw.dao;

import java.util.ArrayList;

import com.sqw.model.Logistics;
import com.sqw.model.Order;
import com.sqw.model.Report;

public interface LogisticsDao {
	public Logistics login(Logistics l);
	
	public ArrayList<Logistics> orderList();
	
	public int accepetOrder(Order o);
	
	public Report generateReport(Order o);
}
