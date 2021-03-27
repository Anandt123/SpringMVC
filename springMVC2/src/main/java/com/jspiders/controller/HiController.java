package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hiController")
public class HiController {
	
	@RequestMapping("welcome1")
	public ModelAndView hiworld1()
	{
		ModelAndView modelandview = new ModelAndView("HiPage");
		modelandview.addObject("msg", "This message is from byebye1 of HiController");
		modelandview.addObject("message", "Message1 successFully printed");
		return modelandview;
	}
	@RequestMapping("byebye2")
	public ModelAndView hiworld2()
	{
		ModelAndView modelandview = new ModelAndView("HiPage");
		modelandview.addObject("msg", "This message is from byebye2 of HiController");
		modelandview.addObject("message", "Message2 successFully printed");
		return modelandview;
	}
}
