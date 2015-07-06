package org.design.pattern.chapter23;

public class DepManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		// 部门经理的权限只能在1000以内
		if (fee < 1000) {

			// 为了测试，简单点，只同意小李的
			if ("小李".equals(user)) {
				str = "部门经理同意" + user + "聚餐费用" + fee + "元的请求";
			} else {
				// 其他人一律不同意
				str = "部门经理不同意" + user + "聚餐费用" + fee + "元的请求";
			}
			
		} else {
			// 超过1000，继续传递给级别更高的人处理
			if (this.successor != null) {
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}
	
	@Override
	public boolean handlePreFeeRequest(String user, double fee) {
		// 部门经理只能处理5000以上
		if (fee < 10000) {
			// 工作需要嘛，统统同意
			System.out.println("部门经理同意" + user + "预支差旅费用" + fee + "元的请求");
			return true;
		} else {
			// 超过5000，继续传递给级别更高的人处理
			if (this.successor != null) {
				return this.successor.handlePreFeeRequest(user, fee);
			}
		}
		return false;
	}

}
