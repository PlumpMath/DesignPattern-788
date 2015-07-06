package org.design.pattern.chapter7;
/**
 * Intel的CPU实现
 * @author YAO
 *
 */
public class IntelCPU implements CPUApi {
	/**
	 * CPU的针脚数目
	 */
	private int pins = 0;
	/**
	 * 构造函数，传入CPU的针脚数目
	 * @param pins
	 */
	public IntelCPU(int pins) {
		this.pins = pins;
	}
	@Override
	public void calculate() {
		System.out.println("Now in Intel CPU, pins = " + pins);

	}

}
