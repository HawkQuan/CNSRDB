package cnsrdb.service.impl;

import cnsrdb.mapper.StudentMapper;
import cnsrdb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
}
