package com.example.studentmgt.service;

import com.example.studentmgt.model.Student;

public  interface StudentService {
    Iterable<Student> getAllStudnets();
    Student addNewStudent(Student student);
}
