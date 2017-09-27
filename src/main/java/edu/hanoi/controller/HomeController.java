package edu.hanoi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
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
		mv.addObject("message", "Hello Java Clazz");
		return mv;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		System.out.println("----- login");
		ModelAndView mv = new ModelAndView("login");
//		mv.addObject("message", "Hello Hanoi Java Clazz After somthing happen");
		return mv;
	}
	
	@RequestMapping(value="/nguoi-dung")
	public ModelAndView forUser() {
		System.out.println("----- for user");
		ModelAndView mv = new ModelAndView("index");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		mv.addObject("message", "Hi, " + authentication.getName());
		return mv;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("--- logout");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication != null) {
			System.out.println("-------------- authetication != null is true");
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		return "redirect:/";
	}
}
