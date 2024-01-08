package com.microservices.courseService.controller;

import com.microservices.courseService.entity.Course;
import com.microservices.courseService.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course/api")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/byStudent/{studentId}")
    public List<Course> getCoursesByStudentId(@PathVariable Long studentId) {
    return courseService.getCoursesByStudentId(studentId);

    }


}
