package cnsrdb.service.impl;

import cnsrdb.mapper.TeacherMapper;
import cnsrdb.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;
}
