package org.design.pattern.chapter2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
	/**
	 * 具体创建Api对象的方法
	 * @param condition
	 * @return 创建好的Api对象
	 */
	public static Api createApi() {
		
		//直接读取配置文件来获取需要创建实例的类
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = Factory.class.getResourceAsStream("FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("装载工厂配置文件出错了，具体的堆栈信息如下：");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//用反射去创建
		Api api = null;
		try {
			api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return api;
	}
	
}
