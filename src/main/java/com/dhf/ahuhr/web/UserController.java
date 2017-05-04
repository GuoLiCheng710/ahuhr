/**
 * ���Ʋ�:
 * 1.�û���½
 */
package com.dhf.ahuhr.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhf.ahuhr.entity.User;
import com.dhf.ahuhr.exception.UserException;
import com.dhf.ahuhr.service.UserService;
import com.dhf.ahuhr.util.JsonResult;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@Resource
	private HttpSession session;
	/**
	 * ��ת����¼ҳ��Ĭ����ҳ��
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping("/toLogin.do")
	public ModelAndView toLogin(){
		return new ModelAndView("login");
	}
	/**
	 * �û���½
	 * @param userCode �û���½��
	 * @param password �û���½����
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/login.do")
	public JsonResult login(String userCode,String password){
		try {
			User user = userService.login(userCode, password);
			session.setAttribute("user", user);
			return new JsonResult(user);
		} catch (UserException e) {
			e.printStackTrace();
			return new JsonResult(e);
		}
	}
	/**
	 * ��������ҳ�棨��¼�ɹ�����ת���ˣ�
	 * @return
	 */
	@RequestMapping("/main.do")
	public ModelAndView toMain(){
		return new ModelAndView("person");
	}
	
	/**
	 * ע���һ��
	 * @return
	 */
	@RequestMapping("/toRegister1.do")
	public ModelAndView toRegister1(){
		return new ModelAndView("register1");
	}
	@ResponseBody
	@RequestMapping("/register/first.do")
	public JsonResult registerFirst(String userCode,String password,String email){
		try {
			User user = userService.registerFirst(userCode, password, email);
			session.setAttribute("user", user);
			return new JsonResult("ok");
		} catch (UserException e) {
			e.printStackTrace();
			return new JsonResult(e);
			
		}
	}
	/**
	 * ע��ڶ���
	 * @return
	 */
	@RequestMapping("/toRegister2.do")
	public ModelAndView toRegister2(){
		return new ModelAndView("register2");
	}
	/**
	 * ע�������
	 * @return
	 */
	@RequestMapping("/toRegister3.do")
	public ModelAndView toRegister3(){
		return new ModelAndView("register3");
	}
	
	
	
	
}
