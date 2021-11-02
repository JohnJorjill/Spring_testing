package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    @Test
    public void getAllCoursesTest(){
        List<Course> courses = new ArrayList<>();
        Course course = Course.builder()
                .name("PE")
                .build();
        courses.add(course);
        given(courseRepository.findAll()).willReturn(courses);
        List<Course> expected = courseService.getAllCourses();
        assertEquals(courses,expected);
    }

}