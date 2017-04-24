package com.sqw.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.resfmt.DefRes;
import com.sqw.dao.OrderDao;
import com.sqw.dao.UserDao;
import com.sqw.model.Order;
import com.sqw.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired UserDao ud;
	@Autowired OrderDao od;
	
	
	@RequestMapping(value="/login",method=POST)
	public void login(User u,PrintWriter out){
		u = ud.login(u);
		if(u != null){
			DefRes.dr(1, "ok");
		} else {
			DefRes.dr(-1, "no");
		}
	}
	
	@RequestMapping(value="/orderlist",method=POST)
	public void orderList(@RequestParam(defaultValue = "1") int pageNum ,@RequestParam(defaultValue = "10")int pageSize,PrintWriter out){
		out.print(od.list((pageNum - 1) * pageSize, pageSize));
	}
	
	@RequestMapping(value="/orderadd",method=POST)
	public void addOrder(Order o,PrintWriter out){
		
		out.print(od.addOrder(o));
	}
	
	@RequestMapping(value="/orderone",method=POST)
	public void orderOne(String uuid,PrintWriter out){
		out.print(od.findByUUID(uuid));
	}
	
}
