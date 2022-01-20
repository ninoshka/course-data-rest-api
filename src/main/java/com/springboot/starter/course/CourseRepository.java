package com.springboot.starter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, String>{
	
	//findByProperty --> Spring data JPA gives implementation
	public List<Course> findByName(String name);
	
	//looking for courses with a particular topic id
	public List<Course> findByTopicId(String name);
}
