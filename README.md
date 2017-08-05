# TL_Web1


主题：Java学习资源整合分享网站


采用框架：Spring+SpringMVC+MyBatis+Shiro

# 目录结构


* sql              //sqk文件</br>
* src
    * main
    * java
      * com.ke
        * controller           //控制器
        * exception           //全局异常处理</br>
        * mapper              //mybatis mapper接口和XML文件</br>
        * pojo              
        * service               //业务逻辑
            * impl           //接口实现类                  
        * shiro                  //shiro权限控制
    
     - resources                 //配置文件
        
     - webapp
        - statics
        - WEB-INF
            - views
                - bs
                    - admin 
            - web.xml
        - home.jsp
- README.md
- pom.xml


# 模块完成进度

| 模块 | 进度 |描述 |
| ------------- |:-------------:|--------|
| 权限管理 | 50% |只对管理员权限进行处理，版主的权限还未处理|
| 用户管理 | 70% |版主账号的crud还未完成|
| 一级版块管理 | 100% |网站一级版块管理|
| 二级版块管理 | 0% |网站二级版块管理|
| 资源管理 | 0% |还未进行|
| 日志管理 | 0% |还未进行|
| 数据报表 | 0% |还未进行|



后台登陆地址http://localhost:8080/bs/login

账号：ke
密码：123

