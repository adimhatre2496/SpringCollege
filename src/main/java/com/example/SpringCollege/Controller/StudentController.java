package com.example.SpringCollege.Controller;

import com.example.SpringCollege.Model.Student;
import com.example.SpringCollege.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
    {
        @Autowired
        private StudentService studentService;

        @GetMapping(path = "/students/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)

        public ResponseEntity<List<Student>> getStudent(@PathVariable Long studentId)
        {
            List<Student> st = studentService.getStudent(1L);

            return new ResponseEntity<>(st, HttpStatus.OK);

    //        Student student = new Student("Aditya", "Mhatre", "16/02/2000", 993080952, "Kisan", "Thane", 400604);
    //       Student student1 = new Student("Raj", "Mhatre", "16/02/2000", 5023699, "Kisan", "Thane", 400604);
    //
    //             student.getFirstName();
    //             student.getLastName();
    //             student.getDateOfBirth();
    //             student.getMobileNo();
    //             student.getAddress();
    //             student.getCity();
    //             student.getPostalCode();
    //
    //             student1.getFirstName();
    //             student1.getLastName();
    //             student1.getDateOfBirth();
    //             student1.getMobileNo();
    //             student1.getAddress();
    //             student1.getCity();
    //             student1.getPostalCode();//     return new ResponseEntity<>(student,  HttpStatus.OK);

        }
    }


