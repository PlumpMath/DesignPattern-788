package org.design.pattern.chapter9;

/**
 * 个人订单对象
 * @author YAO
 *
 */
public class PersonalOrder implements OrderApi {
	/**
	 * 订购人姓名
	 */
	private String customerName;
	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 订单产品数量
	 */
	private int orderProductNum = 0;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
		return "本个人订单的订购人是=" + this.customerName
				+ ",订购产品是=" + this.productId + ",订购数量为=" + this.orderProductNum;
	}

	@Override
	public OrderApi cloneOrder() {
		// 创建一个新的订单，然后把本实例的数据复制过去
		PersonalOrder order = new PersonalOrder();
		order.setCustomerName(this.customerName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		return order;
	}

}
