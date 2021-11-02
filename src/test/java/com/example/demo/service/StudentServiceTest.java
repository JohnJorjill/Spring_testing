package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
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
class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    @Test
    public void getAllStudentsTest(){
        List<Student> students = new ArrayList<>();
        Student student = Student.builder()
                .firstName("Jake")
                .build();
        students.add(student);
        given(studentRepository.findAll()).willReturn(students);
        List<Student> expected = studentService.getAllStudents();
        assertEquals(students,expected);

    }

}