package cnsrdb.mapper;

import cnsrdb.entity.Paperinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaperinfoMapper {

    /**
     * 添加论文信息
     * @param paperinfo
     */
    public void addPaperinfo(Paperinfo paperinfo);

    /**
     * 查询所有专利信息
     * @return
     */
    public List<Paperinfo> getPaperinfos();

    /**
     * 根据学号查询
     * @param tid
     * @return
     */
    public Paperinfo getPaperinfo(String tid);

    /**
     * 删除专利，因为他们没说按照什么删除，先传递一个对象过来
     * @param paperinfo
     */
    public void deletePaperinfo(Paperinfo paperinfo);
}
