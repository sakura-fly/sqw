package com.sqw.dao.impl;

import javax.inject.Inject;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Component;

import com.sqw.dao.UserDao;
import com.sqw.model.User;
import com.sqw.rowmapp.UserRowMapp;
import com.sqw.util.Sql;
@Component
public class UserDaoImpl implements UserDao {

	private JdbcOperations jdbc;

	@Inject
	public UserDaoImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public User login(User u) {
		User us = null;
		try {
			us = jdbc.queryForObject(Sql.USER_LOGIN, new UserRowMapp(), u.getUserName(), u.getPwd());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

}
