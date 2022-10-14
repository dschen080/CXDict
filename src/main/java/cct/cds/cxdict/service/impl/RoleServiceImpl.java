package cct.cds.cxdict.service.impl;

import cct.cds.cxdict.bo.AdminUserDetails;
import cct.cds.cxdict.common.exception.Asserts;
import cct.cds.cxdict.mbg.mapper.UserMapper;
import cct.cds.cxdict.mbg.model.User;
import cct.cds.cxdict.mbg.model.UserExample;
import cct.cds.cxdict.service.RoleService;
import cct.cds.cxdict.util.JwtTokenUtil;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String password){
        String token = null;
        try{
            UserDetails userDetails = loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                Asserts.fail("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        }
        catch (AuthenticationException e){
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        User userlist = getUserByUsername(username);
        if(userlist != null){
            AdminUserDetails details = new AdminUserDetails(userlist);
            return details;
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public User getUserByUsername(String username){
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(username);
        List<User> userList = userMapper.selectByExample(example);
        if(userList != null && userList.size()>0){
            User user = userList.get(0);
            return user;
        }
        return null;
    }
    
}
