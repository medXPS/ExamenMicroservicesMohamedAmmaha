package com.microservices.studentService.service;

import com.microservices.studentService.entity.Course;
import com.microservices.studentService.external.CourseClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private CourseClient courseClient;
    @Override
    public List<Course> getCoursesByStudentId(Long id) {
        return courseClient.getCoursesByStudentId(id);
    }

}
