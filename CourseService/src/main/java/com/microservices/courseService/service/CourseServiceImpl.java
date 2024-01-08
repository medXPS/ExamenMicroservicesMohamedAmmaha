package com.microservices.courseService.service;

import com.microservices.courseService.entity.Course;
import com.microservices.courseService.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getCoursesByStudentId(Long id) {
        return courseRepository.findByStudents_Id(id);
    }
}
