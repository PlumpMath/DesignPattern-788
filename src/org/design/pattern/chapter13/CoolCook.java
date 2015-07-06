package org.design.pattern.chapter13;

/**
 * 厨师对象，做凉菜
 * @author YAO
 *
 */
public class CoolCook implements CookApi {


	@Override
	public void cook(int tableNum, String name) {
		System.out.println("凉菜" + name + "已经做好。本厨师正在装盘。");
		
	}

}
