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
//        Student student1 = new Student("Cuong", "Nguyen", "cuongnguyen@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Hoa", "Pham", "hoapham@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Linh", "Trinh", "linhtrinh@gmail.com");
//        studentRepository.save(student3);
    }
}
