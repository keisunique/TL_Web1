<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
  <meta charset="utf-8">
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>一级版块 - Learn together</title>

  <link rel="stylesheet"  href="${pageContext.request.contextPath}/statics/bspage/css/bootstrap.min.css">
  <link rel="stylesheet"  href="${pageContext.request.contextPath}/statics/bspage/css/style.css">
  <link rel="stylesheet"  href="${pageContext.request.contextPath}/statics/bspage/css/font-awesome.min.css">
  <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/statics/bspage/images/icon/icon.png">
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/statics/bspage/images/icon/favicon.ico">
  <script src="${pageContext.request.contextPath}/statics/bspage/js/jquery-2.1.4.min.js"></script>
  <!--[if gte IE 9]>
  <script src="/statics/bspage/js/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="/statics/bspage/js/html5shiv.min.js" type="text/javascript"></script>
  <script src="/statics/bspage/js/respond.min.js" type="text/javascript"></script>
  <script src="/statics/bspage/js/selectivizr-min.js" type="text/javascript"></script>
  <![endif]-->
  <!--[if lt IE 9]>
  <script>window.location.href='upgrade-browser.html';</script>
  <![endif]-->
</head>

<body class="user-select">
<section class="container-fluid">
  <header>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"> <span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
          <a class="navbar-brand" href="#">Learn Together</a> </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="">消息 <span class="badge">1</span></a></li>
            <li class="dropdown"> <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${username} <span class="caret"></span></a>
              <ul class="dropdown-menu dropdown-menu-left">
                <li><a title="查看或修改个人信息" data-toggle="modal" data-target="#seeUserInfo">个人信息</a></li>
                <li><a title="查看您的登录记录" data-toggle="modal" data-target="#seeUserLoginlog">登录记录</a></li>
              </ul>
            </li>
            <li><a href="login.html" onClick="if(!confirm('是否确认退出？'))return false;">退出登录</a></li>
            <li><a data-toggle="modal" data-target="#WeChat">帮助</a></li>
          </ul>
          <form action="" method="post" class="navbar-form navbar-right" role="search">
            <div class="input-group">
              <input type="text" class="form-control" autocomplete="off" placeholder="键入关键字搜索" maxlength="15">
              <span class="input-group-btn">
              <button class="btn btn-default" type="submit">搜索</button>
              </span> </div>
          </form>
        </div>
      </div>
    </nav>
  </header>

  <div class="row">

    <div class="row">

      <!--侧边菜单-->
      <aside class="col-sm-3 col-md-2 col-lg-2 sidebar">
        <ul class="nav nav-sidebar">
          <li><a href="${pageContext.request.contextPath}/bs/index">信息总览</a></li>
        </ul>
        <ul class="nav nav-sidebar">
          <li><a class="dropdown-toggle" id="userMenu0" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">版块管理</a>
            <ul class="dropdown-menu" aria-labelledby="userMenu">
              <li><a href="category">一级版块</a></li>
              <li><a href="category">二级版块</a></li>
            </ul>
          </li>
          <li><a href="comment.html">资源管理</a></li>
          <li><a class="dropdown-toggle" id="userMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">用户管理</a>
            <ul class="dropdown-menu" aria-labelledby="userMenu">
              <li><a href="${pageContext.request.contextPath}/bs/manageadminpage">管理员</a></li>
              <li><a href="${pageContext.request.contextPath}/bs/managemoderatorpage">版主</a></li>
              <li><a href="${pageContext.request.contextPath}/bs/manageuserpage">会员</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="loginlog.html">登录日志</a></li>
            </ul>
          </li>
          <li><a href="article.html">留言管理</a></li>
          <%--<li><a data-toggle="tooltip" data-placement="bottom" title="网站暂无留言功能">留言</a></li>--%>
        </ul>
        <ul class="nav nav-sidebar">
          <li><a class="dropdown-toggle" id="userMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">数据报表</a>
            <ul class="dropdown-menu" aria-labelledby="userMenu">
              <li><a href="${pageContext.request.contextPath}/bs/manageadminpage">管理员</a></li>
              <li><a href="${pageContext.request.contextPath}/bs/managemoderatorpage">版主</a></li>
              <li><a href="${pageContext.request.contextPath}/bs/manageuserpage">会员</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="loginlog.html">登录日志</a></li>
            </ul>
          </li>
          <li><a class="dropdown-toggle" id="settingMenu" data-toggle="dropdown"
                 aria-haspopup="true" aria-expanded="false">网站设置</a>
            <ul class="dropdown-menu" aria-labelledby="settingMenu">
              <li><a href="setting.html">基本设置</a></li>
              <li><a href="readset.html">阅读设置</a></li>
              <li role="separator" class="divider"></li>
              <li><a data-toggle="modal" data-target="#areDeveloping">安全配置</a></li>
              <li role="separator" class="divider"></li>
              <li class="disabled"><a>扩展菜单</a></li>
            </ul>
          </li>
        </ul>
      </aside>

      <!--main-->
      <div class="col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main" id="main">
        <form action="${pageContext.request.contextPath}/bs/delItems" method="post" name="items">
          <h1 class="page-header">操作</h1>
          <ol class="breadcrumb">
            <li><a data-toggle="modal" data-target="#addSection">增加一级版块</a></li>
          </ol>
          <h1 class="page-header">管理 <span class="badge">${count}</span></h1>
          <div class="table-responsive">
            <table class="table table-striped table-hover">
              <thead>
                <tr>
                  <th><span class="glyphicon glyphicon-th-large"></span> <span class="visible-lg">选择</span></th>
                  <th><span class="glyphicon glyphicon-file"></span> <span class="visible-lg">名称</span></th>
                  <th><span class="glyphicon glyphicon-time"></span> <span class="visible-lg">描述</span></th>
                  <th><span class="glyphicon glyphicon-pencil"></span> <span class="visible-lg">操作</span></th>
                </tr>
              </thead>
              <tbody>
              <c:forEach  var="section" items="${sections}">
                <tr id="${section.id}">
                  <td><input type="checkbox" class="input-control" name="checkbox[]" value="${section.id}" /></td>
                  <td class="article-title">${section.sectionName}</td>
                  <td>${section.sectionDescription}</td>
                  <td>
                    <a onclick="updateSec(${section.id})">修改 </a>
                    <a rel="${section.id}">删除</a></td>
                </tr>
              </c:forEach>
              </tbody>
            </table>
          </div>
          <footer class="message_footer">
            <nav>
              <div class="btn-toolbar operation" role="toolbar">
                <div class="btn-group" role="group"> <a class="btn btn-default" onClick="select()">全选</a> <a class="btn btn-default" onClick="reverse()">反选</a> <a class="btn btn-default" onClick="noselect()">不选</a> </div>
                <div class="btn-group" role="group">
                  <button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</button>
                </div>
              </div>
              <ul class="pagination pagenav">
                <li class="disabled"><a aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
                <li class="active"><a>1</a></li>
                <li class="disabled"><a aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
              </ul>
            </nav>
          </footer>
        </form>
      </div>

    </div>

  </div>
