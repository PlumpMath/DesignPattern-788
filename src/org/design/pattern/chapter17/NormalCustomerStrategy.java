package org.design.pattern.chapter17;

public class NormalCustomerStrategy implements Strategy {

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("对于新客户或者是普通客户，没有折扣");
		return goodsPrice;
	}

}
