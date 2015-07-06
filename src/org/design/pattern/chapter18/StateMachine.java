package org.design.pattern.chapter18;

/**
 * 公共状态处理机，相当于状态模式的Context 包含所有流程使用状态模式时的公共功能
 * 
 * @author YAO
 * 
 */
public class StateMachine {

	private State state = null;

	private Object businessVO = null;

	public void doWork() {
		// 转调相应的状态对象真正完成功能处理
		this.state.doWork(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Object getBusinessVO() {
		return businessVO;
	}

	public void setBusinessVO(Object businessVO) {
		this.businessVO = businessVO;
	}

}
