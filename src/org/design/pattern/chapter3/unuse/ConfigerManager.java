package org.design.pattern.chapter3.unuse;
/**
 * 示意配置管理，就是负责读取配置文件
 * 并把配置文件的内容设置到配置Model中，是个单例
 * @author YAO
 *
 */
public class ConfigerManager {
	private static ConfigerManager manager = null;
	private static ConfigModel cm = null;
	private ConfigerManager() {
		//
	}
	
	public static ConfigerManager getInstance() {
		if (manager == null) {
			manager = new ConfigerManager();
			cm = new ConfigModel();
			//读取配置文件，把值设置到ConfigModel中去，这里省略了
		}
		return manager;
	}
	/**
	 * 获取配置的数据
	 * @return 配置的数据
	 */
	public ConfigModel getConfigData() {
		return cm;
	}

}
