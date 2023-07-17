package com.example.RegisterLogin.service;

import com.example.RegisterLogin.model.Student;

import java.util.List;

//saving data into database
public interface StudentService {
    public Student saveStudent(Student student);

    //getting data from database
    public List<Student>getAllStudents();


/*
    // implementing for storing that  one user
    public  List<Student>getStudentById(int id);



*/


}

