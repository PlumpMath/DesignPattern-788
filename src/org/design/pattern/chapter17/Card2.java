package org.design.pattern.chapter17;

/**
 * 支付银行卡
 * @author YAO
 *
 */
public class Card2 implements PaymentStrategy {
	/**
	 * 帐号信息
	 */
	private String account = "";
	
	public Card2(String account) {
		this.account = account;
	}

	@Override
	public void pay(PaymentContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("现在给" + ctx.getUserName() + "的"
				+ this.account + "帐号支付了" + ctx.getMoney() + "元");
		//连接银行，进行转账，就不去管了
	}

}
