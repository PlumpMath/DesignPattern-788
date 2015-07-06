package org.design.pattern.chapter4;

import java.util.List;

/**
 * 日志文件操作接口
 * @author YAO
 *
 */
public interface LogFileOperateApi {
	/**
	 * 读取日志文件，从文件里面获取存储的日志列表对象
	 * @return
	 */
	public List<LogModel> readLogFile();
	/**
	 * 写日志文件，把日志列表写出到日志文件中去
	 * @param list
	 */
	public void writeLogFile(List<LogModel> list);

}
