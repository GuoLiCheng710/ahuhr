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
	 * ��Ϣ�б�ҳ����ʾ
	 * 
	 * page_title:���ڴ�ֵ��ǰ�� �ж����ҵ���Ƹ�б�/��Ƹ��Ϣ�б�ҳ��
	 * @return
	 */
	@RequestMapping("/toInfoList.do")
	public ModelAndView toInfoList(int type,ModelMap modelMap){
		if(type == 0){
			modelMap.put("page_title", "�ҵ���Ƹ");
			modelMap.put("page_type", "0");
		} else if(type == 1){
			modelMap.put("page_title", "��Ƹ��Ϣ");
			modelMap.put("page_type", "1");
		}
		return new ModelAndView("info_list");
	}
	/**
	 * ��ȡ�ҵ���Ƹ�б�����
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
	 * ��ȡ������Ƹ��Ϣ�б�
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
	 * �鿴����ҳ�����ʾ
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
	 * ������Ϣҳ�����ʾ
	 * @return
	 */
	@RequestMapping("/toRelRec.do")
	public ModelAndView toRelRec(){
		return new ModelAndView("release_rec");
	}
	/**
	 * �ύ������Ϣ��
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
	 * ������Ϣ ���ύ�ɹ�ҳ����ʾ
	 * @return
	 */
	@RequestMapping("/toFormsuc.do")
	public ModelAndView toFormsuc(){
		return new ModelAndView("formsuc");
	}
	
}
