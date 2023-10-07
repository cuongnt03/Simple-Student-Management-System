package com.springmvc.sms.service;

import com.springmvc.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student findStudentByID(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
