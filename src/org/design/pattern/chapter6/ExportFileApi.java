package org.design.pattern.chapter6;

/**
 * 导出的文件对象的接口
 * 
 * @author Yao
 * 
 */
public interface ExportFileApi {
	/**
	 * 导出内容成为文件
	 * 
	 * @param data 需要保存的数据
	 * 
	 * @return 是否到处成功
	 */
	public boolean export(String data);

}
