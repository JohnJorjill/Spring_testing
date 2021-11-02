package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
     List<Student> findByFirstName(String firstName);

     @Query("select s from Student s where s.emailId=?1")
     Student findStudentByEmailId(String emailId);

     @Modifying
     @Transactional
     @Query(
             value = "update tbl_student set first_name =?1 where email_id= ?2",
             nativeQuery = true
     )
     int updateStudentNameByEmailId(String firstName, String emailId);
}
