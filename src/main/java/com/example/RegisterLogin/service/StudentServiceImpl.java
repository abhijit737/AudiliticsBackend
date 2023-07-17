package com.example.RegisterLogin.service;

import com.example.RegisterLogin.model.Student;
import com.example.RegisterLogin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  // inject service repository into service class
    private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);

    }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }


  /*
  @Override
  public List<Student> getStudent() {
    return studentRepository.getById;
   // return studentRepository.findById;

  }

*/


}
