/**
 * �־ò㣨���ݲ㣩
 */
package com.dhf.ahuhr.dao;

import com.dhf.ahuhr.entity.User;

public interface UserDao {
	User findUserByUserCode(String userCode);
	int findUserById(int id);
}
