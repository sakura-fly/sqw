package com.sqw.dao.impl;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;

import com.sqw.dao.AdminDao;
import com.sqw.model.Admin;
import com.sqw.rowmapp.AdminRowMapp;
import com.sqw.util.Sql;

@Component
public class AdminDaoImpl implements AdminDao {

	private JdbcOperations jdbc;

	@Inject
	public AdminDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Admin login(Admin a) {
		return jdbc.queryForObject(Sql.ADMIN_LOGIN, new AdminRowMapp(), a.getUserName(), a.getPwd());
	}

}
