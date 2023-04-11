package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@Bean
	ApplicationRunner init(UserRepository userRepository, StudentRepository studentRepository, SubjectRepository subjectRepository) {
		return (ApplicationArguments args) ->  dataSetup(userRepository,studentRepository,subjectRepository);
	}

	private void dataSetup(UserRepository userRepository, StudentRepository studentRepository, SubjectRepository subjectRepository) {
		User niraj = new User("niraj.sonawane@gmail.com", "$2a$10$yRxRYK/s8vZCp.bgmZsD/uXmHjekuPU/duM0iPZw04ddt1ID9H7kK", "Admin");
		User test = new User("test@gmail.com", "$2a$10$YWDqYU0XJwwBogVycbfPFOnzU7vsG/XvAyQlrN34G/oA1SbhRW.W.", "User");
		userRepository.save(niraj);
		userRepository.save(test);

		Student student1 = new Student(1L,"Ram");
		Student student2 = new Student(2L,"Sham");
		studentRepository.save(student1);
		studentRepository.save(student2);

		Subject math = new Subject(1l,"Math");
		Subject science = new Subject(2l,"Science");
		subjectRepository.save(math);
		subjectRepository.save(science);
	}
}
