package org.design.pattern.chapter13;

import java.io.Serializable;

/**
 * 命令对象，绿豆排骨煲
 * @author YAO
 *
 */
public class ChopCommand implements CookCommand, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 持有具体做菜的厨师的对象
	 */
	private CookApi cookApi = null;
	
	/**
	 * 点菜的桌号
	 */
	private int tableNum;
	
	public ChopCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	@Override
	public int getTableNum() {
		return this.tableNum;
	}
	
	/**
	 * 设置具体做菜的厨师的对象
	 * @param cookApi
	 */
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	@Override
	public void execute() {
		this.cookApi.cook(tableNum, "绿豆排骨煲");

	}


}
