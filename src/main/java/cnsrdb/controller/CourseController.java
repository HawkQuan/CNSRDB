package cnsrdb.controller;

import cnsrdb.entity.Course;
import cnsrdb.service.CourseService;
import cnsrdb.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.LinkedList;
import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    List<Course> courses = new LinkedList<Course>();

    /**
     * GET方式获得所有的课程信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/getCourses",method = RequestMethod.GET)
    public String getCourses(Model model){
        courses = courseService.getCourses();
        model.addAttribute("courses",courses);
        return Constant.TeachJob;
    }

    /**
     * 通过课程名找课程
     * @param coursename
     * @param model
     * @return
     */
    @RequestMapping(value = "/getCoursebyname",method = RequestMethod.POST)
    public String getCoursebyname(@RequestParam(value = "coursename",required = false) String coursename,Model model){
        courses = courseService.getCoursesbyname(coursename);
        model.addAttribute("courses",courses);
        return Constant.TeachJob;
    }

    /**
     * 通过老师找课程
     * @param lecturer
     * @param model
     * @return
     */
    @RequestMapping(value = "/getCoursebylecturer",method = RequestMethod.POST)
    public String getCoursebylecturer(@RequestParam(value = "lecturer",required = false) String lecturer,Model model){
        courses = courseService.getCoursebylecturer(lecturer);
        model.addAttribute("courses",courses);
        return Constant.TeachJob;
    }

    /**
     * 添加课程信息
     * @param coursenum
     * @param coursename
     * @param coursetype
     * @param studentlevel
     * @param lecturer
     * @param note
     * @param model
     * @return
     */
    @RequestMapping(value = "/addcourse",method = RequestMethod.POST)
    public String addCourse(@RequestParam(value = "coursenum",required = false) String coursenum,
                            @RequestParam(value = "coursename",required = false) String coursename,
                            @RequestParam(value = "coursetype",required = false) String coursetype,
                            @RequestParam(value = "studentlevel",required = false) String studentlevel,
                            @RequestParam(value = "lecture",required = false) String lecturer,
                            @RequestParam(value = "note",required = false) String note,Model model){
        Course course = new Course(coursenum,coursename,coursetype,studentlevel,lecturer,note);
        courseService.addCourse(course);
        courseService.getCourses();
        model.addAttribute("courses",courses);
        return Constant.TeachJob;
    }

    /**
     * 删除课程信息
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "deletecourse",method = RequestMethod.POST)
    public String deleteCourse(@RequestParam(value = "id",required = false) Long id,Model model){
        courseService.deleteCourse(id);
        courses = courseService.getCourses();
        return Constant.TeachJob;
    }

}
