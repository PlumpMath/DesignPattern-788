package org.design.pattern.chapter10;

/**
 * CPU类，一个同事类
 * 
 * @author YAO
 * 
 */
public class CPU extends Colleague {
	/**
	 * 分解出来的视频数据
	 */
	private String videoData = "";
	/**
	 * 分解出来的声音数据
	 */
	private String soundData = "";

	public CPU(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 获取分解出来的视频数据
	 * 
	 * @return
	 */
	public String getVideoData() {
		return this.videoData;
	}

	/**
	 * 获取分解出来的声音数据
	 * 
	 * @return
	 */
	public String getSoundData() {
		return this.soundData;
	}

	public void executeData(String data) {
		// 把数据分解开，前面的是视频数据，后面的是音频数据
		String[] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		// 通知主板，CPU的工作完成
		this.getMedietor().changed(this);
	}
}
