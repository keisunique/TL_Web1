package com.ke.service;

import com.ke.pojo.User;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/29.
 */
public interface UserService {

    /**
     * 获取用户权限信息
     * @param username 用户名
     * @return 权限集合
     */
    Set<String> findRolesByUsername(String username);

    User findUserByUsername(String username);

    Set<String> findRoleNameByUserName(String username);

    List<User> selectAllUser();

    List<User> selectAllAdmin();

    List<User> selectAllModerator();


}
