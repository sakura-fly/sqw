package com.sqw.rowmapp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sqw.model.Cpy;

public class CpyRowMapp implements RowMapper<Cpy> {

	@Override
	public Cpy mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Cpy(rs.getInt("id"), rs.getString("user_name"), rs.getString("pwd"));
	}

}
