package com.example.RegisterLogin.repository;

import com.example.RegisterLogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// jpa implementation for  defined method for findall,by id,getbyid find for predefined crud operations
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
