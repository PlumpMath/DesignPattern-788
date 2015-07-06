package org.design.pattern.chapter17;

/**
 * 价格管理，主要完成计算向客户所报价格的功能
 * @author YAO
 *
 */
public class Price {

	private Strategy strategy = null;
	
	public Price(Strategy aStrategy) {
		this.strategy = aStrategy;
	}
	
	
	/**
	 * 报价，对不同类型的，计算不同的价格
	 * @param goodsPrice
	 * @param customerType
	 * @return
	 */
	public double quote(double goodsPrice) {
		return this.strategy.calcPrice(goodsPrice);
		
	}
	

}






























