/**
 * service��
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
			throw new UserException("��¼��Ϊ��");
		}
		if(StringUtil.isNull(password)){
			throw new UserException("����Ϊ��");
		}
		User user = userDao.findUserByUserCode(userCode);
		if(user == null){
			throw new UserException("�û�������");
		}
		if(!user.getPassword().equals(MD5Util.saltMD5(password))){
			throw new UserException("�������");
		}
		return user;
	}
	
	public User registerFirst(String userCode, String password, String email) throws UserException {
		if(StringUtil.isNull(userCode)){
			throw new UserException("��¼��Ϊ��");
		}
		if(StringUtil.isNull(password)){
			throw new UserException("����Ϊ��");
		}
		if(StringUtil.isNull(email)){
			throw new UserException("emailΪ��");
		}
		User user = new User();
		user.setUserCode(userCode);
		user.setPassword(password);
		user.setEmail(email);
		
		return user;
	}

	
	
}
