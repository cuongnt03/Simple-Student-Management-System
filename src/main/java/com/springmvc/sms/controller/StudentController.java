package com.springmvc.sms.controller;

import com.springmvc.sms.entity.Student;
import com.springmvc.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method to handle list student and return model and view
    @GetMapping("students")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    //build create student form
    @GetMapping("/student/new")
    public String createStudentForm(Model model){
        //create a studen to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    //luu student vua tao tu create_student
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("students") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";

    }
}
