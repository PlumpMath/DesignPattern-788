package org.design.pattern.chapter15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 组合对象，通常需要存储子对象，定义有子部件的部件行为 并实现在Component里面定义的与子部件有关的操作
 * 
 * @author YAO
 * 
 */
public class Composite extends Component {

	private List<Component> childComponents = null;

	private String name = "";

	public Composite(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addChild(Component child) {
		// 延迟初始化
		if (childComponents == null) {
			childComponents = new ArrayList<>();
		}
		childComponents.add(child);

		// 先判断组件路径是否为空，如果为空，说明本组件是根组件
		if (this.getComponentPath() == null
				|| this.getComponentPath().trim().length() == 0) {
			// 把本组件的name设置到组件路径中
			this.setComponentPath(this.name);
		}

		// 判断要加入的组件在路径上是否出现过
		// 先判断是否是根组件
		if (this.getComponentPath().startsWith(child.getName() + ".")) {
			// 说明是根组件，重复添加了
			throw new IllegalArgumentException("在本通路上，组件'" + child.getName()
					+ "' 已经被添加过了");

		} else {
			if (this.getComponentPath().indexOf("." + child.getName()) < 0) {
				// 表示没有出现过，那么可以加入
				// 计算组件的路径
				String componentPath = this.getComponentPath() + "."
						+ child.getName();
				// 设置子组件的路径
				child.setComponentPath(componentPath);
			} else {
				throw new IllegalArgumentException("在本通路上，组件'"
						+ child.getName() + "' 已经被添加过了");
			}
		}

		// 添加对父组件的引用
		child.setParent(this);
	}

	public void removeChild(Component child) {
		if (childComponents != null) {
			// 查找到要删除的组件在集合中的索引位置
			int idx = childComponents.indexOf(child);
			if (idx != -1) {
				// 先把被删除的商品类别对象的父商品类别，
				// 设置成为被删除的商品类别的子类别的父商品类别
				for (Component c : child.getChildren()) {
					// 删除的组件对象是本实例的一个子组件对象
					c.setParent(this);
					// 把被伤处的商品类别对象的子组件对象添加到当前实例中
					childComponents.add(c);
				}

				// 真的删除
				childComponents.remove(idx);
			}
		}
	}

	public List<Component> getChildren() {
		return childComponents;
	}

	public Component getChildren(int index) {
		if (childComponents != null) {
			if (index >= 0 && index < childComponents.size()) {
				return childComponents.get(index);
			}
		}
		return null;
	}

	/**
	 * 输出组合对象自身的结构
	 * 
	 * @param preStr
	 */
	public void printStruct(String preStr) {
		System.out.println(preStr + "+" + this.name);
		// 如果还包含有子组件，那么就输出这些子组件对象
		if (this.childComponents != null) {
			// 添加一个空格，表示向后缩近一个空格
			preStr += "  ";
			for (Component c : childComponents) {
				c.printStruct(preStr);
			}
		}
	}

}
