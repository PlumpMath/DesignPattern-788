package org.design.pattern.chapter5;
/**
 * 懒汉式单例实现的实例
 * @author Yao
 *
 */
public class Singleton {
	/**
	 * 定义一个变量来存储创建好的类实例
	 */
	private static Singleton uniqueInstance = null;
	/**
	 * 私有化构造方法，可以在内部控制创建实例的数目
	 */
	private Singleton() {
		
	}
	/**
	 * 定义一个方法来为客户端提供类实例
	 * @return 一个Singleton的实例
	 */
	public static synchronized Singleton getInstance() {
		//判断存储实例的变量是否有值
		if (uniqueInstance == null) {
			//如果没有，就创建一个类实例，并把值赋值给类实例的变量
			uniqueInstance = new Singleton();
		}
		
		//如果有值，那就直接使用
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
