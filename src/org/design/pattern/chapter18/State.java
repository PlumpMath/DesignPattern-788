package org.design.pattern.chapter18;

/**
 * 公共状态接口
 * @author YAO
 *
 */
public interface State {
	/**
	 * 执行状态对应的功能处理
	 * @param ctx
	 */
	public void doWork(StateMachine ctx);
}
