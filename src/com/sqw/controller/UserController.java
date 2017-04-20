package com.sqw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sqw.model.Order;
import com.sqw.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/login",method=POST)
	public void login(User u,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderlist",method=POST)
	public void orderList(@RequestParam(defaultValue = "1") int pageNum ,@RequestParam(defaultValue = "10")int pageSize,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderadd",method=POST)
	public void addOrder(Order o,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderone",method=POST)
	public void orderOne(String uuid,PrintWriter out){
		
	}
	
}
