package org.design.pattern.chapter9;

public class ConcretePrototype1 implements Prototype {
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
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}
	
	public String toString() {
		return "Now in the ConcretePrototype1, name=" + this.name;
	}
 
}
