package com.springmvc.sms;

import com.springmvc.sms.entity.Student;
import com.springmvc.sms.repository.StudentRepository;
import com.springmvc.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleStudentManagementSystemUsingSpringMvcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SimpleStudentManagementSystemUsingSpringMvcApplication.class, args);
    }

    // lien ket studentRepository voi bean phu hop
    @Autowired
    private StudentRepository studentRepository;

    //CommandLineRunner dung de add ham run
    //Ham run se chay ngay sau khi chuong trinh bat dau truoc khi thuc hien cac tac vu khac
    @Override
    public void run(String... args) throws Exception {

    }
}
