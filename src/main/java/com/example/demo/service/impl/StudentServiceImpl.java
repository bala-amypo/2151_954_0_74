package com.example.demo.service.impl;
import java.util.*;
import org.springframework.sterotype.service;
import com.example.demo.entity.Student;
@service
public class StudentServiuceImpl implements StudentService{
    private final Map<Long,Student>store=new HashMap<>();
    private Long counter=1;
    @Override
    public Student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st);
        return st;
    }
    @Override
    public Lisr<Student>getA<llStudent(){
        return new ArrayList<>(store.values());
    }
    @Override 
    public Optimal<Student>getOneStudent(Long id){
        return Optinal.ofNullable(store.get(id));
    }
    @Override
    public void deleteStudent(Long id){
        store.remove(id);
    }
}