package org.design.pattern.chapter23;

/**
 * 定义职责对象的接口
 * @author YAO
 *
 */
public abstract class SaleHandler {
	/**
	 * 持有下一个处理请求的对象
	 */
	protected SaleHandler successor = null;
	
	public void setSuccessor(SaleHandler successor) {
		this.successor = successor;
	}
	
	/**
	 * 处理保存销售信息的请求
	 * @param user
	 * @param customer
	 * @param saleModel
	 * @return
	 */
	public abstract boolean sale(String user, String customer, SaleModel saleModel);
}
