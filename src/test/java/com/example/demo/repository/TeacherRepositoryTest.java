package com.example.demo.repository;

import com.example.demo.entity.Teacher;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @AfterEach
    void after(){
        teacherRepository.deleteAll();
    }

    @Test
    public void addTeacherTest(){
        Teacher teacher = Teacher.builder()
                .teacherName("Karl")
                .build();

        teacherRepository.save(teacher);
        List<Teacher> teachers = teacherRepository.findAll();
        assertThat(teachers.get(0)).isEqualTo(teacher);
    }

}