package org.design.pattern.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令队列类
 * @author YAO
 *
 */
public class CommandQueue {
	/**
	 * 新添加的，文件名称
	 */
	private final static String FILE_NAME = "CmdQueue.txt";
	/**
	 * 用来存储命令对象的队列
	 */
	private static List<CookCommand> cmds = null;
	
	static {
		//获取上次没有做完的命令队列
		cmds = FileOpeUtil.readFile(FILE_NAME);
		if (cmds == null) {
			cmds = new ArrayList<CookCommand>();
		}
	}
	
	/**
	 * 服务员传过来一个新的菜单，需要同步
	 * 因为同时会有很多的服务员传入菜单，而同时又有很多厨师在从队列里取值
	 * @param menu
	 */
	public synchronized static void addMenu(MenuCommand menu) {
		//一个菜单对象包含很多命令对象
		for (CookCommand cmd : menu.getCommands()) {
			cmds.add(cmd);
		}
		
		//记录请求日志
		FileOpeUtil.writeFile(FILE_NAME, cmds);
	}
	
	/**
	 * 厨师从命令队列里面获取命令对象进行处理，也是需要同步的
	 * 
	 */
	public synchronized static CookCommand getOneCommand() {
		CookCommand cmd = null;
		if (cmds.size() > 0) {
			//取出队列的第一个，因为是约定的按照加入的先后来处理
			cmd = cmds.get(0);
			//同时从队列里面取掉这个命令对象
			cmds.remove(0);
			
			//记录请求日志
			FileOpeUtil.writeFile(FILE_NAME, cmds);
		}
		return cmd;
	}

}
