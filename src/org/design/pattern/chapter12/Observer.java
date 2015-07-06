package org.design.pattern.chapter12;

/**
 * 观察者，比如报纸的读者
 * @author YAO
 *
 */
public interface Observer {
	/**
	 * 被通知的方法
	 * @param subject
	 */
	public void update(Subject subject);
}
