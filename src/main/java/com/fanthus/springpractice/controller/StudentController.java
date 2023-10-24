package com.fanthus.springpractice.controller;


import com.fanthus.springpractice.manager.StudentManager;
import com.fanthus.springpractice.model.po.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class StudentController {

    @Resource
    private StudentManager studentManager;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentManager.getAllStudents();
    }

}
