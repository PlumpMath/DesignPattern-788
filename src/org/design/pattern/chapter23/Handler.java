package org.design.pattern.chapter23;

/**
 * 定义职责对象的接口
 * @author YAO
 *
 */
public abstract class Handler {
	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler successor = null;
	
	/**
	 * 设置下一个处理请求的对象
	 * @param successor
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * 处理聚餐费用的申请
	 * @param user
	 * @param fee
	 * @return
	 */
	public abstract String handleFeeRequest(String user, double fee);

	/**
	 * 处理预支差旅费用的申请
	 * @param user
	 * @param fee
	 * @return
	 */
	public abstract boolean handlePreFeeRequest(String user, double fee);
}
