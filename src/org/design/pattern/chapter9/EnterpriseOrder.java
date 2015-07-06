package org.design.pattern.chapter9;

/**
 * 个人订单对象
 * 
 * @author YAO
 * 
 */
public class EnterpriseOrder implements OrderApi {
	/**
	 * 订购人姓名
	 */
	private String enterpriseName;
	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 订单产品数量
	 */
	private int orderProductNum = 0;

	public String getCustomerName() {
		return enterpriseName;
	}

	public void setCustomerName(String customerName) {
		this.enterpriseName = customerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public int getOrderProductNum() {
		return this.orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;

	}

	public String toString() {
		return "本企业订单的订购人是=" + this.enterpriseName + ",订购产品是=" + this.productId
				+ ",订购数量为=" + this.orderProductNum;
	}

	@Override
	public OrderApi cloneOrder() {
		// 创建一个新的订单，然后把本实例的数据复制过去
		EnterpriseOrder order = new EnterpriseOrder();
		order.setCustomerName(this.enterpriseName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		return order;
	}

}
