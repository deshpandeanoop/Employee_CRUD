package com.anoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
@RequestMapping(value="/pajeet")	
public String say(Model model)
{
	model.addAttribute("anoop", "Hello Deshpande");
	return "hello";
}
}
