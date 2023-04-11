package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbConnectionApplication {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbConnectionApplication.class, args);
	}
	
	
	
	//@Override
	public void run(String[] args) throws Exception{
		String sql = "Insert Into employees(id,email_id,first_name, last_name) values(?,?,?,?) ";
		int result = jdbcTemplate.update(sql, "3" ,"viratkohli@gmail.com","Virat", "Kohli");
		
		if(result > 0) {
			System.out.println("Inserted Successfully");
		}
	}
}
