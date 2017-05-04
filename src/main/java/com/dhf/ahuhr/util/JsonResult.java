package com.dhf.ahuhr.util;

import java.io.Serializable;

public class JsonResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int SUCCESS = 0;
	public static final int ERROR = 1;
	
	private int status;
	private Object data;
	private String message;
	public JsonResult() {
		
	}
	public JsonResult(Exception e){
		status = ERROR;
		data = "";
		message = e.getMessage();
	}
	public JsonResult(Object data){
		status = SUCCESS;
		this.data = data;
		message = "";
	}
	public JsonResult(int status, String data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", data=" + data + ", message=" + message + "]";
	}
	
	
	
}
