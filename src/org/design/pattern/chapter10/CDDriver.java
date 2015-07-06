package org.design.pattern.chapter10;

/**
 * 光驱类，一个同事类
 * 
 * @author YAO
 * 
 */
public class CDDriver extends Colleague {

	public CDDriver(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 光驱读取出来的数据
	 */
	private String data = "";

	/**
	 * 获得光驱读取出来的数据
	 * 
	 * @return 光驱读取出来的数据
	 */
	public String getData() {
		return this.data;
	}

	public void readCD() {
		// 逗号前是视频显示的数据，逗号后是声音
		this.data = "设计模式,值得好好研究";

		// 通知主板，自己的状态发生了改变
		this.getMedietor().changed(this);
	}

}
