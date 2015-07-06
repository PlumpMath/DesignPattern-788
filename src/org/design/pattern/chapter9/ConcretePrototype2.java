package org.design.pattern.chapter9;

public class ConcretePrototype2 implements Prototype {
	private String name;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public Prototype clone() {
		ConcretePrototype2 prototype = new ConcretePrototype2();
		prototype.setName(this.name);
		return prototype;
	}
	
	public String toString() {
		return "Now in the ConcretePrototype2, name=" + this.name;
	}
 
}
