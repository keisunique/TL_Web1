package com.ke.service.impl;

import com.ke.mapper.RoleMapper;
import com.ke.mapper.UserMapper;
import com.ke.pojo.Role;
import com.ke.pojo.User;
import com.ke.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;


    /**
     * 获取用户权限id
     * @param username 用户名
     * @return 权限集合
     */
    public Set<String> findRolesByUsername(String username) {

        User user = userMapper.selectByPrimaryKey(username);

        Set<String> userSet = new HashSet<String>();

        userSet.add(user.getRoleId().toString());

        return userSet;
    }

    /**
     * 根据用户名获取用户对象
     * @param username 用户名
     * @return 用户对象
     */
    public User findUserByUsername(String username) {

        return userMapper.selectByPrimaryKey(username);

    }


    public Set<String> findRoleNameByUserName(String username) {

        User user = userMapper.selectByPrimaryKey(username);

        Role role = roleMapper.selectByPrimaryKey(user.getRoleId());

        Set<String> userSet = new HashSet<String>();

        userSet.add(role.getRoleName());

        return userSet;

    }


    /**
     * 获取所有用户
     * @return 用户List
     */
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
    /**
     * 获取所有管理员
     * @return 管理员List
     */
    public List<User> selectAllAdmin() {
        return userMapper.selectAllAdmin();
    }

    /**
     * 获取所有版主
     * @return 版主List
     */
    public List<User> selectAllModerator() {
        return userMapper.selectAllModerator();
    }


}
