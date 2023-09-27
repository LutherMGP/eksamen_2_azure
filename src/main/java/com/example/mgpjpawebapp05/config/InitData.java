package com.example.mgpjpawebapp05.config;

import com.example.mgpjpawebapp05.model.Student;
import com.example.mgpjpawebapp05.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setBorn(LocalDate.of(2000,10,11));
        s1.setBornTime(LocalTime.now());
        s1.setName("Erik");
        studentRepository.save(s1);
        s1.setName("Bruce");
        studentRepository.save(s1);
        s1.setName("Finish");
        studentRepository.save(s1);
    }
}
