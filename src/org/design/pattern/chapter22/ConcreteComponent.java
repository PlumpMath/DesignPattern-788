package org.design.pattern.chapter22;

import java.util.Date;

public class ConcreteComponent extends Component {

	@Override
	public double calcPrize(String user, Date begin, Date end) {
		// 这是一个默认的实现，默认没有奖金
		return 0;
	}

}
