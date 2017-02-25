package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping("/advanced")
	public String advanced() {
		return "/forms/advanced";
	}

	@RequestMapping("/editors")
	public String editors() {
		return "/forms/editors";
	}

	@RequestMapping("/general")
	public String general() {
		return "/forms/general";
	}

}