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

<body class="ui-bodybottom">
	<header class="ui-headerbar oneheader">
		<a href="javascript:history.back(-1)" class="hnicon_back"><i></i></a>
		<h2 class="fn-tal wb-f1">发布信息</h2>
	</header>
	<!--错误提示，没有输的时候ui-bg-black80,输入有误的时候ui-bg-red80-->
    <div class="ui-tips ui-bg-black80" id="error_msg">哈哈哈</div>
	<div class="cardbox">
		<!--表单-->
		<section class="ui-card lineborder ui-cellslist">
			<div class="ui-main" style="height:600px">
				<article class="ui-item">
		            <div class="name">发布人：</div>
		            <div class="form flex-sb"><input name="release_per"value="" type="text" class="itemInput" placeholder="例：09人力丁宏飞（必填）"></div>
		        </article>
		        <article class="ui-item">
		            <div class="name">职位：</div>
		            <div class="form flex-sb"><input name="job" value="" type="text" class="itemInput" placeholder="填写职位名称（必填）"></div>
		        </article>
		        <article class="ui-item">
		            <div class="name">公司：</div>
		            <div class="form flex-sb"><input name="company" value="" type="text" class="itemInput" placeholder="填写公司名称（必填）"></div>
		        </article>
				<article class="ui-item">
		            <div class="name">地点：</div>
		            <div class="form flex-sb"><input name="base" value="" type="text" class="itemInput" placeholder="填写城市名称（必填）"></div>
		        </article>
				<!--
		        <article class="ui-item">
		            <div class="name">进口标志</div>
		            <div class="form flex-fs cells_label">
		                <label class="radio">
		                    <div class="hdname"><input type="radio" value="" name="b"><i class="icon_checked"></i></div>
		                    <div class="bdname"><p>国产</p></div>
		                </label>
		                <label class="radio">
		                    <div class="hdname"><input type="radio" value="" name="b" checked="checked"><i class="icon_checked"></i></div>
		                    <div class="bdname"><p>进口</p></div>
		                </label>
		            </div>
		        </article>
				-->
		        <article class="ui-item">
		            <div class="name">薪资：</div>
		            <div class="form flex-sb"><input name="salary" value="" type="text" class="itemInput" placeholder="填写薪资范围 （必填）"></div>
		        </article>
		        <article class="ui-item">
		            <div class="name" style="height:110px;line-height:110px">职位描述：</div>
		            <div class="form flex-sb"><textarea name="job_detail" placeholder="填写职位要求等" class="itemInput itemTextArea"></textarea></div>
		        </article>
				<article class="ui-item">
		            <div class="name" style="height:110px;line-height:110px">其他信息：</div>
		            <div class="form flex-sb"><textarea name="other_info" placeholder="例：具体见www.dhf.com" class="itemInput itemTextArea"></textarea></div>
				<!--
		        <article class="ui-item">
		            <div class="name">单位</div>
		            <div class="form flex-sb align-items">
		                <select class="itemInput itemSelect"><option>千克</option><option>毫升</option></select><i class="icon-arrows-ud icon-arrows-down"></i>
		            </div>
		        </article>
		        <article class="ui-item">
		            <div class="name">消费金额</div>
		            <div class="form flex-sb"><input value="" type="number" class="itemInput" placeholder=""><span>元</span></div>
		        </article>
		        <article class="ui-item">
		            <div class="name">消费时间</div>
		            <div class="form flex-sb"><input type="date" class="itemInput" name="" placeholder=""></div>
		        </article>
		        <article class="ui-item">
		            <div class="name">事发地点</div>
		            <div class="form flex-sb"><input type="text" class="itemInput" name="" placeholder="填写事发地点"></div>
		        </article>
		        <article class="ui-item">
		            <div class="name">投诉内容</div>
		            <div class="form flex-sb"><textarea placeholder="填写投诉内容" class="itemInput itemTextArea"></textarea></div>
		        </article>
		        <article class="ui-item">
		            <div class="name">诉求内容</div>
		            <div class="form flex-sb"><textarea placeholder="填写诉求内容" class="itemInput itemTextArea"></textarea></div>
		        </article>
				
		        <article class="ui-item">
		            <a href="#" class="btnall icon_file"><i class="icon30"></i>添加附件</a>
		            <input title="点击选择文件" id="" multiple="" accept="*/*" type="file" name="" class="txsite" style="opacity:0; top: 10px; cursor:pointer;">
		        </article>
		        <article class="ui-item textlr">
	    			<div class="name wb-f1 fn-text-overflow">电子扫描件.jpg</div>
	    			<div class="form flex-fe text"><a href="#" class="ui-text-red">删除</a></div>
	    		</article>
	    		<article class="ui-item textlr">
	    			<div class="name wb-f1 fn-text-overflow">现场拍的照片.jpg</div>
	    			<div class="form flex-fe text"><a href="#" class="ui-text-red">删除</a></div>
	    		</article>
		        <article class="ui-item">
		            <div class="name">验证码</div>
		            <div class="form flex-sb"><input placeholder="vcode" type="text" class="itemInput"><img src="../images/img/vcode.jpg" class="yzm_img"></div>
		        </article>
				-->
		    </div>
		</section>
	</div>
	
	<!-- 底部操作按钮 -->
	<section class="ui-bottombar actionbar flex-sb">
		<!--<a href="company.html" class="btn btn_plain_primary">上一步</a>-->
		<a class="btn btn_primary" style="padding:0 40px;position:absolute;left:33%">提交</a>
	</section>
	
	<script type="text/javascript" src="../scripts/jquery_1.10.2.js"></script>
	<script type="text/javascript" src="../js/release_rec.js"></script>
	
</body>
</html>
