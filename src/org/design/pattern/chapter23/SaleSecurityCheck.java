package org.design.pattern.chapter23;

/**
 * 进行全线检查的职责对象
 * @author YAO
 *
 */
public class SaleSecurityCheck extends SaleHandler {

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//进行权限检查，简单点，就小李能通过
		if ("小李".endsWith(user)) {
			return this.successor.sale(user, customer, saleModel);
		} else {
			System.out.println("对不起" + user + ",你没有保存销售信息的权限");
			return false;
		}
	}

}
