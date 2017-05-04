<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!doctype html>
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
<section class="ui-userbg">
	<div class="userbg-content tbsite">
        <div class="pic-content"><img src="../images/tximg.jpg"></div>
        <div class="info-content wb-f1"><h4>${user.userName }</h4><p></p></div>
        <div><a href="#"><b class="icon-arrow icon-arrow-right"></b></a></div>
        <!--<div class="btns_area fn-mt-15"><a href="login.html" class="btn btn_plain_white">登录</a></div>-->
    </div>
    <div class="wava"><img src="../images/userbg_wava.png"></div>
</section>
<section class="ui-card ui-itlist">
	<div class="ui-main">
		<article class="ui-item">
			<a class="flex-sb align-items">
                <h3><i class="icon20 icon_wdts"></i>我的招聘</h3>
                <p><b class="icon-arrow icon-arrow-right"></b></p>
            </a>
		</article>
		<article class="ui-item">
			<a class="flex-sb align-items"">
                <h3><i class="icon20 icon_wdjb"></i>招聘信息</h3>
                <p><b class="icon-arrow icon-arrow-right"></b></p>
            </a>
		</article>
		<article class="ui-item">
			<a class="flex-sb align-items"">
                <h3><i class="icon20 icon_zhsz"></i>发布信息</h3>
                <p><b class="icon-arrow icon-arrow-right"></b></p>
            </a>
		</article>
	</div>
	<div class="for_info" hidden>${user.id }</div>
</section>
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script type="text/javascript" src="../scripts/cookie_util.js"></script>

<script type="text/javascript" src="../js/person.js"></script>

</body>
</html>
