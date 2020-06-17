package com.nicron.study.wmsapi.service;

import com.nicron.study.wmsapi.entity.Role;
import com.nicron.study.wmsapi.entity.Token;
import com.nicron.study.wmsapi.entity.User;

import java.util.Map;

public interface LoginService {

    User findUserByUsername(String username);

    Map<String, Object> createToken(Integer userId);

    void logout(String token);

    Token findByToken(String accessToken);

    User findById(Integer userid);

    User findByIdWithRole(Integer userid);

    Role findByRoleIdWithPermission(Integer roleid);
}