package org.design.pattern.chapter7;

/**
 * 抽象工厂，创建订单主、子记录对应的DAO对象
 * 
 * @author YAO
 * 
 */
public abstract class DAOFactory {

	/**
	 * 创建订单主记录对应的DAO对象
	 * 
	 * @return
	 */
	public abstract OrderMainDAO createOrderMainDAO();

	/**
	 * 创建订单子记录对应的DAO对象
	 * 
	 * @return
	 */
	public abstract OrderDetailDAO createOrderDetailDAO();
}
