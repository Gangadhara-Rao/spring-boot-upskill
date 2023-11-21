package com.basic.springbootbasic.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.springbootbasic.demo.Course;

@RestController

public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		
		return Arrays.asList(
				new Course(1,"AWS","28minutes"),
				new Course(2,"Devops","28minutes"),
				new Course(3,"Azure","28minutes")
				);
	}

}
