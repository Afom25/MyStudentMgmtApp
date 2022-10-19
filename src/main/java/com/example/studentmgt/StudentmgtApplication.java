package com.example.studentmgt;

import com.example.studentmgt.model.Student;
import com.example.studentmgt.model.Transcript;
import com.example.studentmgt.service.StudentService;
import com.example.studentmgt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentmgtApplication  {

    private StudentService studentService;
    private TranscriptService transcriptService;


//    public StudentmgtApplication(StudentService s, TranscriptService t) {
//        this.studentService1 = studentService1;
//        this.transcriptService1 = transcriptService1;
//    }



    public static void main(String[] args) {
        SpringApplication.run(StudentmgtApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//       // Student student = new Student(1, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));
//        Transcript transcript = new Transcript(null, "BS Computer Science");
//        saveStudent(student);
//        saveTranscript(transcript);
//    }

    private void saveStudent(Student student) {
        var savedStudent = studentService.addNewStudent(student);
        System.out.println(savedStudent);
    }

    private void saveTranscript(Transcript transcript) {
        var savedTranscripts = transcriptService.saveTranscript(transcript);
        System.out.println(savedTranscripts);
    }
}

