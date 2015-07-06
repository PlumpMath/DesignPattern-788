package org.design.pattern.chapter7;
/**
 * 创建CPU的简单工厂
 * @author YAO
 *
 */
public class CPUFactory {
	/**
	 * 创建CPU接口对象的方法
	 * @param type
	 * @return
	 */
	public static CPUApi createCPUApi(int type) {
		CPUApi cpu = null;
		//根据参数来选择并创建相应的CPU对象
		if (type == 1) {
			cpu = new IntelCPU(1156);
		} else if (type == 2) {
			cpu = new AMDCPU(939);
		}
		return cpu;
	}
}
