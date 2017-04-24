package com.sqw.dao.impl;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;

import com.sqw.dao.CpyDao;
import com.sqw.model.Cpy;
import com.sqw.rowmapp.CpyRowMapp;
import com.sqw.util.Sql;
@Component
public class CpyDaoImpl implements CpyDao{
	
	
private JdbcOperations jdbc;
	
	@Inject
	public CpyDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Cpy login(Cpy c) {
		Cpy  cpy = null;
		try {
			cpy =  jdbc.queryForObject(Sql.CPY_LOGIN, new CpyRowMapp(),c.getUserName(),c.getPwd());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return cpy;
	}

}
