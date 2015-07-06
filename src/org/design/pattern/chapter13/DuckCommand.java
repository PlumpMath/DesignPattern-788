package org.design.pattern.chapter13;

import java.io.Serializable;

/**
 * 命令对象，北京烤鸭
 * @author YAO
 *
 */
public class DuckCommand implements CookCommand, Serializable {
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
	
	public DuckCommand(int tableNum) {
		this.tableNum = tableNum;
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
		this.cookApi.cook(tableNum, "北京烤鸭");

	}

	@Override
	public int getTableNum() {
		// TODO Auto-generated method stub
		return this.tableNum;
	}

}
