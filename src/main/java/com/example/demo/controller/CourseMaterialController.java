package com.example.demo.controller;

import com.example.demo.entity.CourseMaterial;
import com.example.demo.service.CourseMaterialService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/coursematerial")
public class CourseMaterialController {

    private final CourseMaterialService courseMaterialService;

    @GetMapping
    public ResponseEntity<List<CourseMaterial>> getAllCourseMaterials(){
        return ResponseEntity.status(HttpStatus.OK).body(courseMaterialService.getAllCourseMaterials());
    }

}
