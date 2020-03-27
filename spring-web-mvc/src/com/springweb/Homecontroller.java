package com.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	 @GetMapping("/")
	public String show()
	{
		return "main-menu";
	}

}
