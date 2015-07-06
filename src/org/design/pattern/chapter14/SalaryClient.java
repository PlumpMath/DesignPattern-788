package org.design.pattern.chapter14;

import java.util.Collection;
import java.util.Iterator;

public class SalaryClient {
	
	public static void main(String[] args) {
		//访问集团的工资列表
		PayManager payManager = new PayManager();
		//先计算再获取
		payManager.calcPay();
		Collection<PayModel> payList = payManager.getPayList();
		Iterator<PayModel> it = payList.iterator();
		System.out.println("集团工资列表：");
		while (it.hasNext()) {
			PayModel payModel = (PayModel) it.next();
			System.out.println(payModel);
		}
		
		//访问新收购公司的工资列表
		SalaryManager salaryManager = new SalaryManager();
		//先计算再获取
		salaryManager.calcSalary();
		PayModel[] pms = salaryManager.getPays();
		System.out.println("新收购的公司工资列表：");
		for (int i = 0; i < pms.length; i++) {
			System.out.println(pms[i]);
		}
	}

}
