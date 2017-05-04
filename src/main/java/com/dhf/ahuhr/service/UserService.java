package com.dhf.ahuhr.service;


import com.dhf.ahuhr.entity.User;
import com.dhf.ahuhr.exception.UserException;

public interface UserService {
	User login(String userCode,String password) throws UserException;
	User registerFirst(String userCode,String password,String email) throws UserException;
}
