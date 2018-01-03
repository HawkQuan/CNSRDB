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

import java.util.LinkedList;
import java.util.List;

@Controller
public class PaperinfoController {
    @Autowired
    private PaperinfoService paperinfoService;

    List<Paperinfo>paperinfos = new LinkedList<Paperinfo>();

    /**
     * 按照学号查找专利信息,POST
     * @param tid 学号
     * @param model
     * @return  专利那一页
     */
    @RequestMapping(value = "/getPaper",method = RequestMethod.POST)
    public String getPaperinfo(@RequestParam(value = "tid",required = false) Long tid, Model model){

        //-----------------调试信息------------------
        System.out.println("按学号查看专利时：");
        System.out.println(tid);
        //-------------------------------------

        Paperinfo paperinfo = null;
        paperinfo = paperinfoService.getPaperinfo(tid);//带你用service层里的函数
        model.addAttribute("paper",paperinfo);//把搜到的信息放到model里返回
        return Constant.Paper;//返回到paper界面
    }

    /**
     * GET方式获得所有专利信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/getPapers",method = RequestMethod.GET)
    public String getPaperinfos(Model model){

        paperinfos = paperinfoService.getPaperinfos();
        model.addAttribute("papers",paperinfos);
        return Constant.Paper;
    }

    /**
     * 删除专利，POST
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "deletepaper",method = RequestMethod.POST)
    public String deletePaperinfo(@RequestParam(value = "id",required = false)Long id,
                                  Model model){
        //-----------------调试信息------------------
        System.out.println("删除专利时：");
        System.out.println(id);
        //-------------------------------------

        paperinfoService.deletePaperinfo(id);
        paperinfos = paperinfoService.getPaperinfos();
        model.addAttribute("papers",paperinfos);
        return Constant.Paper;
    }

    /**
     * 添加专利信息，POST
     * @param grade
     * @param tid
     * @param title
     * @param model
     * @return
     */
    @RequestMapping(value = "/addpaper",method = RequestMethod.POST)
    public String addPaperinfo(@RequestParam(value = "grade",required = false)String grade,
                               @RequestParam(value = "tid",required = false) Long tid,
                               @RequestParam(value = "title",required = false)String title,
                               Model model){
        //-----------------调试信息------------------
        System.out.println("添加专利时：");
        System.out.println(grade);
        System.out.println(tid);
        System.out.println(title);
        //-------------------------------------

        Paperinfo paperinfo = new Paperinfo(grade,tid,title);
        paperinfoService.addPaperinfo(paperinfo);

        paperinfos = paperinfoService.getPaperinfos();
        model.addAttribute("papers",paperinfos);
        return Constant.Paper;
    }
}
