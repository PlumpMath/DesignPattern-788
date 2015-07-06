package org.design.pattern.chapter2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
	/**
	 * ���崴��Api����ķ���
	 * @param condition
	 * @return �����õ�Api����
	 */
	public static Api createApi() {
		
		//ֱ�Ӷ�ȡ�����ļ�����ȡ��Ҫ����ʵ������
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = Factory.class.getResourceAsStream("FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("װ�ع��������ļ������ˣ�����Ķ�ջ��Ϣ���£�");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//�÷���ȥ����
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
