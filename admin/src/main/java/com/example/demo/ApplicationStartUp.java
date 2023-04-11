package com.example.demo;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class ApplicationStartUp {
	
	@Autowired
	private AdminRepo repo;
	
	@Autowired
	private StartupProperties prop;
	
	@Bean
	public CommandLineRunner loadData() {
		return (args) -> {
			List<Adminuser> admins = repo.findAll();
			
			if(ObjectUtils.isEmpty(admins)) {
				this.repo.save(Adminuser.builder()
						.username(prop.getUsername())
						.password(BCrypt.hashpw(prop.getPassword(), BCrypt.gensalt()))
						.roles(Arrays.asList("ADMIN"))
						.status(prop.getStatus())
						.build());
			}
		};
	}
}
