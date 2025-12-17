package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;
import com.example.demo.entity.Student;
@Repositorypublic interface StudentRepo extends
JpaRepository<Student,Long>{
    
}
