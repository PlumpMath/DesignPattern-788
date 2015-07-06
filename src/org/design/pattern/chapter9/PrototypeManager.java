package org.design.pattern.chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 * @author YAO
 *
 */
public class PrototypeManager {
	
	private static Map<String, Prototype> map = new HashMap<String, Prototype>();
	
	private PrototypeManager(){}
	
	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		map.put(prototypeId, prototype);
	
	}
	
	public synchronized static void removeProtoype(String prototypeId) {
		map.remove(prototypeId);
	}
	
	public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
		Prototype prototype = map.get(prototypeId);
		if (prototype == null ) {
			throw new Exception("您希望获取的原型该没有注册或已被销毁");
		}
		
		return prototype;
	}
}
