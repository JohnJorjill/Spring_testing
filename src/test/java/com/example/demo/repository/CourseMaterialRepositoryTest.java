package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void addCourseMaterials(){

        Course course = Course.builder()
                .name("Phy")
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .courseMaterialName("Phy 1")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

}