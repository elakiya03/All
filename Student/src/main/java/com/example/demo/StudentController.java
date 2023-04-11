package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private final StudentRepository studentRepository;
    
	public StudentController(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }
    
	@GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
//Subject Resource
//@RestController
//@RequestMapping("/Subject")
//public class SubjectResource {
//    private final SubjectRepository subjectRepository;
//
//    public SubjectResource(SubjectRepository subjectRepository) {
//        this.subjectRepository = subjectRepository;
//    }
//    @GetMapping
//    public List<Subject> getAllSubjects(){
//        return subjectRepository.findAll();
//    }
//}
