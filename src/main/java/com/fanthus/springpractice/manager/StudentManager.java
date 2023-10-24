package com.fanthus.springpractice.manager;

import com.fanthus.springpractice.model.po.Student;
import com.fanthus.springpractice.service.StudentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class StudentManager {

    @Resource
    private StudentService studentService;

    public List<Student> getAllStudents() {
        return studentService.queryAllStudents();
    }

}
