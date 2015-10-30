package com.tt.in;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {	
	    
		@RequestMapping(value="/")
		public String createForm()
		{
			return "index";
		}
		@ RequestMapping(value="/hello",method=RequestMethod.POST)
		public ModelAndView helloWorld(@RequestParam("uname") String name,@RequestParam("upass") String pass,HttpServletRequest req,HttpServletResponse res)
		{			
			if(pass.equals("welcome")){			
				String message="hello" + " " +name;
				return new  ModelAndView("hellopage","msg",message);	
			}
			else
			{
				return new  ModelAndView("errorpage","msg","sorry username and password is incorrect");
			}
			
		}
		
	}



