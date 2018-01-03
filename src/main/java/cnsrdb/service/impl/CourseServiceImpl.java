package cnsrdb.service.impl;

import cnsrdb.mapper.CourseMapper;
import cnsrdb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseMapper courseMapper;
}
