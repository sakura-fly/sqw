package com.sqw.rowmapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sqw.model.Admin;

public class AdminRowMapp implements RowMapper<Admin>{

	@Override
	public Admin mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Admin(rs.getInt("id"), rs.getString("user_name"), rs.getString("pwd"));
	}

}
