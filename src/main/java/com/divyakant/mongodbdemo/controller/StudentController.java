package com.divyakant.mongodbdemo.controller;

import com.divyakant.mongodbdemo.model.Student;
import com.divyakant.mongodbdemo.repository.StudentRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepositiry studentRepositiry;

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = studentRepositiry.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudents()
    {
        return ResponseEntity.ok(studentRepositiry.findAll());
    }
}
