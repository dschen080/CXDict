package cct.cds.cxdict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cct.cds.cxdict.mbg.mapper.WordsMapper;
import cct.cds.cxdict.mbg.model.Words;
import cct.cds.cxdict.mbg.model.WordsExample;
import cct.cds.cxdict.service.WordsService;

@Service
public class WordsServiceImpl implements WordsService{

    @Autowired
    private WordsMapper wordsMapper;

    public int create(Words words){
        wordsMapper.insert(words);
        return 1;
    }

    public int delete(int id){
        WordsExample example = new WordsExample();
        example.createCriteria().andIdEqualTo(id);
        wordsMapper.deleteByExample(example);
        return 1;
    }

    public int update(Words words){
        wordsMapper.updateByPrimaryKey(words);
        return 1;
    }

    public List<Words> select(Integer pageSize,Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        WordsExample example = new WordsExample();
        example.createCriteria();
        return wordsMapper.selectByExample(example);
    }
    
}
