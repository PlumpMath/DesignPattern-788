package org.design.pattern.chapter9;

/**
 * 订单的接口
 * 
 * @author YAO
 * 
 */
public interface OrderApi {
	/**
	 * 获取订单产品的数量
	 * 
	 * @return
	 */
	public int getOrderProductNum();

	/**
	 * 设置订单产品的数量
	 * 
	 * @param num
	 *            订单产品数量
	 */
	public void setOrderProductNum(int num);

	/**
	 * 克隆方法
	 * 
	 * @return 订单原型的实例
	 */
	public OrderApi cloneOrder();

}
