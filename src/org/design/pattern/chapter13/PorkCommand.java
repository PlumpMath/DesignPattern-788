package org.design.pattern.chapter13;

/**
 * 命令对象，蒜泥白肉
 * @author YAO
 *
 */
public class PorkCommand implements CookCommand {
	/**
	 * 持有具体做菜的厨师的对象
	 */
	private CookApi cookApi = null;
	
	/**
	 * 点菜的桌号
	 */
	private int tableNum;
	
	public PorkCommand(int tableNum) {
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
		this.cookApi.cook(tableNum, "蒜泥白肉");

	}

	@Override
	public int getTableNum() {
		// TODO Auto-generated method stub
		return this.tableNum;
	}

}
