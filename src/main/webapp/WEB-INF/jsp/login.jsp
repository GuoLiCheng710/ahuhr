<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="initial-scale=1,maximum-scale=1, user-scalable=no">
<link href="../css/reset.css" rel="stylesheet" type="text/css">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<link href="../css/dialog.css" rel="stylesheet" type="text/css">
<link href="../private_css/style.css" rel="stylesheet" type="text/css">
<link href="../private_css/animate.css" rel="stylesheet" type="text/css">
<title>AHUHR</title>
</head>
<body>
<section class="loginlogo"><!--<h1><img src="images/logo.png"></h1>--><h2>AHUHR平台</h2></section>
<!--表单开始-->
<section class="loginform">
    <div class="form-item"><input type="text" name="username" class="itemInput" placeholder="登录名" value="" id="userCode"></div>  
    <div class="form-item"><input type="password" name="password" class="itemInput" placeholder="密码" value="" id="password"></div>  
    <!--当用户输入时候去掉btn_disabled-->
    <div class="form-btn"><input type="submit" value="登录" id="login-submit" class="itemInput btn btn_disabled btn_primary"></div>
    <!--<div class="form-text fn-tac"><a href="/ahuhr/user/toRegister1.do">注册账号</a><a href="#" class="ui-text-gray-2">忘记密码</a></div>-->
    <!--错误提示，没有输的时候ui-bg-black80,输入有误的时候ui-bg-red80-->
    <div class="ui-tips ui-bg-black80" id="error_msg"></div>
</section>
<!--表单结束-->
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script type="text/javascript" src="../scripts/cookie_util.js"></script>
<script type="text/javascript" src="../js/login.js"></script> 

<!-- 
<script type="text/javascript">
	$(function(){
		$(".itemInput").focus(function(){
			   $("#login-submit").removeClass("btn_disabled");
		   });
		$("#login-submit").click(sub);
		
		function sub(){
			var userCode = $('#userCode').val();
			var password = $('#password').val();
			
			var url = '/ahuhr/user/login.do';
		    var tempForm = document.createElement("form");  
		    tempForm.id="tempForm";
		    tempForm.method="post";  
		    tempForm.action=url;
		    //tempForm.target="_self";
		    
		    var hideInput1 = document.createElement("input");  
		    hideInput1.type="hidden";  
		    hideInput1.name= "userCode";
		    hideInput1.value= userCode;
		    
		    var hideInput2 = document.createElement("input");  
		    hideInput2.type="hidden";  
		    hideInput2.name= "password";
		    hideInput2.value= password;
		    
		    tempForm.appendChild(hideInput1);
		    tempForm.appendChild(hideInput2);
		    document.body.appendChild(tempForm);  
		    tempForm.submit();
		    document.body.removeChild(tempForm);
		}
		
	});
	
</script>
-->
</body>
</html>
