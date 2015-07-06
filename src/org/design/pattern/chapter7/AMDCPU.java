package org.design.pattern.chapter7;
/**
 * Intel的CPU实现
 * @author YAO
 *
 */
public class AMDCPU implements CPUApi {
	/**
	 * CPU的针脚数目
	 */
	private int pins = 0;
	/**
	 * 构造函数，传入CPU的针脚数目
	 * @param pins
	 */
	public AMDCPU(int pins) {
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("Now in AMD CPU, pins = " + pins);

	}

}
