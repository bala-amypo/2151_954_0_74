package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.StudentEntity;
public interface StudentEntity{
    StudentEntity addStudent(StudentEntity student);
    list<StudentEntity>getAllStudent();
    StudentEntity getStudentEntityById(long id);
    StudentEntity updateStudent(Long id,StudentEntity student);
}