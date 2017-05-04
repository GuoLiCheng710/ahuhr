package com.dhf.ahuhr.entity;

import java.io.Serializable;
import java.sql.Date;

public class CaseInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private int userId;
	private String releasePer;
	private String job;
	private String base;
	private String company;
	private String salary;
	private String jobDetail;
	private String otherInfo;
	private char status;
	private Date createTime;
	public CaseInfo() {
		
	}
	public CaseInfo(int id, int userId, String releasePer, String job, String base, String company, String salary,
			String jobDetail, String otherInfo, char status, Date createTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.releasePer = releasePer;
		this.job = job;
		this.base = base;
		this.company = company;
		this.salary = salary;
		this.jobDetail = jobDetail;
		this.otherInfo = otherInfo;
		this.status = status;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getReleasePer() {
		return releasePer;
	}
	public void setReleasePer(String releasePer) {
		this.releasePer = releasePer;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJobDetail() {
		return jobDetail;
	}
	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CaseInfo other = (CaseInfo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Case [id=" + id + ", userId=" + userId + ", releasePer=" + releasePer + ", job=" + job + ", base="
				+ base + ", company=" + company + ", salary=" + salary + ", jobDetail=" + jobDetail + ", otherInfo="
				+ otherInfo + ", status=" + status + ", createTime=" + createTime + "]";
	}
	
	

}
