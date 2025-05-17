package edu.icet.ecom.controller;

import edu.icet.ecom.model.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class StudentController {

    @PostMapping("get-student-detail")
    Student getDetails(@RequestBody Student student){
        System.out.println(student);

        return student;
    }
}
