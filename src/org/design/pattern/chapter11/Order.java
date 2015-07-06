package org.design.pattern.chapter11;

/**
 * 订单对象
 * 
 * @author YAO
 * 
 */
public class Order implements OrderApi {
	/**
	 * 订单订购的产品名称
	 */
	private String productName;
	/**
	 * 订单订购的数量
	 */
	private int orderNum;
	/**
	 * 创建订单的人员
	 */
	private String orderUser;

	public Order(String productName, int orderNum, String orderUser) {
		super();
		this.productName = productName;
		this.orderNum = orderNum;
		this.orderUser = orderUser;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return this.productName;
	}

	@Override
	public void setProductName(String productName, String user) {
		this.productName = productName;

	}

	@Override
	public int getOrderNum() {
		// TODO Auto-generated method stub
		return this.orderNum;
	}

	@Override
	public void setOrderNum(int orderNum, String user) {
		// TODO Auto-generated method stub
		this.orderNum = orderNum;
	}

	@Override
	public String getOrderUser() {
		// TODO Auto-generated method stub
		return this.orderUser;
	}

	@Override
	public void setOrderUser(String orderUser, String user) {
		this.orderUser = orderUser;

	}
	
	public String toString() {
		return "productName=" + this.getProductName() 
			+ ",orderNum=" + this.getOrderNum()
			+ ",orderUser=" + this.getOrderUser();
	}

}
