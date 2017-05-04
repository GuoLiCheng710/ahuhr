<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="initial-scale=1,maximum-scale=1, user-scalable=no">
<link href="../css/reset.css" rel="stylesheet" type="text/css">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<link href="../css/animate.css" rel="stylesheet" type="text/css">
<link href="../private_css/style.css" rel="stylesheet" type="text/css">
<link href="../private_css/animate.css" rel="stylesheet" type="text/css">
<title>AHUHR</title>
</head>

<body>
<section class="ui-msg ui-suc">
	<div class="icon_area"><i></i></div>
	<div class="text_area"><h2>提交成功</h2><p class="msg_desc"><span class="fn-pl-10 ui-text-orange count-down">5</span> 秒后回到到主页</p></div>
	<div class="tips_area br5">
		<h3>温馨提示</h3>
		<ul>
			<li>感谢您提供的信息！</a></li>
			<li>点击<a href="/ahuhr/user/main.do">个人中心</a>快速回到主页</li>
			<li>点击<a href="/ahuhr/case/toInfoList.do?type=0">我的招聘</a>回到我的招聘</li>
			<li>点击<a href="/ahuhr/case/toInfoList.do?type=1">招聘信息</a>回到招聘信息</li>
			<li>点击<a href="/ahuhr/case/toRelRec.do">发布信息</a>继续发布信息</li>
		</ul>
	</div>
</section>
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script>
$(function(){
	var count = 5;
	setInterval(function(){
		$('.count-down').empty().text(count);
		count--;
		if(count == -1){
			window.location.href = '/ahuhr/user/main.do';
		}
	},1000);
});
</script>
</body>
</html>
