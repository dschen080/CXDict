package cct.cds.cxdict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cct.cds.cxdict.common.api.CommonResult;
import cct.cds.cxdict.dto.LoginParam;
import cct.cds.cxdict.mbg.model.User;
import cct.cds.cxdict.service.RoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "RoleController", description = "用户管理")
@Controller
@RequestMapping("/role")
public class RoleController {

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@Validated @RequestBody LoginParam loginParam){
        String token = roleService.login(loginParam.getName(), loginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestBody User user){
        int count = roleService.register(user);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();

    }
    
}
