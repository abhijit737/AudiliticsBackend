package com.example.RegisterLogin.controller;

import com.example.RegisterLogin.model.Student;
import com.example.RegisterLogin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

//commnets are created by abhijit for clear uderstanding purpose
// mappping all http methods
@RestController

@CrossOrigin("http://localhost:3000")
@RequestMapping("/student")
public class StudentController {
    //inject Student repository
    @Autowired
    private StudentService studentService;


    // post data (create data)
    @PostMapping("/add")
    public String add(@RequestBody Student student)

    {
        studentService.saveStudent(student);
        return "new student data is added";
    }

    //getting data of user
    @GetMapping("/getAll")
    public List <Student> getStudents(){
        return studentService.getAllStudents();
    }

    // for getting that same user

    /*

     @GetMapping("/student/ {id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/getuser")

    public List <Student> getStudent(){
        return studentService.getStudent();
    }

*/


}
