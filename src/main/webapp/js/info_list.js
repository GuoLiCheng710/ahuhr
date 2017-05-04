$(function(){
	dhf = {
		getMyRecList : function(){
			//var userId = $('.for_info').text();
			var url = '/ahuhr/case/getMyRecList.do';
			var param = {};
			$.post(url,param,function(result){
				if(result.status == 0){
					var myRecList = result.data;
					dhf.updataListView(myRecList);
					
				} else {
					
				}
			});
		},
		getAllRecList : function(){
			var url = '/ahuhr/case/getAllRecList.do';
			var param = {};
			$.post(url,param,function(result){
				if(result.status == 0){
					var allRecList = result.data;
					dhf.updataListView(allRecList);
					
				} else {
					
				}
			});
		},
		updataListView : function(list){
			var body = $('.cardbox').empty();
			var templet = '<section class="ui-card lineborder ui-textlist">'+
								'<div class="ui-main ui-tlmain">'+
									'<article><span class="fn-font-12 case-id">info.id</span></article>'+
									'<article><span class="fn-font-16b">info.company</span></article>'+
									'<article><em>职位：</em>info.job</article>'+
									'<article><em>日期：</em>info.createTime</article>'+
								'</div>'+
								'<footer class="ui-foot">'+
									'<a href="/ahuhr/case/toDetail.do?caseId=info.id" class="icon_detail">'+//href="/ahuhr/case/toDetail.do"
										'<i class="icon20"></i>查看详情'+
									'</a>'+
								'</footer>'+
						  '</section>';
			for(var i=0;i<list.length;i++){
				var rec_info = list[i];
				var section = templet.replace('info.id',rec_info.id)
								  	 .replace('info.company',rec_info.company)
								     .replace('info.job',rec_info.job)
								     .replace('info.createTime',rec_info.createTime)
								     .replace('info.id',rec_info.id);
				body.append(section);
			}
		},
		choosePage : function(){
			var pageType = $('.page_type').text();
			if(pageType == '0'){
				dhf.getMyRecList();
			} else {
				dhf.getAllRecList();
			}
		}
	};
	//初始化列表
	dhf.choosePage();
	
});

