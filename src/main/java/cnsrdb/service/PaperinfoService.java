package cnsrdb.service;

import cnsrdb.entity.Paperinfo;

import java.util.List;

public interface PaperinfoService {

    public String addPaperinfo(Paperinfo paperinfo);

    public Paperinfo getPaperinfo(Long tid);

    public List<Paperinfo> getPaperinfos();

    public String deletePaperinfo(Long id);

    public int Count(long tid);
}
