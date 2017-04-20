package com.sqw.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqw.model.Admin;
import com.sqw.model.Order;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping(value="/login",method=POST)
	public void login(Admin u,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderlist",method=POST)
	public void orderList(int pageNum,int pageSize,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderone",method=POST)
	public void orderOne(String uuid,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderadd",method=POST)
	public void addOrder(Order o,PrintWriter out){
		
	}
	
}
