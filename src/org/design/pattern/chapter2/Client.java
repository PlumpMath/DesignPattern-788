package org.design.pattern.chapter2;

public class Client {

	public static void main(String[] args) {
		//ͨ���򵥹�������ȡ�ӿڽӿڶ���
		Api api = Factory.createApi();
		api.operation("��������Ҫ���ţ�ֻ�Ǹ����Զ���");
	}
}
