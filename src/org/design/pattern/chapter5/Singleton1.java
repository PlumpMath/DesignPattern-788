package org.design.pattern.chapter5;
/**
 * 饿汉式单例实现的实例
 * @author Yao
 *
 */
public class Singleton1 {
	/**
	 * 定义一个变量来存储创建好的类实例,直接在这里创建类实例，只能创建一次
	 */
	private static Singleton1 uniqueInstance = new Singleton1();
	/**
	 * 私有化构造方法，可以在内部控制创建实例的数目
	 */
	private Singleton1() {
		
	}
	/**
	 * 定义一个方法来为客户端提供类实例
	 * @return 一个Singleton的实例
	 */
	public static Singleton1 getInstance() {
		//直接使用已经创建好的实例
		return uniqueInstance;
	}
	/**
	 * 实例方法，单例可以有自己的操作
	 */
	public void singletonOperation() {
		//功能处理
	}
	
	private String singletonData;
	
	public String getSingletonData() {
		return singletonData;
	}

}
