package com.springmvc.sms.service.impl;

import com.springmvc.sms.entity.Student;
import com.springmvc.sms.repository.StudentRepository;
import com.springmvc.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
