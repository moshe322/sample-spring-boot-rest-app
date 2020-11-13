package com.devopsdemo.samplerestapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	List<Student> students  = new ArrayList<>();
	
	public DemoRestController(){
		Student student1 = new Student();
		student1.id= 1;
		student1.firstName = "abc";
		student1.lastName  = "abc-last-name";
		
		Student student2 = new Student();
		student2.id= 2;
		student2.firstName = "def";
		student2.lastName  = "def-last-name";
		
		students.add(student1);
		students.add(student2);
	}
	
	
	@RequestMapping(method = RequestMethod.GET , value = "/students" )
	public List<Student> getAllStudents() {
		return students;
		
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/students" )
	public List<Student> addStudent(@RequestBody Student student) {
		students.add(student); 
		return students;
		
	}
	
}
