package com.sqw.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqw.model.Cpy;

@Controller
@RequestMapping("/cpy")
public class CpyController {
	@RequestMapping(value="/login",method=POST)
	public void login(Cpy u,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderlist",method=POST)
	public void orderList(int pageNum,int pageSize,PrintWriter out){
		
	}
	
	@RequestMapping(value="/orderone",method=POST)
	public void orderOne(String uuid,PrintWriter out){
		
	}
	
	
	
}
