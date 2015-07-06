package org.design.pattern.chapter2;

public interface Api {
	/**
	 *  具体功能方法的定义
	 * @param s
	 */
	public void operation(String s);
	
	public void rollback();

}
