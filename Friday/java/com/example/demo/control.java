package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class control {
	
	@GetMapping("/")
	public String h() {
		System.out.println("Hello");
		return "hello";
	}
	
	@RequestMapping("/courses")
	public String courses() {
		System.out.println("E_l_a_k_i_y_a");
		return "course.jsp";
	}

}
