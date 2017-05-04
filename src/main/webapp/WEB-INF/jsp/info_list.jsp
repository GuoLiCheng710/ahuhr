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

<body class="ui-bodytop">
<!-- 搜索头部 -->
<header class="ui-headerbar oneheader">
    <a href="/ahuhr/user/main.do" class="hnicon_back"><i></i></a>
    <h2 class="fn-tal">${page_title }</h2>
</header>
<!-- 搜索结果 -->
<div class="cardbox">

	<!--
	<section class="ui-card lineborder ui-textlist">
		<div class="ztbg deal"></div>-- 已处理 -- 
		<div class="ztbg deal_on"></div> 处理中 - 
		<div class="ui-main ui-tlmain">
			<article><span class="fn-font-12">0001</span></article>
			<article><span class="fn-font-16b">北京葫芦娃网络有限公司</span></article>
			<article><em>职位：</em>java软件开发</article>
			<article><em>日期：</em>2017.01.12</article>
		</div>
		<footer class="ui-foot percent_half">
	        <a href="see_detail.html" class="icon_detail"><i class="icon20"></i>查看详情</a>
			<a href="xxx.html" class="icon_comment"><i class="icon20"></i>停止招聘</a>
	    </footer>
	</section>
	-->
	<!-- 
	<section class="ui-card lineborder ui-textlist my-rec-list">
		<div class="ui-main ui-tlmain">
			<article><span class="fn-font-12">0001</span></article>
			<article><span class="fn-font-16b">北京葫芦娃网络有限公司111</span></article>
			<article><em>职位：</em>java软件开发</article>
			<article><em>日期：</em>2017.01.12</article>
		</div>
		<footer class="ui-foot">
	        <a href="/ahuhr/case/toDetail.do" class="icon_detail"><i class="icon20"></i>查看详情</a>
	    </footer>
	</section>
	 -->
	<div class="for_info" hidden>${user.id }</div>
	<div class="page_type" hidden>${page_type }</div>
</div>
<!-- 正在加载 -->
<!-- 
<div class="loadering"><span class="quarters-loader"></span>loader...</div>
 -->
<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
<script type="text/javascript" src="../js/info_list.js"></script>
</body>
</html>
