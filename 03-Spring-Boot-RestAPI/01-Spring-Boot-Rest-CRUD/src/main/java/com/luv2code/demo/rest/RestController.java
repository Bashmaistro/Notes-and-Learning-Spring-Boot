package com.luv2code.demo.rest;


import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private List<Student> theStudents;


    //It will work before the start of the web server
    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Kenan" , "Yildiz"));
        theStudents.add(new Student("Arda" , "Guler"));
        theStudents.add(new Student("Semih" , "Kilicsoy"));
    }


    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }


    //define endpoint for return a single student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId ){


        //Check student id
        if (studentId > theStudents.size() || (studentId < 0)){
            throw new StudentNotFoundException("Student not found - " + studentId);
        }

        return theStudents.get(studentId);

    }






}
