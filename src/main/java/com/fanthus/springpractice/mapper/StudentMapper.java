package com.fanthus.springpractice.mapper;

import com.fanthus.springpractice.common.mapper.BaseMapper;
import com.fanthus.springpractice.model.po.Student;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

    List<Student> queryStudents();

}