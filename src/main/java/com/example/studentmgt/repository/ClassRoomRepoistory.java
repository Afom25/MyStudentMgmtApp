package com.example.studentmgt.repository;

import com.example.studentmgt.model.Classroom;
import com.example.studentmgt.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ClassRoomRepoistory extends CrudRepository<Classroom,Long> {
    }

