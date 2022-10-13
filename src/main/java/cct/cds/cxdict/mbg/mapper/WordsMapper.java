package cct.cds.cxdict.mbg.mapper;

import cct.cds.cxdict.mbg.model.Words;
import cct.cds.cxdict.mbg.model.WordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordsMapper {
    int countByExample(WordsExample example);

    int deleteByExample(WordsExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("word") String word);

    int insert(Words record);

    int insertSelective(Words record);

    List<Words> selectByExample(WordsExample example);

    Words selectByPrimaryKey(@Param("id") Integer id, @Param("word") String word);

    int updateByExampleSelective(@Param("record") Words record, @Param("example") WordsExample example);

    int updateByExample(@Param("record") Words record, @Param("example") WordsExample example);

    int updateByPrimaryKeySelective(Words record);

    int updateByPrimaryKey(Words record);
}