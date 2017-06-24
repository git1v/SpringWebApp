package com.tuyano.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("title","Helo Page");
		model.addAttribute("message","this message was made by contoroller!!");
		return "helo";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String form(@RequestParam("input1")String input1, Model model){
		String res="あなたは「"+input1+"」と入力しました。";
		model.addAttribute("title", "Answer Page");
		model.addAttribute("message", res);
		return "helo";
	}
}
