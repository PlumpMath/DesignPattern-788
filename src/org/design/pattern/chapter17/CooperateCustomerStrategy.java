package org.design.pattern.chapter17;

/**
 * 具体算法实现，为战略合作客户计算应报的价格
 * @author YAO
 *
 */
public class CooperateCustomerStrategy implements Strategy {

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("对于战略合作客户，统一折扣20%");
		return goodsPrice * (1- 0.2);
	}

}
