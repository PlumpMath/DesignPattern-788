package org.design.pattern.chapter17;

/**
 * 把日志记录到数据库
 * 
 * @author YAO
 * 
 */
public class FileLog extends LogStrategyTemplate {

	@Override
	public void doLog(String msg) {

		System.out.println("现在把 '" + msg + "'记录到文件中");
	}

}
