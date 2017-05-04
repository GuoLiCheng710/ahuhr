$(function(){
	//点击登录如果有错误显示提示，几秒后自动消失，暂时不实现
	/*
    $(".form-btn .btn").click(function(){
    	$(".loginform .ui-tips").show();
    	$(".loginform .ui-tips").delay (2000).fadeOut();
    });
   */
	var dhf = {
		/*
		changeBtn : function(){
			var userCode = $('#userCode').val();
			var password = $('#password').val();
			var reg1 = /^\w{3,6}$/;
			var reg2 = /^\w{6,10}$/;
			if(reg1.test(userCode) && reg2.test(password)){
				return true;
			}else{
				return false;
			}
		},
		*/
		loginAction : function(){
			var userCode = $('#userCode').val();
			var password = $('#password').val();
			
			var url = '/ahuhr/user/login.do';
			var param = {'userCode':userCode,'password':password};
			$.post(url,param,function(result){
				if(result.status == 0){
					var user = result.data;
					setCookie("ahuhrcode",user.userCode);
					setCookie("ahuhrpassword",user.password);
					window.location.href = '/ahuhr/user/main.do';
				} else if(result.status == 1){
					$('#error_msg').addClass('ui-bg-red80').text(result.message);
					$(".loginform .ui-tips").show().hide(3000);
				}
			});
		}
			
	};
	//登录名和密码框失去焦点时，验证是否使按钮可点击
	$(".itemInput").focus(function(){
		$("#login-submit").removeClass("btn_disabled");
	});
	//点击登录按钮
	$("#login-submit").click(dhf.loginAction);
})