<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<body class="ui-bodytop">
<!--头部-->
<header class="ui-headerbar oneheader">
	<!-- 这里返回上一步的时候需要判断，返回我的招聘list/招聘信息list-->
	<a href="javascript:history.back(-1)" class="iconback"><i class="icon20"></i></a>
	<h2 class="fn-tac">查看详情</h2>
</header>
<div class="cardbox">
	<!--详情信息-->
	<section class="ui-card lineborder ui-cellslist">
		<header>
			<h2 class="fn-font-16b wb-f1"><i class="blue"></i>招聘详情</h2>
			<span class="round round_left"></span>
			<span class="round round_right"></span>
		</header>
		<div class="ui-main">
			<article class="ui-item">
	    		<div class="name">发布人：</div>
	    		<div class="form flex-sb text">${caseInfo.releasePer }</div>
	    	</article>
	    	<article class="ui-item">
	    		<div class="name">职位：</div>
	    		<div class="form flex-sb text">${caseInfo.job }</div>
	    	</article>
	    	<article class="ui-item">
	    		<div class="name">地点：</div>
	    		<div class="form flex-sb text">${caseInfo.base }</div>
	    	</article>
	    	<article class="ui-item">
	    		<div class="name">公司：</div>
	    		<div class="form flex-sb text">${caseInfo.company }</div>
	    	</article><article class="ui-item">
	    		<div class="name">薪资：</div>
	    		<div class="form flex-sb text">${caseInfo.salary }</div>
	    	</article>
	    	<article class="ui-item">
	    		<div class="name">职位描述：</div>
	    		<div class="form flex-sb textarea">${caseInfo.jobDetail }</div>
	    	</article>
	    	<article class="ui-item">
	    		<div class="name">其他信息：</div>
	    		<div class="form flex-sb textarea">${caseInfo.otherInfo }</div>
	    	</article>
	    </div>
	</section>
	<!--回复内容-->
	<!--
    <section class="ui-card lineborder ui-cellslist">
    	<header>
    		<h2 class="fn-font-16b wb-f1"><i class="green"></i>回复内容</h2>
			<span class="round round_left"></span>
			<span class="round round_right"></span>
    	</header>
    	<div class="ui-main">
    		<article class="ui-item">
	    		<div class="name">回复时间</div>
	    		<div class="form flex-sb text"><a href="#">2017.01.15</a></div>
	    	</article>
	    	<article class="ui-item">
	    		<div class="name">回复详情</div>
	    		<div class="form flex-sb textarea">消费者去年办理的480元一年包年的宽带服务，今年未要求开通网络，但联通公司继续为其开通消费者尚未办理注销。</div>
	    	</article>
    	</div>
    </section>
	-->
</div>
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
</body>
</html>
