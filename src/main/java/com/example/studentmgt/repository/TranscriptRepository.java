package com.example.studentmgt.repository;

import com.example.studentmgt.model.Transcript;
import org.springframework.data.repository.CrudRepository;

public interface TranscriptRepository extends CrudRepository<Transcript,Integer> {
}
