package com.sqw.dao;

import com.sqw.model.User;

public interface UserDao {
	public User login(User u);
	public int add(User u);
}
