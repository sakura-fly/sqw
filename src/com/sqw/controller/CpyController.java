package com.sqw.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.resfmt.DefRes;
import com.sqw.dao.CpyDao;
import com.sqw.dao.OrderDao;
import com.sqw.model.Cpy;

@Controller
@RequestMapping("/cpy")
public class CpyController {

	@Autowired
	CpyDao cd;
	@Autowired
	OrderDao od;

	@RequestMapping(value = "/login", method = POST)
	public void login(Cpy u, PrintWriter out) {
		u = cd.login(u);
		if(u != null){
			out.print(DefRes.dr(1, "ok"));
		} else {
			out.print(DefRes.dr(-1, "no"));
		}
	}

	@RequestMapping(value = "/orderlist", method = POST)
	public void orderList(int pageNum, int pageSize, PrintWriter out) {
		out.print(od.list((pageNum - 1) * pageSize, pageSize));
	}

	@RequestMapping(value="/orderone",method=POST)
	public void orderOne(String uuid,PrintWriter out){
		out.print(od.findByUUID(uuid));
	}

	@RequestMapping(value="/orderaddrnow",method=POST)
	public void orderAddrNow(String uuid,String now_addr , PrintWriter out){
		int r = od.orderAddrNow(uuid, now_addr);
		if(r > 0){
			r = od.updateWl(uuid, now_addr);
			out.print(r);
		} else {
			out.print(r);
		}
		
	}
	
	
}
