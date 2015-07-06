package org.design.pattern.chapter22;

public class Client {

	public static void main(String[] args) {
		//先创建计算奖金的对象
		Prize p = new Prize();
		
		//日期对象都没有用上，所以传null就可以了
		double zs = p.calPrize("张三", null, null);
		System.out.println("=============张三应得奖金：" + zs);
		
		double ls = p.calPrize("李四", null, null);
		System.out.println("=============李四应得奖金：" + ls);
		
		double ww = p.calPrize("王五", null, null);
		System.out.println("=============王五应得奖金：" + ww);

	}

}
