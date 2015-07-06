package org.design.pattern.chapter17;

/**
 * 人民币现金支付
 * @author YAO
 *
 */
public class DollarCash implements PaymentStrategy {

	@Override
	public void pay(PaymentContext ctx) {
		System.out.println("现在给" + ctx.getUserName()
				+ "美元现金支付" + ctx.getMoney() + "元");

	}

}
