package com.lti.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Test")
public class TestController {

	@ResponseBody
	@RequestMapping("/showmsg")
	public String showMsg() {
		return "Hello.....";
		
	}
	
	@RequestMapping(value="/StudentForm",method=RequestMethod.GET)
	public  ModelAndView getForm()
	{		
		ModelAndView model= new ModelAndView("StudentForm");		
		return model;
	}
	
	@RequestMapping(value="/SubmitForm",method=RequestMethod.POST)
	public  ModelAndView submitForm(@RequestParam("stuName") String sname,@RequestParam("subject") String sub )
	{
		System.out.println(sname + " " +sub);
		
		ModelAndView model= new ModelAndView("SubmitForm");
		model.addObject("message",  " name :" +sname+ " sub" +sub  + ""); 
		
		return model;
	}
}
