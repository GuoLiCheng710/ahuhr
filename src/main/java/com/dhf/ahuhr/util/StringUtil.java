package com.dhf.ahuhr.util;

public class StringUtil {
	public static String null2Str(String str){
		return str != null ? str.trim():"";
	}
	public static boolean isNull(String str){
		str = null2Str(str);
		return str.length() == 0;
	}
}
