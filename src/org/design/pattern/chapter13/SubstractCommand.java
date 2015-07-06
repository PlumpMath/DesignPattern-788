package org.design.pattern.chapter13;

/**
 * 具体的减法命令实现对象
 * 
 * @author YAO
 * 
 */
public class SubstractCommand implements Command {
	/**
	 * 持有具体执行计算的对象
	 */
	private OperationApi operation = null;

	/**
	 * 操作的数据，也就是要加上的数据
	 */
	private int opeNum;

	public SubstractCommand(OperationApi operation, int opeNum) {
		super();
		this.operation = operation;
		this.opeNum = opeNum;
	}

	@Override
	public void execute() {
		// 转调接收者去真正执行功能，这个命令是做加法
		this.operation.substract(opeNum);

	}

	@Override
	public void undo() {
		// 转调接收者去真正执行功能
		// 命令本身是做加法，那么撤销的时候就是做减法了
		this.operation.add(opeNum);

	}

}
