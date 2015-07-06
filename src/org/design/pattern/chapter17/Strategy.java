package org.design.pattern.chapter17;

/**
 * 策略，定义算法的接口
 * @author YAO
 *
 */
public interface Strategy {
	/**
	 * 计算应报的价格
	 * @param goodsPrice
	 * @return
	 */
	public double calcPrice(double goodsPrice);
}
