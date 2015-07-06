package org.design.pattern.chapter7;
/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 * @author YAO 
 * 
 */
public interface AbstractFactory {
	/**
	 * 创建CPU的对象
	 * @return Cpu的对象
	 */
	public CPUApi createCpuApi();
	/**
	 * 创建主板的对象
	 * @return 主板的对象
	 */
	public MainBoardApi createMainBoardApi();

}
