package com.sqw.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.resfmt.DefRes;
import com.sqw.dao.AdminDao;
import com.sqw.dao.OrderDao;
import com.sqw.model.Admin;
import com.sqw.model.Order;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminDao ad;
	@Autowired
	OrderDao od;

	@RequestMapping(value = "/login", method = POST)
	public void login(Admin u, PrintWriter out) {
		try {
			u = ad.login(u);
			System.out.println(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (u != null) {
			out.print(DefRes.dr(1, "ok"));
		} else {
			out.print(DefRes.dr(-1, "err"));
		}

	}

	@RequestMapping(value = "/orderlist", method = POST)
	public void orderList(int pageNum, int pageSize, PrintWriter out) {
		out.print(od.list((pageNum - 1) * pageSize, pageSize));
	}

	@RequestMapping(value = "/orderone", method = POST)
	public void orderOne(String uuid, PrintWriter out) {
		out.print(od.findByUUID(uuid));
	}

	@RequestMapping(value = "/orderadd", method = POST)
	public void addOrder(Order o, PrintWriter out) {
		o.setUuid(UUID.randomUUID().toString().replace("-", "").toUpperCase());
		int res = od.addOrder(o);
		if(res > 0){
			out.print(DefRes.dr(1, o.getUuid()));
		} else {
			out.print(DefRes.dr(-1, "err"));
		}
	}

}
