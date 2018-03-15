package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class helloword {
	
	
	@RequestMapping("/test")
	public ModelAndView test() 
	{
		ModelAndView model=new ModelAndView("testing");
		
		model.addObject("msg", "welcome to the srping testing");
		return model;
		
	}
	
	
	@RequestMapping(value="/login.html",method=RequestMethod.GET)
	public ModelAndView login_test() 
	{
		ModelAndView model=new ModelAndView("login");
		return model;
		
	}
	
	@RequestMapping(value="/home.html", method=RequestMethod.POST)
	public ModelAndView login_test(@RequestParam("username")String usernamer,@RequestParam("password")String passwordr)
	{
		ModelAndView model=new ModelAndView("index");
		model.addObject("form_details", "your enyered username was : " + usernamer + "\n your entered password was : "+passwordr);
		return model;
		
	}
	
	
	@RequestMapping("/login/{username}/{password}")
	public ModelAndView login(@PathVariable("username") String username_r,@PathVariable("password")String password_r) 
	{
		
		ModelAndView model=new ModelAndView("path_variable_test");
		
		model.addObject("login_test", "yuor login crceadentials are : \n "+"username is : " +username_r +"password is : " +password_r);
		
		return model;
		
	}
	
	@RequestMapping(value="/login_1.html",method=RequestMethod.GET)
	public ModelAndView html_request_param_get() 
	{
		
		ModelAndView model=new ModelAndView("login_html_request");
		return model;
		
	}
	
	@RequestMapping(value="/home_1.html",method=RequestMethod.POST)
	public ModelAndView html_request_param_post(@RequestParam("user") String username_r, @RequestParam("pass") String password_r)
	{
		
		ModelAndView model=new ModelAndView("home_html_request");
		model.addObject("user_login_details", "Username : \n"+ username_r + "Password : " +password_r );
		return model;
		
	}
	
	
	@RequestMapping(value="/login_2.html",method=RequestMethod.GET)
	public ModelAndView login_model()
	{
		ModelAndView model=new ModelAndView("login_model_login");
		return model;
		
	}
	
	@RequestMapping(value="/home1.html",method=RequestMethod.POST)
	public ModelAndView submit_login_model(@RequestParam("user")String username_r,@RequestParam("pass")String password_r)
	{
		login test=new login();
		test.setUser(username_r);
		test.setPass(password_r);
		
		
		ModelAndView model=new ModelAndView("login_model_submit");
		model.addObject("login_model", test);
		return model;
		
		
		
	}
	
	

}
