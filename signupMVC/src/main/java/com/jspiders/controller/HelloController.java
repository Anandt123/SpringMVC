package com.jspiders.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	HashMap<String,String> cred = new HashMap<>();
	@RequestMapping(value="login")
	public ModelAndView helloworld() 
	{	
		ModelAndView mav=new ModelAndView("Login");
		return mav;
	}
	@RequestMapping(value="/validate")
	public ModelAndView submitAdmissionForm(@RequestParam("name")String name,@RequestParam("Password")String Password) 
	{	
		if(cred.containsKey(name))
		{
			if(cred.get(name).equals(Password))
			{
				ModelAndView mav1=new ModelAndView("LoginSuccessfull");
				return mav1;
			}
			else
			{
				ModelAndView mav2=new ModelAndView("LoginUnsuccess");
				return mav2;
			}
		}
		else
		{
			ModelAndView mav3=new ModelAndView("LoginUnsuccess");
			return mav3;
		}
		
	}
	@RequestMapping(value="/signuppage")
	public ModelAndView helloworld5() 
	{	
		ModelAndView mav=new ModelAndView("Signup");
		return mav;
	}
	@RequestMapping(value="/signupsuccessfull")
	public ModelAndView insert(@RequestParam("name1")String name1,@RequestParam("Password1")String Password1) 
	{	
		cred.put(name1,Password1);
		ModelAndView mav=new ModelAndView("Back");
		return mav;
	}
	@RequestMapping(value="/printdetails")
	public ModelAndView details() 
	{
		ModelAndView mav=new ModelAndView("Details");
		return mav;
	}

}