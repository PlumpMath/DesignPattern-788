package org.design.pattern.chapter5;

public class Client {
	public static void main(String[] args) {
		//创建读取应用配置的对象
		AppConfig config = AppConfig.getInstance();
		
		String paramA = config.getParameterA();
		String paramB = config.getParameterB();
		System.out.println("=======使用单例模式========");
		System.out.println("paramA = " + paramA);
		System.out.println("paramB = " + paramB);
	}
}
