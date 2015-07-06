package org.design.pattern.chapter17;

/**
 * 支付工资的上下文，每个人的工资不同，支付方式也不同
 * 
 * @author YAO
 * 
 */
public class PaymentContext {
	/**
	 * 应被支付工资的人员，简单点，用姓名来代替
	 */
	private String userName = null;
	/**
	 * 应被支付的工资金额
	 */
	private double money = 0.0;
	/**
	 * 支付工资的方式的策略接口
	 */
	private PaymentStrategy strategy = null;

	public PaymentContext(String userName, double money,
			PaymentStrategy strategy) {
		super();
		this.userName = userName;
		this.money = money;
		this.strategy = strategy;
	}
	
	public String getUserName() {
		return userName;
	}

	public double getMoney() {
		return money;
	}
	
	/**
	 * 立即支付工资
	 */
	public void payNow() {
		//使用客户希望的支付策略来支付工具
		this.strategy.pay(this);
	}
	
}
