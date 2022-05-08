package com.bluestone.codetest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluestone.codetest.customannotation.Custom;
import com.bluestone.codetest.model.Student;
import com.bluestone.codetest.repositories.StudentRepository;

@Service
@Custom(name = "Student Service Annotation")
public class StudentServiceImpl implements StudentService {
	
    StudentRepository studentrepo;
    
    @Autowired
    public StudentServiceImpl(StudentRepository studentrepo) {
        this.studentrepo = studentrepo;
    }
    
    @Override
    public List<Student> getAllStudents() {

        return studentrepo.findAll();
    }
    
    @Override
    public Optional<Student> findById(int id) {
        return studentrepo.findById(id);
    }
    
    @Override
    public Optional<Student> findByEmail(String email) {
        return studentrepo.findByEmail(email);
    }
    
    @Override
    public Student save(Student std) {
        return studentrepo.save(std);
    }
    
    @Override
    public void deleteById(int id) {
        studentrepo.deleteById(id);
    }
}
