package com.bluestone.codetest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluestone.codetest.customannotation.Custom;
import com.bluestone.codetest.model.Student;

@Repository
@Custom(name = "Student Repository Annotation")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
    Optional<Student> findByEmail(String email);
}
