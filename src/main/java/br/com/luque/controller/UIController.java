package br.com.luque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui")
public class UIController {

	@RequestMapping("/general")
	public String general() {
		return "/ui/general";
	}

	@RequestMapping("/buttons")
	public String buttons() {
		return "/ui/buttons";
	}

	@RequestMapping("/icons")
	public String icons() {
		return "/ui/icons";
	}

	@RequestMapping("/modals")
	public String modals() {
		return "/ui/modals";
	}

	@RequestMapping("/sliders")
	public String sliders() {
		return "/ui/sliders";
	}

	@RequestMapping("/timeline")
	public String timeline() {
		return "/ui/timeline";
	}

}