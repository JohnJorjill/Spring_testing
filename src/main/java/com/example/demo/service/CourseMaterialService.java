package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import com.example.demo.repository.CourseMaterialRepository;
import com.example.demo.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseMaterialService {

    private final CourseMaterialRepository courseMaterialRepository;

    public List<CourseMaterial> getAllCourseMaterials(){
        return courseMaterialRepository.findAll();
    }

}
