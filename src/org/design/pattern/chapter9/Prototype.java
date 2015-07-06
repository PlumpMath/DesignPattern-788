package org.design.pattern.chapter9;

public interface Prototype {

	public Prototype clone();
	
	public String getName();
	
	public void setName(String name);
}
