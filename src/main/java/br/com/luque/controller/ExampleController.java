package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

	@RequestMapping("/blank")
	public String blank() {
		return "/example/blank";
	}

	@RequestMapping("/invoice")
	public String invoice() {
		return "/example/invoice";
	}

	@RequestMapping("/invoicePrint")
	public String invoicePrint() {
		return "/example/invoice-print";
	}

	@RequestMapping("/lockscreen")
	public String lockscreen() {
		return "/example/lockscreen";
	}

	@RequestMapping("/login")
	public String login() {
		return "/example/login";
	}

	@RequestMapping("/pace")
	public String pace() {
		return "/example/pace";
	}

	@RequestMapping("/profile")
	public String profile() {
		return "/example/profile";
	}

	@RequestMapping("/register")
	public String register() {
		return "/example/register";
	}

}