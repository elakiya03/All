package com.java.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@RequestMapping("/")
	public String hello() {
		return "Elakiya its displaying";
	}

}
