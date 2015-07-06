package org.design.pattern.chapter15;

import java.util.List;

/**
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 * 
 * @author YAO
 * 
 */
public abstract class Component {
	/**
	 * 记录父组件对象
	 */
	private Component parent = null;

	private String componentPath = "";

	public String getComponentPath() {
		return componentPath;
	}

	public void setComponentPath(String componentPath) {
		this.componentPath = componentPath;
	}

	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}

	public abstract String getName();
	
	/**
	 * 返回某个组件的子组件对象
	 * 
	 * @return 某个组件的子组件对象
	 */
	public List<Component> getChildren() {
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	/**
	 * 输出组件自身的名称
	 */
	public abstract void printStruct(String preStr);

	/**
	 * 向组合对象中加入组件对象
	 * 
	 * @param child
	 */
	public void addChild(Component child) {
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	/**
	 * 从组合对象中移除某个组件对象
	 * 
	 * @param child
	 */
	public void removeChild(Component child) {
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	/**
	 * 返回某个索引对应的组件对象
	 * 
	 * @param index
	 * @return
	 */
	public Component getChildren(int index) {
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

}
