package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/email")
public class EmailController {

	@RequestMapping("/compose")
	public String compose() {
		return "/mailbox/compose";
	}

	@RequestMapping("/mailbox")
	public String mailbox() {
		return "/mailbox/mailbox";
	}

	@RequestMapping("/readMail")
	public String readMail() {
		return "/mailbox/read-mail";
	}

}