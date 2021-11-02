package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Log4j2
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

//    @AfterEach
//    void after(){
//        courseRepository.deleteAll();
//    }

    @Test
    public void courseSaveTest(){

        List<Student> students = new ArrayList<>();

        Course course = Course.builder()
                .name("Math")
                .students(students)
                .build();

        courseRepository.save(course);
        List<Course> courses = courseRepository.findAll();
        assertThat(courses.get(0)).isEqualToComparingFieldByFieldRecursively(course);
    }


}