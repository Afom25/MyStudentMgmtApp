package com.example.studentmgt.repository;

import com.example.studentmgt.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
