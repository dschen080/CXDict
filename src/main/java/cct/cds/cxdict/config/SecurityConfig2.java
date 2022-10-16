package cct.cds.cxdict.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cct.cds.cxdict.bo.AdminUserDetails;
import cct.cds.cxdict.mbg.mapper.UserMapper;
import cct.cds.cxdict.mbg.model.User;
import cct.cds.cxdict.mbg.model.UserExample;

@Configuration
public class SecurityConfig2 {

    @Autowired
    private UserMapper userMapper;

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UserExample example = new UserExample();
                example.createCriteria().andNameEqualTo(username);
                List<User> userlist = userMapper.selectByExample(example);
                if(userlist != null && userlist.size()>0){
                    return new AdminUserDetails(userlist.get(0));
                }
                throw new UsernameNotFoundException("用户名或密码错误");
            }
        };
    }
    
}
