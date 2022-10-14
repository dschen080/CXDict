package cct.cds.cxdict.service;

import org.springframework.security.core.userdetails.UserDetails;

import cct.cds.cxdict.mbg.model.User;

public interface RoleService {

    String login(String username, String password);

    UserDetails loadUserByUsername(String username);

    User getUserByUsername(String username);

    int register(User user);
    
}
