package com.jspider.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;

@Controller
public class HelloController {
	@RequestMapping("/login")
	public ModelAndView helloworld() {
		
		ModelAndView mav=new ModelAndView("LoginPage");
		return mav;
	}
	public HashMap getcred()
	{
		HashMap<String,String> cred = new HashMap<>();
		cred.put("Anand","Anand@123");
		cred.put("sanjay","sanjay@123");
		return cred;
	}
	
	@RequestMapping(value="/verify",method=RequestMethod.POST)	
	public ModelAndView verify(@RequestParam("ID")String id,@RequestParam("password")String pwd) 
	{
		HashMap h1=getcred();
		if(h1.containsKey(id))
		{
			if(h1.get(id).equals(pwd))
			{
				ModelAndView mav=new ModelAndView("loginSuccess");
				return mav;
			}
		}
		else
		{
			ModelAndView mav=new ModelAndView("LoginUnsuccess");
			return mav;
		}
		ModelAndView mav=new ModelAndView("LoginUnsuccess");
		return mav;
	}
	@RequestMapping(value="/details")
	public ModelAndView details()
	{
		ModelAndView mav=new ModelAndView("Details");
		return mav;
	}
}


