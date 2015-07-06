package org.design.pattern.chapter12;

/**
 * 水质观察者接口定义
 * @author YAO
 *
 */
public interface WatcherObserver {
	
	/**
	 * 被通知的方法
	 * @param subject
	 */
	public void update(WaterQualitySubject subject);
	
	/**
	 * 设置观察人员的职务
	 * @param job
	 */
	public void setJob(String job);
	
	/**
	 * 获取观察人员的职务
	 * @return
	 */
	public String getJob();
	
	
}
