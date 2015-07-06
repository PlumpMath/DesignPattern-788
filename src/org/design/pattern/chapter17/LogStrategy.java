package org.design.pattern.chapter17;

/**
 * 日志记录策略的接口
 * @author YAO
 *
 */
public interface LogStrategy {

	/**
	 * 记录日志
	 * @param msg
	 */
	public void log(String msg);
}
