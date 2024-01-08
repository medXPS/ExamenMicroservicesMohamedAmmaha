package com.microservices.courseService.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    // other fields, getters, setters
}
