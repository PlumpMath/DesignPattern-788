package org.design.pattern.chapter22;

import java.util.Date;

/**
 * 装饰器对象，计算当月业务奖金
 * @author YAO
 *
 */
public class SumPrizeDecorator extends Decorator {

	public SumPrizeDecorator(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public double calcPrize(String user, Date begin, Date end) {
		//1.先获取前面运算出来的奖金
		double money = super.calcPrize(user, begin, end);
		
		//2.然后计算当月业务奖金，按人员和时间去获取当月业务，然后再乘以3%
		double prize = 1000000 * 0.01;
		System.out.println(user + "累计奖金" + prize);
		return money + prize;
	}

}
