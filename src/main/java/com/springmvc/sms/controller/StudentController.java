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
        super();
        this.studentService = studentService;
    }

    // handler method to handle list student and return model and view
    @GetMapping("/students")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

    //build create student form
    @GetMapping("/student/new")
    public String createStudentForm(Model model){
        //create a student to hold student form data
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

    //update student
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findStudentByID(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {

        // get student from database by id
        Student existingStudent = studentService.findStudentByID(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    //handler method to handle delete request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
