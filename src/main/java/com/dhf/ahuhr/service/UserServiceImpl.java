/**
 * service层
 */
package com.dhf.ahuhr.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dhf.ahuhr.dao.UserDao;
import com.dhf.ahuhr.entity.User;
import com.dhf.ahuhr.exception.UserException;
import com.dhf.ahuhr.util.MD5Util;
import com.dhf.ahuhr.util.StringUtil;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	public User login(String userCode, String password) throws UserException {
		if(StringUtil.isNull(userCode)){
			throw new UserException("登录名为空");
		}
		if(StringUtil.isNull(password)){
			throw new UserException("密码为空");
		}
		User user = userDao.findUserByUserCode(userCode);
		if(user == null){
			throw new UserException("用户不存在");
		}
		if(!user.getPassword().equals(MD5Util.saltMD5(password))){
			throw new UserException("密码错误");
		}
		return user;
	}
	
	public User registerFirst(String userCode, String password, String email) throws UserException {
		if(StringUtil.isNull(userCode)){
			throw new UserException("登录名为空");
		}
		if(StringUtil.isNull(password)){
			throw new UserException("密码为空");
		}
		if(StringUtil.isNull(email)){
			throw new UserException("email为空");
		}
		User user = new User();
		user.setUserCode(userCode);
		user.setPassword(password);
		user.setEmail(email);
		
		return user;
	}

	
	
}
