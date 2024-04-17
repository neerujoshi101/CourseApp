package com.springrest.springrest.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	// List<Course> list;

	@Autowired(required = true)
	private CourseDao coursedao;

	public CourseServiceimpl() {

	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return (List<Course>) coursedao.findAll();
	}

	@Override
	public Course getCourses(Long courseId) {
		
		return coursedao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

		coursedao.save(course);
		
		return course;
	}

	public void deleteCourse(Long parseLong ) { 
		
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);	
	 
}
	

}
