package cnsrdb.controller;

import cnsrdb.entity.Paperinfo;
import cnsrdb.service.PaperinfoService;
import cnsrdb.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaperinfoController {
    @Autowired
    private PaperinfoService paperinfoService;

    @RequestMapping(value = "/getPaper",method = RequestMethod.POST)
    public String getPaper(@RequestParam(value = "tid",required = false) String tid, Model model){

        Paperinfo paperinfo = null;
        paperinfo = paperinfoService.getPaperinfo(tid);//带你用service层里的函数
        model.addAttribute("paper",paperinfo);//把搜到的信息放到model里返回
        return Constant.Paper;//返回到paper界面
    }

}
