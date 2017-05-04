/**
 * ³Ö¾Ã²ã£¨Êý¾Ý²ã£©
 */
package com.dhf.ahuhr.dao;

import com.dhf.ahuhr.entity.User;

public interface UserDao {
	User findUserByUserCode(String userCode);
	int findUserById(int id);
}
