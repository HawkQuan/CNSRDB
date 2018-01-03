package cnsrdb.service.impl;

import cnsrdb.mapper.PaperinfoMapper;
import cnsrdb.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("patentService")
public class PatentServiceImpl implements PatentService{
    @Autowired
    private PaperinfoMapper paperinfoMapper;
}
