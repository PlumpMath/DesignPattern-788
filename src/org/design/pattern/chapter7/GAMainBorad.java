package org.design.pattern.chapter7;
/**
 * 技嘉的主板
 * @author YAO
 *
 */
public class GAMainBorad implements MainBoardApi {
	/**
	 * CPU插槽的孔数
	 */
	private int cpuHoles = 0;
	/**
	 * 构造函数，传入CPU插槽的孔数
	 * @param cpuHoles
	 */
	public GAMainBorad(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		System.out.println("Now in GAMainBorad, cpuHoles = " + cpuHoles);

	}

}
