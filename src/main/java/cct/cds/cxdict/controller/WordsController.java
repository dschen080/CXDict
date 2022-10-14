package cct.cds.cxdict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cct.cds.cxdict.common.api.CommonPage;
import cct.cds.cxdict.common.api.CommonResult;
import cct.cds.cxdict.mbg.model.Words;
import cct.cds.cxdict.service.WordsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "WordsController", description = "单词管理")
@Controller
@RequestMapping("/words")
public class WordsController {

    @Autowired
    private WordsService wordsService;

    @ApiOperation(value = "创建词条")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody Words words){
        int count = wordsService.create(words);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();

    }

    @ApiOperation(value = "删除词条信息")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable int id){
        int count = wordsService.delete(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "修改词条信息(根据id)")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody Words words){
        int count = wordsService.update(words);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "查询词条信息")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult select(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum)
    {
        List<Words> wordsList = wordsService.select(pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(wordsList));
    }

    
}
