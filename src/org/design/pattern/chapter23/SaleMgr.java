package org.design.pattern.chapter23;

public class SaleMgr extends SaleHandler {

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//进行真正的业务逻辑处理
		System.out.println(user + "保存了" + customer + 
				"购买" + " [商品名称=" + saleModel.getGoods() + ",销售数量=" + saleModel.getSaleNum() + "]" + "的销售数据");
		return true;
	}

}
