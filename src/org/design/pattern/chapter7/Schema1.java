package org.design.pattern.chapter7;
/**
 * 装机方案一：Intel的CPU + 技嘉的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 * @author zhengzhongcheng
 *
 */
public class Schema1 implements AbstractFactory {

	@Override
	public CPUApi createCpuApi() {
		// TODO Auto-generated method stub
		return new IntelCPU(1156);
	}

	@Override
	public MainBoardApi createMainBoardApi() {
		// TODO Auto-generated method stub
		return new GAMainBorad(1156);
	}

}
