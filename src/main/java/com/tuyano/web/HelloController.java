package com.tuyano.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("title","Helo Page");
		model.addAttribute("message","this message was made by contoroller!!");
		return "helo";
	}
}
