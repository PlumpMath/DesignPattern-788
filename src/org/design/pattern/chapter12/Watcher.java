package org.design.pattern.chapter12;

/**
 * 具体的观察者实现
 * @author YAO
 *
 */
public class Watcher implements WatcherObserver {
	/**
	 * 职务
	 */
	private String job;
	
	@Override
	public void update(WaterQualitySubject subject) {
		//这里采用的是拉的方式
		System.out.println(job + "获取到通知，当前污染级别为:"
				+ subject.getPolluteLevle());

	}

	@Override
	public void setJob(String job) {
		this.job = job;

	}

	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return this.job;
	}

}
