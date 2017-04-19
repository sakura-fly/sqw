package com.sqw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqw.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/login",method=POST)
	public void login(User u,PrintWriter out){
		
	}
	
}
