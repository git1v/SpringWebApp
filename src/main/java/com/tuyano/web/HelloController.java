package com.tuyano.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("message")
public class HelloController {
	
	@ModelAttribute("message")
	String message(){
		return "this is default messgage";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(@ModelAttribute("message")String msg, Model model){
		System.out.println("@ModelAttribute(\"message\"): "+msg);
		model.addAttribute("title","Helo Page");
		return "helo";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String form(@RequestParam("input1")String input1,
			@ModelAttribute("message")String msg, Model model){
		System.out.println("@ModelAttribute(\"message\"): "+msg);
		String res="あなたは「"+input1+"」と入力しました。";
		model.addAttribute("title", "Answer Page");
		model.addAttribute("message", res);
		return "helo";
	}
}
