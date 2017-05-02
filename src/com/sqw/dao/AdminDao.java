package com.sqw.dao;

import com.sqw.model.Admin;

public interface AdminDao {
	public Admin login(Admin a);
	public int add(Admin a);
}
