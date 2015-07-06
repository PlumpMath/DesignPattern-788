package org.design.pattern.chapter12;

import java.util.Observable;

/**
 * 报纸对象。具体的目标实现
 * @author YAO
 *
 */
public class NewsPaper extends Observable {
	/**
	 * 报纸的具体内容
	 */
	private String content;
	
	/**
	 * 获取报纸的具体内容
	 * @return
	 */
	public String getContent() {
		return content;
	}
	
	
	public void setContent(String content) {
		this.content = content;
		//内容有了，说明又出报纸了，那就通知所有的读者
		//注意在用Java中的Observer模式的时候，下面这句话不可少
		this.setChanged();
		//然后主动通知，这里用的是推的方式
		this.notifyObservers(this.content);
		//如果用拉的方式，这么调用
//		this.notifyObservers();
	}
}
