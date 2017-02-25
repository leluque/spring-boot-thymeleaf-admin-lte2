package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/table")
public class TableController {

	@RequestMapping("/data")
	public String chartjs() {
		return "/table/data";
	}

	@RequestMapping("/simple")
	public String flot() {
		return "/table/simple";
	}

}