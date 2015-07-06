package org.design.pattern.chapter14;

/**
 * 用来实现访问数组的迭代接口
 * @author YAO
 *
 */
public class ArrayIteratorImpl implements Iterator {

	private SalaryManager aggregate = null;
	
	private int index = -1;

	public ArrayIteratorImpl(SalaryManager aggregate) {
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
