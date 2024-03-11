package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById( Integer key);

    List<Student> getStudents ();

    List<Student> findByLastName(String name);

    void update(Student student);



}
