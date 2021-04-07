package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rcb")
public class HiController {
	
	@RequestMapping("/escn")
	public ModelAndView ipl2021()
	{
		ModelAndView m1 = new ModelAndView();
		m1.setViewName("AdmissionForm");
		return m1;
	}

}
