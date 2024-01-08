package com.microservices.studentService.controller;
import com.microservices.studentService.entity.Course;
import com.microservices.studentService.service.StudentService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/getCoursesByStudentId/{id}")
    List<Course> getCoursesByStudentId(@PathVariable Long id ){
        return studentService.getCoursesByStudentId(id);
    }

}
