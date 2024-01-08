package com.microservices.studentService.external;

import com.microservices.studentService.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "COURSE-SERVICE", url = "http://localhost:2020/course/api")
public interface CourseClient {
    @GetMapping("/byStudent/{studentId}")
     List<Course> getCoursesByStudentId(@PathVariable Long studentId);

}
