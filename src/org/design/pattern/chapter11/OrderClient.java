package org.design.pattern.chapter11;

public class OrderClient {
	
	public static void main(String[] args) {
		//张三先登录系统创建了一个订单
		Order order = new Order("设计模式", 100, "张三");
		// //李四想要来修改，那就会报错
		// order.setOrderNum(123, "李四");
		// //输出order
		// System.out.println("李四修改后订单记录没有变化：" + order);
		//
		// //张三修改就不会有问题
		// order.setOrderNum(123, "张三");
		// //输出order
		// System.out.println("张三修改后订单记录没有变化：" + order);
		
		//创建一个动态代理
		DynamicProxy dynamicProxy = new DynamicProxy();
		//然后把订单和动态代理关联起来
		OrderApi orderApi = dynamicProxy.getProxyInterface(order);
		
		// 李四想要来修改，那就会报错
		orderApi.setOrderNum(123, "李四");
		// 输出order
		System.out.println("李四修改后订单记录没有变化：" + orderApi);

		// 张三修改就不会有问题
		orderApi.setOrderNum(123, "张三");
		// 输出order
		System.out.println("张三修改后，订单记录：" + orderApi);
		
	}

}
