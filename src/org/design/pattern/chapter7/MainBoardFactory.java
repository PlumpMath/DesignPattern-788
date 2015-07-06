package org.design.pattern.chapter7;

/**
 * 创建主板的简单工厂
 * 
 * @author YAO
 * 
 */
public class MainBoardFactory {
	/**
	 * 创建主板接口对象的方法
	 * @param type 选择主板类型的参数
	 * @return 主板接口对象的方法
	 */
	public static MainBoardApi createMainBoardApi(int type) {
		MainBoardApi mainBoard = null;
		// 根据参数来选择并创建相应的CPU对象
		if (type == 1) {
			mainBoard = new GAMainBorad(1156);
		} else if (type == 2) {
			mainBoard = new MSIMainBorad(939);
		}
		return mainBoard;
	}
}
