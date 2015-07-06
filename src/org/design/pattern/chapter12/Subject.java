package org.design.pattern.chapter12;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，最为被观察者
 * @author YAO
 *
 */
public class Subject {
	/**
	 * 用来保存注册的观察者对象，也就是报纸的订阅者
	 */
	private List<Observer> readers = new ArrayList<>();
	
	/**
	 * 报纸的读者需要向报社订阅，先要注册
	 * @param reader
	 */
	public void attach(Observer reader) {
		readers.add(reader);
	}
	
	/**
	 * 报纸的读者可以取消订阅
	 * @param reader
	 */
	public void detach(Observer reader) {
		readers.remove(reader);
	}
	
	/**
	 * 当每期报纸印刷出来后，就要迅速主动地被送到读者的手中
	 */
	protected void  notifyObserver() {
		for (Observer reader : readers) {
			reader.update(this);
		}
		
	}
	
}
