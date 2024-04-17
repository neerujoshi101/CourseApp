package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses ();
	
	public Course getCourses(Long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);

	
	//public Course deleteCourse(Course course);

}

