package org.design.pattern.chapter3.use;
/**
 * 外观对象
 * @author YAO
 *
 */
public class Facade {
	/**
	 * 示意方法，满足客户需要的功能
	 */
	public void test() {
		//在内部实现的时候，可能会调用到内部的多个模块
		AModuleApi a = new AModuleImpl();
		a.testA();
		BModuleApi b = new BModuleImpl();
		b.testB();
		CModuleApi c = new CModuleImpl();
		c.testC();
	}
	
	public void generate() {
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}

}
