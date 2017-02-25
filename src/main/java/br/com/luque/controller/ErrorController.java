package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

	@RequestMapping("/404")
	public String error404() {
		return "/error/404";
	}
	
	@RequestMapping("/500")
	public String error500() {
		return "/error/500";
	}
	
}