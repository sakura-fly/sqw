package com.sqw.util;

public class Sql {
	public static final String ADMIN_LOGIN = "select * from admin where user_name=? and pwd=?";
	public static final String USER_LOGIN = "select * from user where user_name=? and pwd=?";
	public static final String CPY_LOGIN = "select * from cpy where user_name=? and pwd=?";
	public static final String ORDER_LIST = "select * from orders limit ?,?";
	public static final String ORDER_LIST_BY_USER_NAME = "select * from orders where user_name = ? limit ?,? ";
	public static final String ORDER_FIND_BY_UUID = "select * from orders where uuid=?";
	public static final String ORDER_ADD = "insert into orders (uuid,user_name,addr,name) values (?,?,?,?)";
	public static final String ORDER_ADDR_NOW = "update orders set addr_now = ? where uuid=?";
	public static final String USER_ADD = "insert into user (user_name,pwd) values (?,?)";
	public static final String CAR_ADD = "insert into car (car_num,type) values (?,?)";
	public static final String CAR_LIST = "select * from car limit ?,?";
}
