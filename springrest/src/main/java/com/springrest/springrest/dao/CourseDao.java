package com.springrest.springrest.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springrest.springrest.entities.Course;


public interface CourseDao extends CrudRepository <Course , Long > {

	Course getOne(Long courseId);


}
