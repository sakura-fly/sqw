package com.sqw.rowmapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sqw.model.User;

public class UserRowMapp implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		return new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("pwd"));
	}

}
