package org.design.pattern.chapter14;

/**
 * 具体的迭代器实现对象，示意的是聚合对象为数组的迭代器 不同的聚合对象对应的迭代器是不一样的
 * 
 * @author YAO
 * 
 */
public class ConcreteIterator implements Iterator {
	/**
	 * 持有被迭代的具体的聚合对象
	 */
	private ConcreteAggregate aggregate;

	/**
	 * 内部索引，记录当前迭代到的索引位置 -1 表示刚开始的时候，迭代器指向聚合对象第一个对象之前
	 */
	private int index = -1;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@Override
	public void first() {
		index = 0;

	}

	@Override
	public void next() {
		if (index < this.aggregate.size()) {
			index = index + 1;
		}

	}

	@Override
	public boolean isDone() {
		if (index == this.aggregate.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return this.aggregate.get(index);
	}

}