</section>
<!--个人信息模态框-->
<div class="modal fade" id="seeUserInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <form action="" method="post">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" >个人信息</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
              <tr> </tr>
            </thead>
            <tbody>
              <tr>
                <td wdith="20%">姓名:</td>
                <td width="80%"><input type="text" value="王雨" class="form-control" name="truename" maxlength="10" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">用户名:</td>
                <td width="80%"><input type="text" value="admin" class="form-control" name="username" maxlength="10" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">电话:</td>
                <td width="80%"><input type="text" value="18538078281" class="form-control" name="usertel" maxlength="13" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">旧密码:</td>
                <td width="80%"><input type="password" class="form-control" name="old_password" maxlength="18" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">新密码:</td>
                <td width="80%"><input type="password" class="form-control" name="password" maxlength="18" autocomplete="off" /></td>
              </tr>
              <tr>
                <td wdith="20%">确认密码:</td>
                <td width="80%"><input type="password" class="form-control" name="new_password" maxlength="18" autocomplete="off" /></td>
              </tr>
            </tbody>
            <tfoot>
              <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
<!--个人登录记录模态框-->
<div class="modal fade" id="seeUserLoginlog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" >登录记录</h4>
      </div>
      <div class="modal-body">
        <table class="table" style="margin-bottom:0px;">
          <thead>
            <tr>
              <th>登录IP</th>
              <th>登录时间</th>
              <th>状态</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>::1:55570</td>
              <td>2016-01-08 15:50:28</td>
              <td>成功</td>
            </tr>
            <tr>
              <td>::1:64377</td>
              <td>2016-01-08 10:27:44</td>
              <td>成功</td>
            </tr>
            <tr>
              <td>::1:64027</td>
              <td>2016-01-08 10:19:25</td>
              <td>成功</td>
            </tr>
            <tr>
              <td>::1:57081</td>
              <td>2016-01-06 10:35:12</td>
              <td>成功</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">朕已阅</button>
      </div>
    </div>
  </div>
