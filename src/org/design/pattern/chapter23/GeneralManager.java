package org.design.pattern.chapter23;

public class GeneralManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		// 总经理的权限很大，只要请求到了这里，他都可以处理
		if (fee >= 1000) {
			// 为了测试，简单点，只同意小李的
			if ("小李".equals(user)) {
				str = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
			} else {
				// 其他人一律不同意
				str = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
			}
		} else {
			// 如果还有后续的处理对象，继续传递
			if (this.successor != null) {
				return successor.handleFeeRequest(user, fee);
			}
		}

		return str;
	}

	@Override
	public boolean handlePreFeeRequest(String user, double fee) {
		// 总经理的权限最大，处理10000以上
		if (fee > 10000) {
			// 工作需要嘛，统统同意
			System.out.println("总经理同意" + user + "预支差旅费用" + fee + "元的请求");
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
