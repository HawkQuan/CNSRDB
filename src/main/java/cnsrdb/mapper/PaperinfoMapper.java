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
    public Paperinfo getPaperinfo(Long tid);

    /**
     * 删除专利，按主键删除
     * @param id
     */
    public void deletePaperinfo(Long id);

    /**
     * 通过学号查找该同学专利的数量,删除学生时看看该学生是否有专利，有则不删除
     * @param tid
     * @return
     */
    public int Count(long tid);
}
