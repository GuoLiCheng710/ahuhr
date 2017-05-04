$(function(){
	dhf = {
		checkCode : function(){
			var userCode = $('input[name="usercode"]').val();
			var reg = /^\w{3,6}$/;
			if(reg.test(userCode)){
				return true;
			} else {
				return false;
			}
		},
		checkPwd : function(){
			var pwd = $('input[name="password"]').val();
			var reg = /^\w{6,10}$/;
			if(reg.test(pwd)){
				return true;
			} else {
				return false;
			}
		},
		checkConPwd : function(){
			var pwd = $('input[name="password"]').val();
			var con_pwd = $('input[name="confirm_password"]').val();
			if(pwd == con_pwd){
				return true;
			} else {
				return false;
			}
		},
		checkEmail : function(){
			var email = $('input[name="email"]').val();
			var reg = /^(\w)+(\.\w+)*@(\w)+((\.\w+)+)$/;
			if(reg.test(email)){
				return true;
			} else {
				$('#error_msg').addClass('ui-bg-red80').text('email错误');
				$(".loginform .ui-tips").show().hide(3000);
				return false;
			}
		},
		//当输入框失去焦点时判断下一步按钮是否显示为可用,当登录名，密码，确认密码都正确时可用
		changeBtn : function(){
			//debugger;
			if(dhf.checkCode()+dhf.checkPwd()+dhf.checkConPwd() == 3){
				$('.form-btn').find('input').removeAttr('disabled').removeClass('btn_disabled');
			}
		},
		registerFirst : function(){
			//检查登录名、密码、确认密码、邮箱格式，有错误时无法提交
			if(dhf.checkCode()+dhf.checkPwd()+dhf.checkConPwd()+dhf.checkEmail() != 4){
				return;
			}
			var userCode = $('input[name="usercode"]').val();
			var pwd = $('input[name="password"]').val();
			var email = $('input[name="email"]').val();
			
			var url = '/ahuhr/user/register/first.do';
			var param = {
					"userCode" : $('input[name="usercode"]').val(),
					"password" : $('input[name="password"]').val(),
					"email"    : $('input[name="email"]').val()
			};
			$.post(url,param,function(result){
				if(result.status == 0){
					if(result.data == 'ok'){
						window.location.href = '/ahuhr/user/toRegister2.do';
					}
				} else if(result.status == 1){
					$('#error_msg').addClass('ui-bg-red80').text(result.message);
					$(".loginform .ui-tips").show().hide(3000);
				}
			});
		}
	};
	//下一步按钮的可用性控制
	$('input').blur(dhf.changeBtn);
	//输入的email格式检查
	$('input').eq(3).blur(dhf.checkEmail);
	//点击“下一步，完善个人信息”（register1）
	$('.form-btn').find('input').click(dhf.registerFirst);
	
	
});