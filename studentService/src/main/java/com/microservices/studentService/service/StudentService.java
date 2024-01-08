package com.microservices.studentService.service;

import com.microservices.studentService.entity.Course;

import java.util.List;

public interface StudentService {
//  get course by student Id
List<Course> getCoursesByStudentId(Long id);


}
