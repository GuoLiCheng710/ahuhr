package com.dhf.ahuhr.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
	private static final String SALT = "ahuhr,info to public";
	public static String saltMD5(String data){
		return DigestUtils.md5Hex(SALT+data);
	}
}
