package org.design.pattern.chapter7;

public class RdbDAOFactory extends DAOFactory {

	@Override
	public OrderMainDAO createOrderMainDAO() {
		// TODO Auto-generated method stub
		return new RdbMainDAOImpl();
	}

	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		// TODO Auto-generated method stub
		return new RdbDetailDAOImpl();
	}

}
