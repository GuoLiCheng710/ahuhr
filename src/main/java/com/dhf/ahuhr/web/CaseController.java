package com.dhf.ahuhr.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhf.ahuhr.entity.CaseInfo;
import com.dhf.ahuhr.entity.User;
import com.dhf.ahuhr.exception.CaseException;
import com.dhf.ahuhr.service.CaseService;
import com.dhf.ahuhr.util.JsonResult;

@Controller
@RequestMapping("case")
public class CaseController {
	
	@Resource
	private CaseService caseService;
	@Resource
	private HttpSession session;
	/**
	 * 信息列表页面显示
	 * 
	 * page_title:用于传值给前端 判断是我的招聘列表/招聘信息列表页面
	 * @return
	 */
	@RequestMapping("/toInfoList.do")
	public ModelAndView toInfoList(int type,ModelMap modelMap){
		if(type == 0){
			modelMap.put("page_title", "我的招聘");
			modelMap.put("page_type", "0");
		} else if(type == 1){
			modelMap.put("page_title", "招聘信息");
			modelMap.put("page_type", "1");
		}
		return new ModelAndView("info_list");
	}
	/**
	 * 获取我的招聘列表数据
	 * @param userId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getMyRecList.do")
	public JsonResult getMyRecList(){
		try {
			User user = (User)session.getAttribute("user");
			int userId = user.getId();
			List<Map<String, Object>> list = caseService.getMyRecList(userId);
			return new JsonResult(list);
		} catch (CaseException e) {
			e.printStackTrace();
			return new JsonResult(e);
		}
	}
	/**
	 * 获取所有招聘信息列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllRecList.do")
	public JsonResult getAllRecList(){
		try {
			List<Map<String, Object>> list = caseService.getAllRecList();
			return new JsonResult(list);
		} catch (CaseException e) {
			e.printStackTrace();
			return new JsonResult(e);
		}
	}
	/**
	 * 查看详情页面的显示
	 * 
	 * @return
	 */
	@RequestMapping("/toDetail.do")
	public ModelAndView toDetail(String caseId,ModelMap modelMap){
		try {
			CaseInfo caseInfo = caseService.getDetail(caseId);
			modelMap.put("caseInfo", caseInfo);
		} catch (CaseException e) {
			e.printStackTrace();
			modelMap.put("error", e);
		}
		return new ModelAndView("see_detail");
	}
	/**
	 * 发布信息页面的显示
	 * @return
	 */
	@RequestMapping("/toRelRec.do")
	public ModelAndView toRelRec(){
		return new ModelAndView("release_rec");
	}
	/**
	 * 提交发布信息表单
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/release/info.do")
	public JsonResult releaseInfo(String relPer,String job,String company,
			String base,String salary,String jobDetail,String otherInfo){
		User user = (User)session.getAttribute("user");
		int userId = user.getId();
		try {
			String flag = caseService.releaseInfo(userId, relPer, job, company, base,
												  salary, jobDetail, otherInfo);
			return new JsonResult(flag);
		} catch (CaseException e) {
			e.printStackTrace();
			return new JsonResult(e);
		}
	}
	/**
	 * 发布信息 表单提交成功页面显示
	 * @return
	 */
	@RequestMapping("/toFormsuc.do")
	public ModelAndView toFormsuc(){
		return new ModelAndView("formsuc");
	}
	
}
