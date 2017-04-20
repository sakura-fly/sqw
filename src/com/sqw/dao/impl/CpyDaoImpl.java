package com.sqw.dao.impl;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;

import com.sqw.dao.CpyDao;
import com.sqw.model.Cpy;
import com.sqw.rowmapp.CpyRowMapp;
import com.sqw.util.Sql;

public class CpyDaoImpl implements CpyDao{
	
	
private JdbcOperations jdbc;
	
	@Inject
	public CpyDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Cpy login(Cpy c) {
		return jdbc.queryForObject(Sql.CPY_LOGIN, new CpyRowMapp(),c.getUserName(),c.getPwd());
	}

}
