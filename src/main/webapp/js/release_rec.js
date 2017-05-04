$(function(){
	dhf = {
		checkRelPer : function(){
			var relPer = $('.itemInput[name=release_per]').val();
			if(relPer){
				return true;
			} else {
				$('#error_msg').addClass('ui-bg-red80').text('发布人为空');
				$('#error_msg').show().hide(2000);
				return false;
			}
		},
		checkJob : function(){
			var job = $('.itemInput[name=job]').val();
			if(job){
				return true;
			} else {
				$('#error_msg').addClass('ui-bg-red80').text('职位为空');
				$('#error_msg').show().hide(2000);
				return false;
			}
		},
		checkCompany : function(){
			var company = $('.itemInput[name=company]').val();
			if(company){
				return true;
			} else {
				$('#error_msg').addClass('ui-bg-red80').text('公司为空');
				$('#error_msg').show().hide(2000);
				return false;
			}
		},
		checkBase : function(){
			var base = $('.itemInput[name=base]').val();
			if(base){
				return true;
			} else {
				$('#error_msg').addClass('ui-bg-red80').text('地点为空');
				$('#error_msg').show().hide(2000);
				return false;
			}
		},
		checkSalary : function(){
			var salary = $('.itemInput[name=salary]').val();
			if(salary){
				return true;
			} else {
				$('#error_msg').addClass('ui-bg-red80').text('薪资为空');
				$('#error_msg').show().hide(2000);
				return false;
			}
		},
		submitInof : function(){
			if(!dhf.checkRelPer()){return;}
			if(!dhf.checkJob()){return;}
			if(!dhf.checkCompany()){return;}
			if(!dhf.checkBase()){return;}
			if(!dhf.checkSalary()){return;}
			console.log('111')
			var url = '/ahuhr/case/release/info.do';
			var param = {
				relPer 	  : $('.itemInput[name=release_per]').val(),
				job 	  : $('.itemInput[name=job]').val(),
				company   : $('.itemInput[name=company]').val(),
				base	  :	$('.itemInput[name=base]').val(),
				salary 	  : $('.itemInput[name=salary]').val(),
				jobDetail : $('.itemInput[name=job_detail]').val(),
				otherInfo : $('.itemInput[name=other_info]').val()
			};
			$.post(url,param,function(result){
				if(result.status == 0){
					if(result.data == 'ok'){
						window.location.href = '/ahuhr/case/toFormsuc.do';
					} else {
						//
					}
				} else {
					//
					$('#error_msg').addClass('ui-bg-red80');
					$('#error_msg').text(result.message).show().hide(2000);
					console.log(result.message);
				}
			});
			
		}
		//方法结束
	};
	//提交表单
	$('.btn').click(dhf.submitInof);
	
	
	
	
	
});