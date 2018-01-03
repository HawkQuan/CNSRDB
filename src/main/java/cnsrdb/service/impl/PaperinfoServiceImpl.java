package cnsrdb.service.impl;

import cnsrdb.entity.Paperinfo;
import cnsrdb.mapper.PaperinfoMapper;
import cnsrdb.service.PaperinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paperService")
public class PaperinfoServiceImpl implements PaperinfoService{
    @Autowired
    private PaperinfoMapper paperinfoMapper;

    public String addPaperinfo(Paperinfo paperinfo){
        paperinfoMapper.addPaperinfo(paperinfo);
        return "success";
    }

    public Paperinfo getPaperinfo(String tid){
        Paperinfo paperinfo = null;
        paperinfo = paperinfoMapper.getPaperinfo(tid);
        return paperinfo;
    }

    public List<Paperinfo> getPaperinfos(){
        List<Paperinfo>paperinfos = null;
        paperinfos = paperinfoMapper.getPaperinfos();
        return paperinfos;
    }

    public String deletePaperinfo(Paperinfo paperinfo){
        paperinfoMapper.deletePaperinfo(paperinfo);
        return "success";
    }
}
