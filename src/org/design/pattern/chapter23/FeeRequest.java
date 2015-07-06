package org.design.pattern.chapter23;

/**
 * 处理聚餐费用申请的对象
 * @author YAO
 *
 */
public class FeeRequest {

	/**
	 * 提交聚餐费用申请给项目经理
	 * @param user
	 * @param fee
	 * @return
	 */
	public String requestToProjectManager(String user, double fee) {
		String str = "";
		if (fee < 500) {
			//项目经历的权限比较小，只能在500以内
			str = this.projectHandle(user, fee);
		} else if (fee < 1000) {
			//部门经理的权限只能在1000以内
			str = this.depManagerHandle(user, fee);
		} else if (fee >= 1000) {
			//总经理的权限很大，只要请求到了这里，他都可以处理
			str = this.generalManagerHandle(user, fee);
		}
		return str;
	}
	
	/**
	 * 项目经理审批费用申请
	 * @param user
	 * @param fee
	 * @return
	 */
	private String projectHandle(String user, double fee) {
		String str = "";
		//为了测试，简单点，只同意小李的
		if ("小李".equals(user)) {
			str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
		} else {
			//其他人一律不同意
			str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
		}
		return str;
	}
	
	/**
	 * 部门经理审批费用申请
	 * @param user
	 * @param fee
	 * @return
	 */
	private String depManagerHandle(String user, double fee) {
		String str = "";
		//为了测试，简单点，只同意小李的
		if ("小李".equals(user)) {
			str = "部门经理同意" + user + "聚餐费用" + fee + "元的请求";
		} else {
			//其他人一律不同意
			str = "部门经理不同意" + user + "聚餐费用" + fee + "元的请求";
		}
		return str;
	}
	
	/**
	 * 总经理审批费用申请
	 * @param user
	 * @param fee
	 * @return
	 */
	private String generalManagerHandle(String user, double fee) {
		String str = "";
		//为了测试，简单点，只同意小李的
		if ("小李".equals(user)) {
			str = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
		} else {
			//其他人一律不同意
			str = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
		}
		return str;
	}
}
