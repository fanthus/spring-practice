package com.fanthus.springpractice.service.impl;

import com.fanthus.springpractice.mapper.StudentMapper;
import com.fanthus.springpractice.model.po.Student;
import com.fanthus.springpractice.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryAllStudents() {
        return studentMapper.queryStudents();
    }
}
