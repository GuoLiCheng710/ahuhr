package com.dhf.ahuhr.service;

import java.util.List;
import java.util.Map;

import com.dhf.ahuhr.entity.CaseInfo;
import com.dhf.ahuhr.exception.CaseException;

public interface CaseService {
	List<Map<String, Object>> getMyRecList(int userId) throws CaseException;
	CaseInfo getDetail(String caseId) throws CaseException;
	List<Map<String, Object>> getAllRecList() throws CaseException;
	String  releaseInfo(int userId,String relPer,String job,String company,
			String base,String salary,String jobDetail,String otherInfo) throws CaseException;
}
 