package com.microservices.courseService.repository;

import com.microservices.courseService.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {

    List<Course> findByStudents_Id(Long id);
}
