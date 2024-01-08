package com.microservices.courseService.service;

import com.microservices.courseService.entity.Course;

import java.util.List;

public interface CourseService {
   List<Course> getCoursesByStudentId(Long id);
}
