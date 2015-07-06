package org.design.pattern.chapter7;
/**
 * 装机方案一：AMD的CPU + 微星的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 * @author zhengzhongcheng
 *
 */
public class Schema2 implements AbstractFactory {

	@Override
	public CPUApi createCpuApi() {
		// TODO Auto-generated method stub
		return new IntelCPU(939);
	}

	@Override
	public MainBoardApi createMainBoardApi() {
		// TODO Auto-generated method stub
		return new GAMainBorad(939);
	}

}
