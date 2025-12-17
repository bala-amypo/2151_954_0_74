package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private Studentservice service;
    @PostMapping("/add")
    public StudentEntity
    addStudent(@RequestBody StudentEntity student){
        return
        service.addStudent(student);
    }
    @GetMapping("/all")
    public List<StudentEntity>
    getAllStudent(){
        return service.getAllStudents();
    }
    @GetMapping("/{id}")
    publicStudentEntity
    getS
}