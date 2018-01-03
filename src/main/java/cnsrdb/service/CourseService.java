package cnsrdb.service;

import cnsrdb.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public List<Course> getCoursesbyname(String coursename);

    public List<Course> getCoursebylecturer(String lecture);

    public String addCourse(Course course);

    public String deleteCourse(Long id);
}
