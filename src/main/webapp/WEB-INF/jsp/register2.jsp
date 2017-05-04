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
                <a href="#step-1" class="selected" isdone="1" rel="1">
                  <label class="wizard-step">1</label>
                  <span class="wizard-description">创建账户</span>
                </a>
            </li>
            <li>
                <a href="#step-2" class="normaled" isdone="0" rel="2">
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
    <div class="form-item"><input type="email" name="username" class="itemInput" placeholder="请填写真实姓名" value="" id=""></div>  
    <div class="form-item"><input type="number" name="" class="itemInput" placeholder="请填写专业" value="" id=""></div> 
    <!--<div class="form-item"><select class="itemInput itemSelect"><option>option1</option><option>option2</option></select></div>-->
    <div class="form-item"><input type="text" name="" class="itemInput" placeholder="请填写入学年份（例：2009）" value="" id=""></div> 
	<div class="form-item"><input type="text" name="" class="itemInput" placeholder="请填写手机号（例：13899991111）" value="" id=""></div> 
    <!--当用户输入时候去掉btn_disabled-->
    <div class="form-btn"><input type="submit" value="下一步，注册成功" id=""  onclick="javascript:location='/ahuhr/user/toRegister3.do'" class="itemInput btn btn_primary"></div>
    <!--错误提示，没有输的时候ui-bg-black80,输入有误的时候ui-bg-red80-->
    <div class="ui-tips ui-bg-black80">请输入用户名</div>
</section>
<!--表单结束-->
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script type="text/javascript" src="../js/register2.js"></script>
</body>
</html>
