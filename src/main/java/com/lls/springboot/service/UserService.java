package com.lls.springboot.service;


import com.lls.springboot.model.TokenUserDTO;
import com.lls.springboot.model.UserPo;

public interface UserService {

    /**
     * 添加新用户
     *
     * username 唯一， 默认 USER 权限
     * @param userPo
     */
    boolean insert(TokenUserDTO userPo);

    /**
     * 查询用户信息
     * @param username 账号
     * @return UserEntity
     */
    UserPo getByUsername(String username);

}
