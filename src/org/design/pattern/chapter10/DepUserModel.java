package org.design.pattern.chapter10;

/**
 * 描述部门和人员关系的类
 * 
 * @author YAO
 * 
 */
public class DepUserModel {
	/**
	 * 用于部门和人员关系的编号，用做主键
	 */
	private String depUserId;
	/**
	 * 人员的编号
	 */
	private String userId;
	/**
	 * 部门的编号
	 */
	private String depId;

	public String getDepUserId() {
		return depUserId;
	}

	public void setDepUserId(String depUserId) {
		this.depUserId = depUserId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

}
