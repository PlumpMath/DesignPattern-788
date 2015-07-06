package org.design.pattern.chapter4;

import java.util.List;

/**
 * 定义操作日志的应用接口，为了实例的简单，只是简单地定义了增删改查的方法
 * @author YAO
 *
 */
public interface LogDbOperateApi {
	/**
	 * 新增日志
	 * @param lm
	 */
	public void createLog(LogModel lm);
	/**
	 * 修改日志
	 * @param lm
	 */
	public void updateLog(LogModel lm);
	
	/**
	 * 删除日志
	 * @param lm
	 */
	public void removeLog(LogModel lm);
	/**
	 * 获取所有的日志
	 * @return 所有的日志对象
	 */
	public List<LogModel> getAllLog();
}
