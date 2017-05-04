/**
 * 控制层:
 * 1.用户登陆
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
	 * 跳转至登录页（默认主页）
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping("/toLogin.do")
	public ModelAndView toLogin(){
		return new ModelAndView("login");
	}
	/**
	 * 用户登陆
	 * @param userCode 用户登陆名
	 * @param password 用户登陆密码
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
	 * 个人中心页面（登录成功后跳转至此）
	 * @return
	 */
	@RequestMapping("/main.do")
	public ModelAndView toMain(){
		return new ModelAndView("person");
	}
	
	/**
	 * 注册第一步
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
	 * 注册第二部
	 * @return
	 */
	@RequestMapping("/toRegister2.do")
	public ModelAndView toRegister2(){
		return new ModelAndView("register2");
	}
	/**
	 * 注册第三部
	 * @return
	 */
	@RequestMapping("/toRegister3.do")
	public ModelAndView toRegister3(){
		return new ModelAndView("register3");
	}
	
	
	
	
}
