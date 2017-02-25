package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@RequestMapping("/1")
	public String dashboard1() {
		return "/dashboard/dashboard1";
	}
	
	@RequestMapping("/2")
	public String dashboard2() {
		return "/dashboard/dashboard2";
	}
	
}