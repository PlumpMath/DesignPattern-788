package org.design.pattern.chapter13;

/**
 * 服务员，负责组合菜单，负责组装每个菜和具体的实现者
 * 还负责执行调用，相当于标准Command模式的Client和Invoker
 * @author YAO
 *
 */
public class Waiter {
	/**
	 * 持有一个宏命令对象——菜单
	 */
	private MenuCommand menuCommand = new MenuCommand();
	
	/**
	 * 客户点菜
	 * @param cmd
	 */
	public void orderDish(CookCommand cmd) {
		//添加到菜单中
		menuCommand.addCommand(cmd);
	}
	
	/**
	 * 客户点菜完毕，表示要执行命令了，这里就是执行菜单这个组合命令
	 */
	public void orderOver() {
		this.menuCommand.execute();
	}
	
}
