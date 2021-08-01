package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController  //Enables the ability to expose endpoints
@RequestMapping(path = "api/v1/students")  //Setting the url
@AllArgsConstructor // Dependency Injection (Lombok)
public class StudentController {

    private final StudentService studentService;

    @GetMapping //Get method for this controllers url route
    public List<Student> getAllStudents(){
    return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }


    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(
            @PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
