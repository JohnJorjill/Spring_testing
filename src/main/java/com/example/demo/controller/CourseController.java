package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/course")
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/courselist")
    public ResponseEntity<List<Course>> saveCourses(@RequestBody List<Course> courses){
        List<Course> clist = courseService.addCourses(courses);
        return ResponseEntity.status(HttpStatus.OK).body(clist);
    }

    @PostMapping("/onecourse")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.addCourse(course));
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAllCourses());
    }

}
