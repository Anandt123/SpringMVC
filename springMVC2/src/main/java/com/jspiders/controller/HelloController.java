package com.jspiders.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("helloController")
public class HelloController{
	
	@RequestMapping("welcome1")
	public ModelAndView helloworld1()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "This message is from Welcome1 of HelloController");
		modelandview.addObject("message", "Message1 successFully printed");
		return modelandview;
	}
	@RequestMapping("welcome2")
	public ModelAndView helloworld2()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "This message is from Welcome2 of HelloController");
		modelandview.addObject("message", "Message2 successFully printed");
		return modelandview;
	}
	
	
	
}
