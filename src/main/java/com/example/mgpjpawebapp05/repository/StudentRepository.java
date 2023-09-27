package com.example.mgpjpawebapp05.repository;

import com.example.mgpjpawebapp05.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByName(String name);

}