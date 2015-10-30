package com.java4s.in;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 

@Controller
public class Java4sController {
	
	@RequestMapping( "/")
	public String createForm()
	{
		return "index";
	}
 
 		
@RequestMapping(value="/hello", method=RequestMethod.POST)
public ModelAndView helloWorld() {
 
   String message =  "Welcome to Java4s.com Spring MVC 3.2.x Sessions";
   message += "<br>You Did it....!";
 
   return new ModelAndView("welcomePage", "welcomeMessage", message);
}//ModelAndView closed
 
}


