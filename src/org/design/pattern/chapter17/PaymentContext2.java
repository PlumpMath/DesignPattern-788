package org.design.pattern.chapter17;

/**
 * 扩展的支付上下文对象
 * @author YAO
 *
 */
public class PaymentContext2 extends PaymentContext {
	/**
	 * 银行帐号
	 */
	private String account = null;
	
	/**
	 * 构造方法，传入被支付工资的人员，应支付的金额和具体的支付策略
	 * @param userName
	 * @param money
	 * @param strategy
	 * @param account
	 */
	public PaymentContext2(String userName, double money,
			PaymentStrategy strategy, String account) {
		super(userName, money, strategy);
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	

}
