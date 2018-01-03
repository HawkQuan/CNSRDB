package cnsrdb.mapper;

import cnsrdb.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    public List<Course> getCourses();

    public List<Course> getCoursesbyname(String coursename);

    public List<Course> getCoursebylecturer(String lecture);

    public void addCourse(Course course);

    public void deleteCourse(Long id);
}
