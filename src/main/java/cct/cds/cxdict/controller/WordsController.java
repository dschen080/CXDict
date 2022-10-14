package cct.cds.cxdict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cct.cds.cxdict.service.WordsService;
import io.swagger.annotations.Api;

@Api(tags = "WordsController", description = "单词管理")
@Controller
@RequestMapping("/words")
public class WordsController {

    @Autowired
    private WordsService wordsService;

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody

    
}
