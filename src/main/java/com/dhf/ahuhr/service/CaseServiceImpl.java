package com.dhf.ahuhr.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dhf.ahuhr.dao.CaseDao;
import com.dhf.ahuhr.dao.UserDao;
import com.dhf.ahuhr.entity.CaseInfo;
import com.dhf.ahuhr.exception.CaseException;
import com.dhf.ahuhr.util.StringUtil;

@Service("caseService")
public class CaseServiceImpl implements CaseService {
	
	@Resource
	private CaseDao caseDao;
	@Resource
	private UserDao userDao;
	
	public List<Map<String, Object>> getMyRecList(int userId) throws CaseException {
		if(StringUtil.isNull(String.valueOf(userId))){
			throw new CaseException("userIdΪ��");
		}
		int id = Integer.valueOf(userId);
		int count = userDao.findUserById(id);
		if(count != 1){
			throw new CaseException("�û�������");
		}
		return caseDao.findRecListByUserId(id);
	}

	public CaseInfo getDetail(String caseId) throws CaseException {
		if(StringUtil.isNull(caseId)){
			throw new CaseException("caseIdΪ��");
		}
		int id = Integer.valueOf(caseId);
		CaseInfo caseInfo = caseDao.findCaseByCaseId(id);
		if(caseInfo == null){
			throw new CaseException("������Ϣ������");
		}
		return caseInfo;
	}
	
	public List<Map<String, Object>> getAllRecList() throws CaseException {
		List<Map<String, Object>> list = caseDao.findAllRecList();
		return list;
	}
	
	public String releaseInfo(int userId,String relPer, String job, String company, 
			String base,String salary, String jobDetail, String otherInfo) throws CaseException {
		if(StringUtil.isNull(String.valueOf(userId))){
			throw new CaseException("userId������");
		}
		if(StringUtil.isNull(relPer)){
			throw new CaseException("������Ϊ��");
		}
		if(StringUtil.isNull(job)){
			throw new CaseException("ְλΪ��");
		}
		if(StringUtil.isNull(company)){
			throw new CaseException("��˾Ϊ��");
		}
		if(StringUtil.isNull(base)){
			throw new CaseException("��ַΪ��");
		}
		if(StringUtil.isNull(salary)){
			throw new CaseException("н��Ϊ��");
		}
		CaseInfo caseInfo = new CaseInfo();
		caseInfo.setUserId(userId);
		caseInfo.setReleasePer(relPer);
		caseInfo.setJob(job);
		caseInfo.setBase(base);
		caseInfo.setCompany(company);
		caseInfo.setSalary(salary);
		caseInfo.setJobDetail(jobDetail);
		caseInfo.setOtherInfo(otherInfo);
		caseInfo.setStatus('0');
		int count = caseDao.saveRecInfo(caseInfo);
		if(count == 1){
			return "ok";
		}
		
		return "error";
	}
}
