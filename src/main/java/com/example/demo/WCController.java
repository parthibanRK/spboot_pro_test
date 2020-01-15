package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/project")
public class WCController {
	
	@GetMapping("/init")	
	public String init() {
		return "Spring World";
	}
}
