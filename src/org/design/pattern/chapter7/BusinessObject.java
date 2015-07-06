package org.design.pattern.chapter7;

public class BusinessObject {

	public static void main(String[] args) {

		//创建DAO的抽象工厂
		DAOFactory df = new RdbDAOFactory();
		//通过抽象工厂来获取需要的DAO接口
		OrderMainDAO mainDao = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		//调用DAO来完成数据存储的功能
		mainDao.saveOrderMain();
		detailDAO.saveOrderDetail();
		
	}

}
