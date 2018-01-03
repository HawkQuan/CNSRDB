package cnsrdb.service.impl;

import cnsrdb.entity.Course;
import cnsrdb.mapper.CourseMapper;
import cnsrdb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseMapper courseMapper;

    List<Course>courses = new LinkedList<Course>();

    public List<Course> getCourses(){
        courses = courseMapper.getCourses();
        return courses;
    }

    public List<Course> getCoursesbyname(String coursename){
        courses = courseMapper.getCoursesbyname(coursename);
        return courses;
    }


    public List<Course> getCoursebylecturer(String lecture){
        courses = courseMapper.getCoursebylecturer(lecture);
        return courses;
    }

    public String addCourse(Course course){
        courseMapper.addCourse(course);
        return "success";
    }

    public String deleteCourse(Long id){
        courseMapper.deleteCourse(id);
        return "success";
    }
}
