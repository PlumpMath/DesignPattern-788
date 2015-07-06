package org.design.pattern.chapter10;
/**
 * 声卡类，一个同事类
 * @author YAO
 *
 */
public class SoundCard extends Colleague {
	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	/**
	 * 按照声频数据发出声音
	 * @param data
	 */
	public void soundData(String data) {
		System.out.println("画外音:" + data);
	}
}
