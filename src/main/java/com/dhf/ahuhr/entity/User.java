/**
 * 用户实体类
 */
package com.dhf.ahuhr.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String userCode;
	private String userName;
	private String password;
	private String mobile;
	private String email;
	private String subject;
	private String enrolYear;
	private Date createTime;
	
	public User() {
		
	}
	
	
	public User(int id, String userCode, String userName, String password, String mobile, String email, String subject,
			String enrolYear, Date createTime) {
		super();
		this.id = id;
		this.userCode = userCode;
		this.userName = userName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.subject = subject;
		this.enrolYear = enrolYear;
		this.createTime = createTime;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getEnrolYear() {
		return enrolYear;
	}


	public void setEnrolYear(String enrolYear) {
		this.enrolYear = enrolYear;
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userCode=" + userCode + ", userName=" + userName + ", password=" + password
				+ ", mobile=" + mobile + ", email=" + email + ", subject=" + subject + ", enrolYear=" + enrolYear
				+ ", createTime=" + createTime + "]";
	}
	
	

}
