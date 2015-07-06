package org.design.pattern.chapter23;

/**
 * 封装销售单的数据，简单地示意一下
 * 
 * @author YAO
 * 
 */
public class SaleModel {
	/**
	 * 销售的数量
	 */
	private int saleNum;
	/**
	 * 销售的商品
	 */
	private String goods;

	public int getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

}
