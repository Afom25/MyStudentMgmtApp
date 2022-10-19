package com.example.studentmgt.service.impl;

import com.example.studentmgt.model.Student;
import com.example.studentmgt.repository.StudentRepository;
import com.example.studentmgt.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public Iterable<Student> getAllStudnets() {
        return studentRepository.findAll();
    }

    @Override
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }
}
