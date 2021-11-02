package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name="tbl_student"
)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String firstName;
    private String lastName;
    private String emailId;

    @Embedded
    private Guardian guardian;

    @ManyToMany(
            mappedBy = "students",
            cascade = CascadeType.ALL
    )
    private List<Course> courses;
}
