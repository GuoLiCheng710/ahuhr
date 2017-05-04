<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<!--步骤开始-->
<section class="login-step">
	<div class="ui-step">
	    <ul>
            <li>
                <a href="#step-1" class="normaled" isdone="1" rel="1">
                  <label class="wizard-step">1</label>
                  <span class="wizard-description">创建账户</span>
                </a>
            </li>
            <li>
                <a href="#step-2" class="disabled" isdone="0" rel="2">
                  <label class="wizard-step">2</label>
                  <span class="wizard-description">完善个人信息</span>
                </a>
            </li>
            <li>
                <a href="#step-3" class="disabled" isdone="0" rel="3">
                  <label class="wizard-step">3</label>
                  <span class="wizard-description">注册成功</span>                   
                </a>
            </li
          </ul>
      </div>
</section>
<!--步骤结束-->
<!--表单开始-->
<section class="loginform">
    <div class="form-item"><input type="text" name="usercode" class="itemInput" placeholder="登录名(3-6位字母、数字)" value="" id=""></div>  
    <div class="form-item"><input type="password" name="password" class="itemInput" placeholder="密码（6-10位字母、数字）" value="" id=""></div> 
    <div class="form-item"><input type="password" name="confirm_password" class="itemInput" placeholder="确认密码" value="" id=""></div> 
    <div class="form-item"><input type="text" name="email" class="itemInput" placeholder="邮箱" value="" id=""></div> 
    <!--如果验证码已发送在就调用span-->
	<!--
    <div class="form-item">
    	<input type="text" name="yzm" class="itemInput yzmInput" placeholder="验证码" value="" id="">
    	<a href="#" class="yzm">获取验证码</a>
    	<span style="display: none;">59s后重新发送</span>
    </div> 
	-->
	<!--
    <div class="form-check"><label><input type="checkbox" class="check" value="" name="">我已阅读并接受<a href="#">《国家工商总局》</a></label></div>
	-->
    <!--当用户输入时候去掉btn_disabled-->
    <div class="form-btn"><input disabled="disabled" type="submit" value="下一步，完善个人信息" id="" class="itemInput btn btn_disabled btn_primary" ></div>
    <div class="form-text fn-tac">已有账号<a href="/ahuhr/user/toLogin.do">请登录</a></div>
    <!--错误提示，没有输的时候ui-bg-black80,输入有误的时候ui-bg-red80-->
    <div class="ui-tips ui-bg-black80" id="error_msg"></div>
</section>
<!--表单结束-->
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script type="text/javascript" src="../js/register1.js"></script>
</body>
</html>
