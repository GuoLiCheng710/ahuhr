<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!doctype html>
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
                <a href="#step-2" class="selected" isdone="0" rel="2">
                  <label class="wizard-step">2</label>
                  <span class="wizard-description">完善个人信息</span>
                </a>
            </li>
            <li>
                <a href="#step-3" class="normaled" isdone="0" rel="3">
                  <label class="wizard-step">3</label>
                  <span class="wizard-description">注册成功</span>                   
                </a>
            </li
          </ul>
      </div>
</section>
<!--步骤结束-->
<!--提示成功开始-->
<section class="ui-msg ui-suc">
	<div class="icon_area"><i></i></div>
	<div class="text_area"><h2>恭喜你，注册成功！</h2><p class="msg_desc"><span class="fn-primary" id="jumpTo">5</span>秒后跳转至登录页面</p></div>
	<div class="btns_area"><a href="/ahuhr/user/toLogin.do" class="btn btn_primary">进入登录页面</a></div>
</section>
<!--提示成功结束-->
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script>
	var count = 3;
	var myCountDown;
	$(document).ready(function () {
	    myCountDown = window.setInterval(countDown, 1000);
	});
	function countDown() {
	    $("#jumpTo").text(count);
	    count--;
	    if (count == -1) {
	       window.location.href="/ahuhr/user/toLogin.do";
	    }
}
</script>

</body>
</html>