</div>

<!--添加一级版块模态框-->
<div class="modal fade" id="addSection" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <form action="${pageContext.request.contextPath}/bs/category/add/1" method="post">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" >添加一级版块</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
            <tr> </tr>
            </thead>
            <tbody>
            <tr>
              <td wdith="20%">版块名称:</td>
              <td width="80%"><input type="text"  class="form-control" name="sectionName" maxlength="10" autocomplete="off" /></td>
            </tr>
            <tr>
              <td wdith="20%">版块描述:</td>
              <td width="80%"><input type="text"  class="form-control" name="sectionDescription" maxlength="10" autocomplete="off" /></td>
            </tr>
            </tbody>
            <tfoot>
            <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary" >提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

<!--修改一级版块模态框-->
<div class="modal fade" id="updateSection" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <form id="updateForm" action="" method="post">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" >添加一级版块</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
            <tr> </tr>
            </thead>
            <tbody>
            <tr>
              <td wdith="20%">版块名称:</td>
              <td width="80%">
                <input type="text" id="updateSectionName" class="form-control" name="sectionName" maxlength="10" autocomplete="off" />
                <input type="hidden" id="updateSectionId" name="id">
              </td>
            </tr>
            <tr>
              <td wdith="20%">版块描述:</td>
              <td width="80%"><input type="text" id="updateSectionDescription" class="form-control" name="sectionDescription" maxlength="10" autocomplete="off" /></td>
            </tr>
            </tbody>
            <tfoot>
            <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>


<!--提示模态框-->
<div class="modal fade user-select" id="areDeveloping" tabindex="-1" role="dialog" aria-labelledby="areDevelopingModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="areDevelopingModalLabel" style="cursor:default;">该功能正在日以继夜的开发中…</h4>
      </div>
      <div class="modal-body"> <img src="${pageContext.request.contextPath}/statics/bspage/images/baoman/baoman_01.gif" alt="深思熟虑" />
        <p style="padding:15px 15px 15px 100px; position:absolute; top:15px; cursor:default;">很抱歉，程序猿正在日以继夜的开发此功能，本程序将会在以后的版本中持续完善！</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">朕已阅</button>
      </div>
    </div>
  </div>
</div>
<!--右键菜单列表-->
<div id="rightClickMenu">
  <ul class="list-group rightClickMenuList">
    <li class="list-group-item disabled">欢迎访问异清轩博客</li>
    <li class="list-group-item"><span>IP：</span>172.16.10.129</li>
    <li class="list-group-item"><span>地址：</span>河南省郑州市</li>
    <li class="list-group-item"><span>系统：</span>Windows10 </li>
    <li class="list-group-item"><span>浏览器：</span>Chrome47</li>
  </ul>
</div>
<script src="${pageContext.request.contextPath}/statics/bspage/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/bspage/js/admin-scripts.js"></script>

<!--修改版块信息-->
<script>
    function editInfo(obj) {
        var tds= $(obj).parent().find('td');
        alert(tds.eq(2).text());
        $('#updateSectionName').val(tds.eq(0).id);
        $('#updateSectionDescription').val(tds.eq(1).text());
        $('#updateSection').modal('show');
    }
</script>

<!--更新版块信息-->
<script>
  function updateSec(id){
      $("#updateSectionId").val(id);
      $("#updateForm").attr("action", "/bs/category/update/"+id);
      $("#updateSection").modal("show");
  }
</script>

<script>
//是否确认删除
$(function(){
	$("#main table tbody tr td a").click(function(){
		var name = $(this);
		var id = name.attr("rel"); //对应id
		if (event.srcElement.outerText === "删除") 
		{
			if(window.confirm("此操作不可逆，是否确认？"))
			{
				$.ajax({
					type: "POST",
					url: "/bs/category/delete/"+id,
					data: "id=" + id,
					cache: false, //不缓存此页面
					success: function (data) {
						window.location.reload();
					}
				});
			};
		};
	});   
});
</script>
</body>
</html>
