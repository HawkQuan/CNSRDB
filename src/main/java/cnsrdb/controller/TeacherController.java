package cnsrdb.controller;

import cnsrdb.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
}
