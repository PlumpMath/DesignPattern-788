package org.design.pattern.chapter10;
/**
 * 显卡类，一个同事类
 * @author YAO
 *
 */
public class VideoCard extends Colleague {
	public VideoCard(Mediator mediator) {
		super(mediator);
	}
	/**
	 * 显示视频数据
	 * @param data
	 */
	public void showData(String data) {
		System.out.println("您正观看的是:" + data);
	}
}
