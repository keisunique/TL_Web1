package com.ke.shiro;

import com.ke.pojo.User;
import com.ke.service.UserService;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/5.
 */

@Service
public class PasswordHelper {

    @Autowired
    private UserService userService;

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    private String algorithmName = "md5";

    private int hashIterations = 1;

    public User encryptPassword(User user) {
        // 将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用了盐
        user.setSalt(randomNumberGenerator.nextBytes().toHex());

        String newPassword = new SimpleHash(
                algorithmName,
                user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                hashIterations).toHex();//toHex 转成16进制

        user.setPassword(newPassword);

        return user;
    }

    public boolean confirmPassword(User user){

        //1.根据用户名查数据库对应的密码和盐值
        User dbUser = userService.findUserByUsername(user.getUsername());
        //2.如果没找到就返回false
        if(dbUser == null){
            return false;
        }
        String dbPassword = dbUser.getPassword();
        String dbSalt = dbUser.getSalt();

        String pagePassword = new SimpleHash(
                algorithmName,
                user.getPassword(),
                ByteSource.Util.bytes(dbUser.getUsername()+dbSalt),
                hashIterations).toHex();
        //2.将页面传的密码加盐进行散列和数据库散列的密码对比
        if(dbPassword.equalsIgnoreCase(pagePassword)){
            return true;
        }else {
            return false;
        }
    }


    public RandomNumberGenerator getRandomNumberGenerator() {
        return randomNumberGenerator;
    }

    public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public int getHashIterations() {
        return hashIterations;
    }

    public void setHashIterations(int hashIterations) {
        this.hashIterations = hashIterations;
    }
}
