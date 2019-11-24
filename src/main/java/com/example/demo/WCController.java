package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WCController {
	
	@RequestMapping("/test")	
	public String init() {
		return "Spring World";
	}
}
