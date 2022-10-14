package cct.cds.cxdict.service;

import java.util.List;

import cct.cds.cxdict.mbg.model.Words;

public interface WordsService {

    int create(Words words);

    int delete(int id);

    int update(Words words);

    List<Words> select(Integer pageSize,Integer pageNum);
    
}
