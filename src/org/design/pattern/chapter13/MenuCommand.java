package org.design.pattern.chapter13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 菜单对象，是个宏命令对象
 * @author YAO
 *
 */
public class MenuCommand implements CookCommand {
	/**
	 * 用来记录组合本菜单的多道菜品，也就是多个命令对象
	 */
	private Collection<CookCommand> col = new ArrayList<>();
	
	/**
	 * 点菜，把菜品加入到菜单中
	 * @param cmd
	 */
	public void addCommand(CookCommand cmd) {
		col.add(cmd);
	}
	
	@Override
	public void execute() {
		//执行菜单就是把菜单传递给后厨
		CommandQueue.addMenu(this);

	}
	
	public Collection<CookCommand> getCommands() {
		return this.col;
	}

	@Override
	public void setCookApi(CookApi cookApi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTableNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
