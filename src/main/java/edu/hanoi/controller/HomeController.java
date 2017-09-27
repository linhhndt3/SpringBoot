package edu.hanoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping(value="/")
//	public @ResponseBody String sayHello() {
//		System.out.println("inside say hello target");
//		return "Hello World";	
//	}
	
	@RequestMapping(value="/")
	public ModelAndView sayHello() {
		System.out.println("----- hello hanoi dava clazz");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "Hello Hanoi Java Clazz After somthing happen");
		return mv;
	}
}
