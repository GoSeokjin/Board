package com.main.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/" ,method=RequestMethod.GET)
	public String mainPage()throws Exception{
		return "mainLoginLayout";
	}
}
