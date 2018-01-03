package cnsrdb.service.impl;

import cnsrdb.entity.Paperinfo;
import cnsrdb.mapper.PaperinfoMapper;
import cnsrdb.service.PaperinfoService;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Paperinfo getPaperinfo(Long tid){
        Paperinfo paperinfo = null;
        paperinfo = paperinfoMapper.getPaperinfo(tid);
        return paperinfo;
    }

    public List<Paperinfo> getPaperinfos(){
        List<Paperinfo>paperinfos = null;
        paperinfos = paperinfoMapper.getPaperinfos();
        return paperinfos;
    }

    public String deletePaperinfo(Long id){
        paperinfoMapper.deletePaperinfo(id);
        return "success";
    }

    public int Count(long tid){

        return paperinfoMapper.Count(tid);
    }
}
