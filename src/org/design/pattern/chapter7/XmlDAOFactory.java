package org.design.pattern.chapter7;

public class XmlDAOFactory extends DAOFactory {

	@Override
	public OrderMainDAO createOrderMainDAO() {
		// TODO Auto-generated method stub
		return new XmlMainDAOImpl();
	}

	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		// TODO Auto-generated method stub
		return new XmlDetailDAOImpl();
	}

}
