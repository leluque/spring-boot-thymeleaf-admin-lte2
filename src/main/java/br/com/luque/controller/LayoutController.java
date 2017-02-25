package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController {

	@RequestMapping("/boxed")
	public String boxed() {
		return "/layout/boxed";
	}

	@RequestMapping("/collapsedSidebar")
	public String collapsedSidebar() {
		return "/layout/collapsed-sidebar-content";
	}

	@RequestMapping("/fixed")
	public String fixed() {
		return "/layout/fixed";
	}

	@RequestMapping("/topNav")
	public String topNav() {
		return "/layout/top-nav-content";
	}

}