package org.design.pattern.chapter4;

import java.io.Serializable;

/**
 * 日志数据对象
 * 
 * @author YAO
 */

public class LogModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 日志 编号
	 */
	private String logId;
	/**
	 * 操作人员
	 */
	private String operatorUser;
	/**
	 * 操作时间，以yyyy-MM-dd HH:mm:ss的格式记录
	 */
	private String operateTime;
	/**
	 * 日志内容
	 */
	private String logContent;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOperatorUser() {
		return operatorUser;
	}

	public void setOperatorUser(String operatorUser) {
		this.operatorUser = operatorUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	@Override
	public String toString() {
		return "LogModel [logId=" + logId + ", operatorUser=" + operatorUser
				+ ", operateTime=" + operateTime + ", logContent=" + logContent
				+ "]";
	}

}
