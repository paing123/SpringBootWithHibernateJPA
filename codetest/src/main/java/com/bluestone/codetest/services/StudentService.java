package com.bluestone.codetest.services;

import java.util.List;
import java.util.Optional;

import com.bluestone.codetest.model.Student;

public interface StudentService {
	
    List<Student> getAllStudents();
    
    Optional<Student> findById(int id);
    
    Optional<Student> findByEmail(String email);
    
    Student save(Student std);
    
    void deleteById(int id);
}
