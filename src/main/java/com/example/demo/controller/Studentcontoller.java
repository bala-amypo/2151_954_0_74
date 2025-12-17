package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.StudentEntity;
import com.e
@RestController
@Request
public class StudentController {

    @Autowired
    private Studentservice service;
}