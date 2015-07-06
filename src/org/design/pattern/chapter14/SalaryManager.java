package org.design.pattern.chapter14;

/**
 * 被客户方收购的那个公司的工资管理类
 * @author YAO
 *
 */
public class SalaryManager extends Aggregate {
	/**
	 * 用数组管理
	 */
	private PayModel[] pms = null;
	
	/**
	 * 获得工资列表
	 * @return
	 */
	public PayModel[] getPays() {
		return pms;
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ArrayIteratorImpl(this);
	}
	
	/**
	 * 获取索引所对应的元素
	 * @param index 索引
	 * @return 索引所对应的元素
	 */
	public Object get(int index) {
		Object retObj = null;
		if (index < pms.length) {
			retObj = pms[index];
		}
		return retObj;
	}
	
	/**
	 * 获取聚合对象的大小
	 * @return 聚合对象的大小
	 */
	public int size() {
		return this.pms.length;
	}
	
	/**
	 * 计算工资，其实应该有很多参数，为了演示从简
	 */
	public void calcSalary() {
		//计算工资，并把工资信息填充到工资列表中
		//为了测试，输入些数据进去
		PayModel pm1 = new PayModel();
		pm1.setPay(3800);
		pm1.setUserName("王五");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(5800);
		pm2.setUserName("赵六");
		
		pms = new PayModel[2];
		pms[0] = pm1;
		pms[1] = pm2;
	}

	
}
