package com.wipro.app.vo;

public class Notification {

	private String errorCode;
	private String description;
	private String contextPath;
	private String status;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Notification [errorCode=" + errorCode + ", description=" + description + ", contextPath=" + contextPath
				+ ", status=" + status + "]";
	}
}
