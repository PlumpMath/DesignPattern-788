package org.design.pattern.chapter2;

public class Client {

	public static void main(String[] args) {
		//通过简单工厂来获取接口接口对象
		Api api = Factory.createApi();
		api.operation("哈哈，不要紧张，只是个测试而已");
	}
}
