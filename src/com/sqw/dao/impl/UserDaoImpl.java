package com.sqw.dao.impl;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcOperations;

import com.sqw.dao.UserDao;
import com.sqw.model.User;
import com.sqw.rowmapp.UserRowMapp;
import com.sqw.util.Sql;

public class UserDaoImpl implements UserDao {

	private JdbcOperations jdbc;

	@Inject
	public UserDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public User login(User u) {
		return jdbc.queryForObject(Sql.USER_LOGIN, new UserRowMapp(), u.getUserName(), u.getPwd());
	}

}
