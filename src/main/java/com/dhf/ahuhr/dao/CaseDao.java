package com.dhf.ahuhr.dao;

import java.util.List;
import java.util.Map;

import com.dhf.ahuhr.entity.CaseInfo;

public interface CaseDao {
	List<Map<String, Object>> findRecListByUserId(int userId);
	CaseInfo findCaseByCaseId(int caseId);
	List<Map<String, Object>> findAllRecList();
	int saveRecInfo(CaseInfo caseInfo);
}
