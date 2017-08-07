package com.ke.shiro;

import com.ke.pojo.User;
import com.ke.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/7/31.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    public void setName(String name) {
        super.setName("UserRealm");
    }

    /**
     * 为登陆成功的用户信息授予角色和权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
        String username = (String) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 将角色名称提供给info
        authorizationInfo.setRoles(userService.findRoleNameByUserName(username));
        // 将权限名称提供给info
        authorizationInfo.setStringPermissions(userService.findRoleNameByUserName(username));

        return authorizationInfo;
    }

    /**
     * 验证当前登陆的用户
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //token封装了用户的信息
        String username = (String) token.getPrincipal();

        User user = null;

        user = userService.findUserByUsername(username);

        System.out.println("realm: username:"+username+"password"+user.getPassword());

        if(user==null) {
            throw new UnknownAccountException();//没找到帐号
        }

        if(Boolean.parseBoolean(user.getLocked().toString())) {
            throw new LockedAccountException(); //帐号锁定
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(), //用户名
                user.getPassword(), //密码
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                this.getName()  //realm name
        );
        return authenticationInfo;

    }
}
