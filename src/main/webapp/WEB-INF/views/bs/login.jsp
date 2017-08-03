<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/29
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/bookstrap/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/bspage/login/css/login.css">
    <script src="${pageContext.request.contextPath}/statics/bspage/login/js/login.js"></script>
    <title>TL-后台登陆页面</title>

</head>
<body>
    <div id="bg" class="backgroundset">
        <!--标题-->
        <div id="title">
            <h1>Learn Together后台管理系统</h1>
        </div>
        <div >
            <h1>${err_message}</h1>
        </div>
        <!--表单-->
        <div id="loginForm" class="loginForm " >

            <form class="form-horizontal" role="form"
                  action="/bs/loginreq" method="post" >
                <div class="form-group" >
                    <label for="firstname" class="col-sm-2 control-label" style="color: white">用户名</label>
                    <div class="col-sm-10">
                        <input name="username" type="text" class="form-control" id="firstname" placeholder="请输入用户名">
                    </div>
                </div>
                <div id="password" class="form-group">
                    <label for="lastname" class="col-sm-2 control-label" style="color: white">密码</label>
                    <div class="col-sm-10">
                        <input name="password" type="password" class="form-control" id="lastname" placeholder="请输入密码">
                    </div>
                </div>
                <div class="form-group">
                    <div id="btn" class="col-sm-offset-2 col-sm-10">
                        <button id="login_btn" type="submit" class="btn btn-default">登录</button>
                    </div>
                </div>
            </form>

        </div>
    </div>
</body>
</html>
