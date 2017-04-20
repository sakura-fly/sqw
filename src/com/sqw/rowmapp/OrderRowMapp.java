package com.sqw.rowmapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sqw.model.Order;


public class OrderRowMapp implements RowMapper<Order>{
//int id, String uuid, String name, String addr, String userName
	@Override
	public Order mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Order(rs.getInt("id"), rs.getString("uuid"), rs.getString("name"),rs.getString("addr"),rs.getString("user_name"));
	}

}
