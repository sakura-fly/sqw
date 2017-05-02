package com.sqw.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.PrintWriter;
import java.util.UUID;

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

	@Autowired
	UserDao ud;
	@Autowired
	OrderDao od;

	@RequestMapping(value = "/login", method = POST)
	public void login(User u, PrintWriter out) {
		u = ud.login(u);
		if (u != null) {
			out.print(DefRes.dr(1, "ok"));
		} else {
			out.print(DefRes.dr(-1, "no"));
		}
	}

	@RequestMapping(value = "/orderlist", method = POST)
	public void orderList(@RequestParam(defaultValue = "1") int pageNum,
			@RequestParam(defaultValue = "10") int pageSize, PrintWriter out) {
		out.print(od.list((pageNum - 1) * pageSize, pageSize));
	}

	@RequestMapping(value = "/orderadd", method = POST)
	public void addOrder(Order o, PrintWriter out) {

		o.setUuid(UUID.randomUUID().toString().replace("-", "").toUpperCase());
		int res = od.addOrder(o);
		if (res > 0) {
			out.print(DefRes.dr(1, o.getUuid()));
		} else {
			out.print(DefRes.dr(-1, "err"));
		}
	}

	@RequestMapping(value = "/orderone", method = POST)
	public void orderOne(String uuid, PrintWriter out) {
		out.print(od.findByUUID(uuid));
	}

	@RequestMapping(value = "/regist", method = POST)
	public void regist(User u, PrintWriter out) {
		int res = ud.add(u);
		if (res > 0) {
			out.print(DefRes.dr(1, "" + res));
		} else {
			out.print(DefRes.dr(-1, "err=" + res));
		}
	}

	@RequestMapping(value = "/hisorderlist", method = POST)
	public void hisorderList(@RequestParam(defaultValue = "1") int pageNum,
			@RequestParam(defaultValue = "10") int pageSize, String userName, PrintWriter out) {
		out.print(od.listByUserName((pageNum - 1) * pageSize, pageSize, userName));
	}

}
