package org.design.pattern.chapter13;

/**
 * 运算类，真正实现加减法运算
 * @author YAO
 *
 */
public class Operation implements OperationApi {
	/**
	 * 记录运算的结果
	 */
	private int result;
	
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public void setResult(int result) {
		this.result = result;

	}

	@Override
	public void add(int num) {
		//实现加法功能
		result += num;
	}

	@Override
	public void substract(int num) {
		//实现减法功能
		result -= num;

	}

}
