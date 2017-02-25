package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart")
public class ChartController {

	@RequestMapping("/chartjs")
	public String chartjs() {
		return "/chart/chartjs";
	}

	@RequestMapping("/flot")
	public String flot() {
		return "/chart/flot";
	}

	@RequestMapping("/inline")
	public String inline() {
		return "/chart/inline";
	}

	@RequestMapping("/morris")
	public String morris() {
		return "/chart/morris";
	}

}