package com.sqw.util;

public class Sql {
	public static final String ADMIN_LOGIN= "select * from admin where user_name=? and pwd=?";
	public static final String USER_LOGIN= "select * from user where user_name=? and pwd=?";
	public static final String CPY_LOGIN= "select * from cpy where user_name=? and pwd=?";
	public static final String ORDER_LIST = "select * from order limit ?,?";
	public static final String ORDER_FIND_BY_UUID = "select * from order where uuid=?";
	public static final String ORDER_ADD = "insert into order (uuid,user_name,addr,name) values (?,?,?,?)";
}
