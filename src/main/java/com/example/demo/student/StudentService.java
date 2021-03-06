package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor //Dependency Injection (Lombok)
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        //check is email is taken first (do later)
       studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
