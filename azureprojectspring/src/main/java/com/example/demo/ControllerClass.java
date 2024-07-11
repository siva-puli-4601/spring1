package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class ControllerClass {
	 @GetMapping("/search")
	    public String search()
	    {
	    	System.out.println("hai");
	    	return "hello mcity here sivareddy";
	    }
}
